package cn.hust.offer100.dao;

import java.util.List;

public interface BaseDao<T> {
	int save(T t);
	int update(T t);
	T get(T t);
	List<T> findList(T t);
	int delete(T t);
}
