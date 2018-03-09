package cn.hust.offer100.dao;

import java.util.List;

public interface BaseDao<T> {
	Integer save(T t);
	Integer update(T t);
	T get(T t);
	List<T> findList(T t);
	Integer delete(T t);
}
