package cn.hust.offer100.dao;

import java.util.List;
import java.util.Map;

import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;

public interface PositionMapper extends BaseDao<Position>{
	Integer findEnterprise(Map<String,Object> map); 
	List<Accept> findAccept(Map<String,Object> map);
	String updateAccept(Map<String,Object> map);
	String downPosition(Map<String,Object> map);
	String insertInterview(Interview i);
	String updateInterview(Interview i);
}