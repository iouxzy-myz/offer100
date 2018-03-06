package cn.hust.offer100.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.service.impl.PositionService;

import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/accept")
public class AcceptManagementController {
	@Autowired
	private PositionService positionService;
	@RequestMapping("/findAll")
	public PageInfo<Accept> findAll(int currentPage, int pageSize ,String status ,String userName ,HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("currentPage", currentPage);
		map.put("pageSize", pageSize);
		map.put("status", status);
		map.put("userId", session.getAttribute("userId"));
		map.put("userName", userName);
		return positionService.findAccept(map);
	}
	
	@RequestMapping("/updateStatus")
	public String updateStatus(String status ,int id){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", status);
		map.put("id", id);
		return positionService.updateAccept(map);
	}
}