package cn.hust.offer100.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.PositionService;


@CrossOrigin(origins = "http://115.156.129.209:4200", maxAge = 3600)
@Controller
@RequestMapping("/positionController")
public class PositionController {

	@Autowired
	private PositionService positionService;
	@RequestMapping("/findPage")
	@ResponseBody
	public PageInfo<Position> findPage(int currentPage, int pageSize ,String status ,String positionName ,HttpSession session){
		return positionService.findPage(currentPage, pageSize, status, positionName ,session);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(Position p,HttpSession session) throws ParseException{
		// SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date date=sDateFormat.parse(time);
		// p.setPositionCreattime(date);
		//暂时不需要 p.setUserId((Integer) session.getAttribute("userId"));
		p.setUserId(5);
		p.setPositionStatus("0");
		return positionService.save(p);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Position p){
		return positionService.delect(p);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(Position p){
		return positionService.update(p);
		
	}
	/**
	 * 下线职位
	 * @param p
	 * @return
	 */
	@RequestMapping("/downPosition")
	@ResponseBody
	@Transactional//多个写操作 加上事物
	public String downPosition(Position p){
		positionService.update(p);//更新职位状态
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "2");
		map.put("reason","职位已下线");
		map.put("positionId", p.getId());
		positionService.downPosition(map);
		return null;
	}
	//获取单条职位信息记录
	@RequestMapping("/get")
	@ResponseBody
	public Position get(Position p){
		return positionService.get(p);
	}
	//面试邀请
	@RequestMapping("/interview")
	@ResponseBody
	@Transactional
	public String interview(Interview interview, HttpSession session ,Integer resumeId ,Integer positionId,String time ) throws ParseException{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "1");
		map.put("id", positionId);
		positionService.updateAccept(map);//更新post_box为面试邀请
		
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sDateFormat.parse(time);
		
		interview.setInterviewTime(date);
		interview.setUserId((Integer) session.getAttribute("userId"));
		interview.setResumeId(resumeId);
		interview.setPositionId(positionId);
		interview.setStatus("0");
		positionService.insertInterview(interview);
		//
		return "保存成功";
	}
	
	//重新通知
	@RequestMapping("/rest")
	@ResponseBody
	public String rest(Interview interview,String time ) throws ParseException{
		
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sDateFormat.parse(time);
		
		interview.setInterviewTime(date);
		//interview.setInterviewTime(null);
		
		positionService.updateInterview(interview);
		return "修改成功";
	}

		//标记未参加
		@RequestMapping("/rest/undo")
		@ResponseBody
		public String rest(Interview interview) throws ParseException{
	
			positionService.updateInterview(interview);
			return "修改成功";
		}
}
