package cn.hust.offer100.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hust.offer100.dao.PositionManagerMapper;
import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PositionService {
	@Autowired PositionManagerMapper dao;
	public Integer save(Position p){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("userId",p.getUserId());
		
		p.setEnterpriseId(dao.findEnterprise(map));
		 dao.save(p);
		 return 1;
		
	}
	
	public Map<String, Object> getNumber(Integer userId){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("InterviewNum", dao.getInterviewNum(userId));
		map.put("PositionNum", dao.getPositionNum(userId));
		map.put("PostNum", dao.getPostNum(userId));
		map.put("interviewRecord", dao.findInterview(userId));
		return map;
		
	}
//	public PageInfo<Position> findPage(int currentPage ,int pageSize ,String status ,String positionName ,HttpSession session){
	public List<Position> findPage(String positionStatus ,String positionName ,HttpSession session){		
		 //PageHelper.startPage(currentPage, pageSize);
		 if(positionStatus.equals("0"))
		 {
			 positionStatus = "1";
		 }
		 else if(positionStatus.equals("1"))
		 {
			 positionStatus = "2";
		 }
		 else if(positionStatus.equals("2"))
		 {
			 positionStatus = "0";
		 }
		
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("positionName", positionName);
		 map.put("userId", (Integer) session.getAttribute("userId"));
		 map.put("positionStatus", positionStatus);
		 if(positionStatus.equals("0"))
			 map.put("status", "3");
		 //p.setUserId((Integer) session.getAttribute("userId"));
		 List<Position> list=dao.findAll(map);
		 //PageInfo<Position> dto= new PageInfo<>(list);
		 return list;
	}
	
	public Integer update(Position p){
		 p.setPositionStatus("0");
		 dao.update(p);
		 return 1;
	}
	
	public Integer updatePositionStatus(Position p){
		 dao.updatePositionStatus(p);
		 return 1;
	}
	
	public Integer delect(Position p){
		 p.setPositionStatus("4");
		 dao.delete(p);
		 return 1;
	}
	
	public Position get(Position p){
		return dao.get(p);
	}
//	public PageInfo<Accept> findAccept(Map<String,Object> map){
	public List<Accept> findAccept(Map<String,Object> map){
		//PageHelper.startPage((int)map.get("currentPage"),(int)map.get("pageSize"));
		map.put("positionStatus", "1");
		List<Accept> list=dao.findAccept(map);
		//map.put("positionStatus", "1");
		//PageInfo<Accept> dto= new PageInfo<>(list);
		return list;
	}
	
	public Integer updateAccept(Map<String,Object> map){
		  dao.updateAccept(map);
		  return 1;
		
	}
	
	public Integer downPosition(Map<String,Object> map){
		 dao.downPosition(map);
		 return 1;

	}
	public Integer insertInterview(Interview i){
		 dao.insertInterview(i);
		 return 1;
			

	}
	public Integer updateInterview(Interview i){
		dao.updateInterview(i);
		return 1;
		
	}
	
}
