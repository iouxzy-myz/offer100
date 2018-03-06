package cn.hust.offer100.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.PositionService;

import com.github.pagehelper.PageInfo;



@Controller
@RequestMapping("/interns")
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
	public String save(Position p,HttpSession session){
		p.setUserId((Integer) session.getAttribute("userId"));
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
	
	
}
