package cn.hust.offer100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import cn.hust.offer100.dao.CheckMapper;
import cn.hust.offer100.dao.EnterpriseMapper;
import cn.hust.offer100.dao.PositionManagerMapper;

import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.Position;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CheckService {
	
	@Autowired PositionManagerMapper dao;
	
	public List<Position> findPositionPage(Position position){
		 //PageHelper.startPage(currentPage, pageSize);
		 Position p=new Position();
		 p.setPositionStatus("0");
		 List<Position> list=dao.findList(p);
		 //PageInfo<Position> dto= new PageInfo<>(list);
		 return list;
	}
	
	public String updatePosition( Position p){
		dao.update(p);
		return "审核完成";
	}
	
    @Autowired CheckMapper checkdao;
    @Autowired EnterpriseMapper enterprisedao;
    
    
    
	public List<Enterprise> findEnterprisePage(){
		 //PageHelper.startPage(currentPage, pageSize);
		 Enterprise e=new Enterprise();
		 e.setStatus("0");
		 List<Enterprise> list=enterprisedao.findList(e);
		 //PageInfo<Check> dto= new PageInfo<>(list);
		 return list;
	}
	
	public String updateEnterprise(Enterprise e){
		//checkdao.update(p);
		enterprisedao.update(e);
		return "审核完成";
	}
}
