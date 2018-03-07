package cn.hust.offer100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hust.offer100.dao.CheckMapper;
import cn.hust.offer100.dao.PositionMapper;
import cn.hust.offer100.pojo.Check;
import cn.hust.offer100.pojo.Position;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CheckService {
	
	@Autowired PositionMapper dao;
	
	public PageInfo<Position> findPositionPage(int currentPage ,int pageSize ,Position position){
		 PageHelper.startPage(currentPage, pageSize);
		 Position p=new Position();
		 p.setPositionStatus("0");
		 List<Position> list=dao.findList(p);
		 PageInfo<Position> dto= new PageInfo<>(list);
		 return dto;
	}
	
	public String updatePosition(Position p){
		dao.update(p);
		return "审核完成";
	}
	
    @Autowired CheckMapper checkdao;
	
	public PageInfo<Check> findEnterprisePage(int currentPage ,int pageSize ,Check check){
		 PageHelper.startPage(currentPage, pageSize);
		 Check p=new Check();
		 p.setStatus("0");
		 List<Check> list=checkdao.findList(p);
		 PageInfo<Check> dto= new PageInfo<>(list);
		 return dto;
	}
	
	public String updateEnterprise(Check p){
		checkdao.update(p);
		return "审核完成";
	}
}
