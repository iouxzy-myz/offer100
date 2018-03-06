package cn.hust.offer100.dao;

import cn.hust.offer100.pojo.ResumeFundation;

public interface ResumeFundationMapper {
	ResumeFundation checkByUserId(Integer userId);
}