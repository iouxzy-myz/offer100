package cn.hust.offer100.mapper;

import cn.hust.offer100.pojo.ResumeProject;
import cn.hust.offer100.pojo.ResumeProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeProjectMapper {
    int countByExample(ResumeProjectExample example);

    int deleteByExample(ResumeProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeProject record);

    int insertSelective(ResumeProject record);

    List<ResumeProject> selectByExample(ResumeProjectExample example);

    ResumeProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeProject record, @Param("example") ResumeProjectExample example);

    int updateByExample(@Param("record") ResumeProject record, @Param("example") ResumeProjectExample example);

    int updateByPrimaryKeySelective(ResumeProject record);

    int updateByPrimaryKey(ResumeProject record);
}