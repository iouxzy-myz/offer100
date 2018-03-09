package cn.hust.offer100.dao;

import java.util.List;
import java.util.Map;

import cn.hust.offer100.dto.Accept;
import cn.hust.offer100.pojo.Interview;
import cn.hust.offer100.pojo.Position;

public interface PositionMapper extends BaseDao<Position>{
	Integer findEnterprise(Map<String,Object> map); 
	List<Accept> findAccept(Map<String,Object> map);
	Integer updateAccept(Map<String,Object> map);
	Integer downPosition(Map<String,Object> map);
	Integer insertInterview(Interview i);
	Integer updateInterview(Interview i);
	List<Position> findAll(Map<String,Object> map);
}