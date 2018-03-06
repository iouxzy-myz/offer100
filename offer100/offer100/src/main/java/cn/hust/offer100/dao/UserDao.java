/**
 * 
 */
package cn.hust.offer100.dao;

import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.User;

/**
 * @author Super-mao
 *
 */
public interface UserDao extends BaseDao<User>{
	User findByUser(User user);
	User findByUserName(User user);
	User findByUserId(Integer userId);
	int updatePassword(Integer userId,String newPassword);
}
