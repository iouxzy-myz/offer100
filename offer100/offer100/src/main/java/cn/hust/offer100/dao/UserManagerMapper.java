package cn.hust.offer100.dao;
import org.apache.ibatis.annotations.Param;

import cn.hust.offer100.pojo.User;
public interface UserManagerMapper extends BaseDao<User>{
	User findByUser(User user);
	User findByUserName(User user);
	User findByUserId(@Param(value="userId")Integer userId);
	Integer updatePassword(@Param(value="userId")Integer userId,@Param(value="newPassword")String newPassword);
}