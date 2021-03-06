package cn.hust.offer100.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageInfo;

import cn.hust.offer100.dto.InterviewAccept;
import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.PositionService;



@Controller
@RequestMapping("/positionController")
public class PositionManagerController {

	@Autowired
	private PositionService positionService;
	

	@RequestMapping(value = "/findPage" ,method = RequestMethod.GET)
	@ResponseBody
//	public PageInfo<Position> findPage(int currentPage, int pageSize ,String status ,String positionName ,HttpSession session){
	public OfferResult findPage( @RequestParam(value="positionStatus") String positionStatus , @RequestParam(value="positionName" ,required=false) String positionName ,HttpSession session){
	 List<Position> lists = positionService.findPage(positionStatus, positionName ,session);
		if(lists != null)
			return new OfferResult(200,"",lists);
		else
			return new OfferResult(400,"查询失败");
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public OfferResult save(@RequestBody Position p,HttpSession session) throws ParseException{
		// SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date date=sDateFormat.parse(time);
		// p.setPositionCreattime(date);
		//暂时不需要 p.setUserId((Integer) session.getAttribute("userId"));
		p.setUserId((Integer) session.getAttribute("userId"));
		p.setPositionStatus("0");
		int affectedRows = positionService.save(p);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"职位添加失败");
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public OfferResult delete(@RequestBody Position p){
		int affectedRows =  positionService.delect(p);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"职位删除失败");
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public OfferResult update(@RequestBody Position p){
		int affectedRows =  positionService.update(p);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"更新失败");
		
	}
	/**
	 * 下线职位
	 * @param p
	 * @return
	 */
	@RequestMapping("/updatePosition")
	@ResponseBody
	@Transactional//多个写操作 加上事物
	public OfferResult downPosition(@RequestBody Position p ){
		 if(p.getPositionStatus().equals("0"))
		 {
			 p.setPositionStatus("1");
		 }
		 else if(p.getPositionStatus().equals("1"))
		 {
			 p.setPositionStatus("2");
		 }
		 else if(p.getPositionStatus().equals("2"))
		 {
			 p.setPositionStatus("0");
		 }
		int affectedRows = 0;
		if(p.getPositionStatus().equals("1"))
		{
			
			affectedRows = positionService.updatePositionStatus(p);
		}
		else if(p.getPositionStatus().equals("2"))
		{	
			positionService.updatePositionStatus(p);//更新职位状态
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("status", "2");
			map.put("reason","职位已下线");
			map.put("positionId", p.getId());
			affectedRows = positionService.downPosition(map);
		}
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"职位下线失败");
	}
	//获取单条职位信息记录
	@RequestMapping("/get")
	@ResponseBody
	public OfferResult get(Integer id){
		Position p = new Position();
		p.setId(id);
		return new OfferResult(200,"",positionService.get(p));
	}
	//面试邀请
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@RequestMapping("/interview")
	@ResponseBody
	@Transactional
	public OfferResult interview( @RequestBody InterviewAccept i ,HttpSession session ) throws ParseException{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "1");
		map.put("id", i.getPostId());//是postId
		positionService.updateAccept(map);//更新post_box为面试邀请
		
/*		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sDateFormat.parse(time);*/
		Interview interview = new Interview();
		//interview.setInterviewTime(date);
		interview.setContactPhone(i.getContactPhone());
		interview.setContactUser(i.getContactUser());
		interview.setInterviewAddress(i.getInterviewAddress());
		interview.setInterviewTime(i.getInterviewTime());
		interview.setPositionId(i.getPositionId());
		interview.setResumeId(i.getResumeId());
		interview.setUserId((Integer) session.getAttribute("userId"));
		//interview.setResumeId(resumeId);
		//interview.setPositionId(positionId);
		interview.setStatus("0");
		int affectedRows = positionService.insertInterview(interview);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"失败");


	}
	
	//重新通知
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@RequestMapping("/rest")
	@ResponseBody
	public OfferResult rest(@RequestBody Interview interview ) throws ParseException{
		
		/*SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sDateFormat.parse(time);
		
		interview.setInterviewTime(date);*/
		//interview.setInterviewTime(null);
		interview.setStatus("0");
		int affectedRows = positionService.updateInterview(interview);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"失败");
	}
		//标记未参加
		@RequestMapping("/rest/undo")
		@ResponseBody
		public OfferResult undo(@RequestBody Interview interview) throws ParseException{
	
			int affectedRows = positionService.updateInterview(interview);
			if(affectedRows > 0) {
				return new OfferResult(200);
			}
			else 
				return new OfferResult(400,"失败");
		}
		
		//获得招聘情况
		@RequestMapping("/record")
		@ResponseBody
		public OfferResult getNumber(HttpSession session) throws ParseException{
			Map<String, Object> map=new HashMap<String, Object>();
			Integer userId = (Integer) session.getAttribute("userId");
			map = positionService.getNumber(userId);
			return new OfferResult(200,"",map);

		}
}
