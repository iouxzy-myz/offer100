package cn.hust.offer100.mapper;

import cn.hust.offer100.pojo.PostBox;
import cn.hust.offer100.pojo.PostBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostBoxMapper {
    int countByExample(PostBoxExample example);

    int deleteByExample(PostBoxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostBox record);

    int insertSelective(PostBox record);

    List<PostBox> selectByExample(PostBoxExample example);

    PostBox selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostBox record, @Param("example") PostBoxExample example);

    int updateByExample(@Param("record") PostBox record, @Param("example") PostBoxExample example);

    int updateByPrimaryKeySelective(PostBox record);

    int updateByPrimaryKey(PostBox record);
}