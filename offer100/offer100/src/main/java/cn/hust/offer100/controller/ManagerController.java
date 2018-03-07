package cn.hust.offer100.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.User;
import cn.hust.offer100.service.impl.ManagerService;

import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	@RequestMapping("/findPage")
	@ResponseBody
	public PageInfo<User> findPage(int currentPage, int pageSize ,String userName,String password){
		return managerService.findPage(currentPage, pageSize,userName,password);
	}
//	@RequestMapping("/findAll")
//	@ResponseBody
//	public Map<String,Object> findAll(){
//		Map<String,Object> users = new HashMap<String,Object>();
//		users.put("UserList", managerService.findAll());
//		return users;
//	}

	
	@RequestMapping("/save")
	@ResponseBody
	public String save(User p){
		return managerService.save(p);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(User p){
		return managerService.delect(p);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(User p){
		return managerService.update(p);
	}
	
	
}
