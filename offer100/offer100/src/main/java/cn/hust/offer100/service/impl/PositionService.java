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
	public Integer save(Position p){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("userId",5 /*p.getUserId()*/);
		
		p.setEnterpriseId(dao.findEnterprise(map));
		return dao.save(p);
		
	}
	
//	public PageInfo<Position> findPage(int currentPage ,int pageSize ,String status ,String positionName ,HttpSession session){
	public List<Position> findPage(String positionStatus ,String positionName ,HttpSession session){		
		 //PageHelper.startPage(currentPage, pageSize);
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("positionName", positionName);
		 map.put("userId", 4);
		 map.put("positionStatus", positionStatus);
		 if(positionStatus.equals("0"))
			 map.put("status", "3");
		 //p.setUserId((Integer) session.getAttribute("userId"));
		 List<Position> list=dao.findAll(map);
		 //PageInfo<Position> dto= new PageInfo<>(list);
		 return list;
	}
	
	public Integer update(Position p){
		return dao.update(p);
	}
	
	public Integer delect(Position p){
		p.setPositionStatus("-1");
		return dao.delete(p);
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
	
	public Integer updateAccept(Map<String,Object> map){
		 return dao.updateAccept(map);
		
	}
	
	public Integer downPosition(Map<String,Object> map){
		return dao.downPosition(map);

	}
	public Integer insertInterview(Interview i){
		return dao.insertInterview(i);

	}
	public Integer updateInterview(Interview i){
		return dao.updateInterview(i);
		
	}
	
}
