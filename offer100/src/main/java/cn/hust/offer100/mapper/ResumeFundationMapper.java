package cn.hust.offer100.mapper;

import cn.hust.offer100.pojo.ResumeFundation;
import cn.hust.offer100.pojo.ResumeFundationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeFundationMapper {
    int countByExample(ResumeFundationExample example);

    int deleteByExample(ResumeFundationExample example);

    int deleteByPrimaryKey(Integer resumeId);

    int insert(ResumeFundation record);

    int insertSelective(ResumeFundation record);

    List<ResumeFundation> selectByExample(ResumeFundationExample example);

    ResumeFundation selectByPrimaryKey(Integer resumeId);

    int updateByExampleSelective(@Param("record") ResumeFundation record, @Param("example") ResumeFundationExample example);

    int updateByExample(@Param("record") ResumeFundation record, @Param("example") ResumeFundationExample example);

    int updateByPrimaryKeySelective(ResumeFundation record);

    int updateByPrimaryKey(ResumeFundation record);
}