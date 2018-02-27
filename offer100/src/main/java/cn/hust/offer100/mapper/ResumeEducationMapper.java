package cn.hust.offer100.mapper;

import cn.hust.offer100.pojo.ResumeEducation;
import cn.hust.offer100.pojo.ResumeEducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeEducationMapper {
    int countByExample(ResumeEducationExample example);

    int deleteByExample(ResumeEducationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeEducation record);

    int insertSelective(ResumeEducation record);

    List<ResumeEducation> selectByExample(ResumeEducationExample example);

    ResumeEducation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeEducation record, @Param("example") ResumeEducationExample example);

    int updateByExample(@Param("record") ResumeEducation record, @Param("example") ResumeEducationExample example);

    int updateByPrimaryKeySelective(ResumeEducation record);

    int updateByPrimaryKey(ResumeEducation record);
}