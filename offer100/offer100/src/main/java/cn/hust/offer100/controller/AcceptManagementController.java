package cn.hust.offer100.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.service.impl.PositionService;

import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping("/acceptManagementController")
public class AcceptManagementController {
	@Autowired
	private PositionService positionService;
	@ResponseBody
	@RequestMapping("/findAll")
	//public PageInfo<Accept> findAll(int currentPage, int pageSize ,String status ,String userName ,HttpSession session){
	public OfferResult findAll(String status ,String userName ,HttpSession session){	
		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("currentPage", currentPage);
//		map.put("pageSize", pageSize);
//		map.put("status", status);
		map.put("positionStatus", "1");
		//map.put("userId", session.getAttribute("userId"));
		map.put("userId", 4);
		map.put("userName", userName);
		map.put("status", 0);
		List<Accept> lists = positionService.findAccept(map);
		if(lists != null)
			return new OfferResult(200,lists);
		else
			return new OfferResult(400,"查询失败");
	}
	
	@RequestMapping("/updateStatus")
	public OfferResult updateStatus(String status ,int id,String reason){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", status);
		map.put("id", id);
		map.put("reason", reason);
		int affectedRows =  positionService.updateAccept(map);
		if(affectedRows > 0) {
			return new OfferResult(200);
		}
		else 
			return new OfferResult(400,"职位添加失败");
	}
}
