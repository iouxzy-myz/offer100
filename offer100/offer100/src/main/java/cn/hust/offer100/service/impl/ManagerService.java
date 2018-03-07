package cn.hust.offer100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hust.offer100.dao.UserMapper;
import cn.hust.offer100.pojo.User;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional
public class ManagerService {
	@Autowired UserMapper dao;
	public String save(User p){
		dao.save(p);
		return "保存成功";
	}
	
	public List<User> findAll(){
		User t =new User();
		return dao.findList(t);
	}
	public PageInfo<User> findPage(int currentPage ,int pageSize ,String status ,String positionName){
		 PageHelper.startPage(currentPage, pageSize);
		 User p=new User();
		 List<User> list=dao.findList(p);
		 PageInfo<User> dto= new PageInfo<>(list);
		 return dto;
	}
	
	public String update(User p){
		dao.update(p);
		return "修改成功";
	}
	
	public String delect(User p){
		dao.delete(p);
		return "删除成功";
	}
}
