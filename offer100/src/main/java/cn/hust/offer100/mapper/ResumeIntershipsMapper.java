package cn.hust.offer100.mapper;

import cn.hust.offer100.pojo.ResumeInterships;
import cn.hust.offer100.pojo.ResumeIntershipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeIntershipsMapper {
    int countByExample(ResumeIntershipsExample example);

    int deleteByExample(ResumeIntershipsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeInterships record);

    int insertSelective(ResumeInterships record);

    List<ResumeInterships> selectByExample(ResumeIntershipsExample example);

    ResumeInterships selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeInterships record, @Param("example") ResumeIntershipsExample example);

    int updateByExample(@Param("record") ResumeInterships record, @Param("example") ResumeIntershipsExample example);

    int updateByPrimaryKeySelective(ResumeInterships record);

    int updateByPrimaryKey(ResumeInterships record);
}