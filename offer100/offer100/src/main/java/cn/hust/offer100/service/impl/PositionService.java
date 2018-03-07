package cn.hust.offer100.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hust.offer100.dao.PositionMapper;
import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PositionService {
	@Autowired PositionMapper dao;
	public String save(Position p){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("userId","1" /*p.getUserId()*/);
		
		p.setEnterpriseId(dao.findEnterprise(map));
		dao.save(p);
		return "保存成功";
	}
	
	public PageInfo<Position> findPage(int currentPage ,int pageSize ,String status ,String positionName ,HttpSession session){
		 PageHelper.startPage(currentPage, pageSize);
		 Position p=new Position();
		 p.setPositionName(positionName);
		 p.setPositionStatus(status);
		 p.setUserId((Integer) session.getAttribute("userId"));
		 List<Position> list=dao.findList(p);
		 PageInfo<Position> dto= new PageInfo<>(list);
		 return dto;
	}
	
	public String update(Position p){
		dao.update(p);
		return "修改成功";
	}
	
	public String delect(Position p){
		p.setPositionStatus("-1");
		dao.delete(p);
		return "删除成功";
	}
	
	public Position get(Position p){
		return dao.get(p);
	}
//	public PageInfo<Accept> findAccept(Map<String,Object> map){
	public List<Accept> findAccept(Map<String,Object> map){
		//PageHelper.startPage((int)map.get("currentPage"),(int)map.get("pageSize"));
		List<Accept> list=dao.findAccept(map);
		//map.put("positionStatus", "1");
		//PageInfo<Accept> dto= new PageInfo<>(list);
		return list;
	}
	
	public String updateAccept(Map<String,Object> map){
		 dao.updateAccept(map);
		 return "修改成功";
	}
	
	public String downPosition(Map<String,Object> map){
		dao.downPosition(map);
		return "修改成功";
	}
	public String insertInterview(Interview i){
		dao.insertInterview(i);
		return "保存成功";
	}
	public String updateInterview(Interview i){
		dao.updateInterview(i);
		return "修改成功";
	}
	
}
