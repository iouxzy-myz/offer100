/**
 * 
 */
package cn.hust.offer100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hust.offer100.dao.EnterpriseMapper;
import cn.hust.offer100.dao.ResumeFundationMapper;
import cn.hust.offer100.dao.UserDao;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.ResumeFundation;
import cn.hust.offer100.pojo.User;

/**
 * @author Super-mao
 *
 */

@Service
public class UserServiceImpl {
	
	@Autowired
	private ResumeFundationMapper dao;
	
	@Autowired
	private EnterpriseMapper enterprisemapper;
	
	@Autowired
	private UserDao userDao;

	public User checkLogin(User user) {
        //User u= 
        return userDao.findByUser(user);
//        if(u != null){
//            return  u;
//        }
//        else
//        	return null;
	}

	
	public int addUser(User user) {
		if(userDao.findByUserName(user) != null)
			return 0;
		else {
			int affectedRows = userDao.save(user);
			return affectedRows;
		}
	}
	
	public int changePassword(String oldPassword,String newPassword,Integer userId) {
		User user = userDao.findByUserId(userId);
		if(user != null)
		{
			if(user.getUserPassword().equals(oldPassword))
			{
				return userDao.updatePassword(userId,newPassword);
			}
			else
				return 0;
		}
		return 0;
	}
	
	//check resume
	public ResumeFundation checkByUserId(Integer userId) {
		return dao.checkByUserId(userId);
	};
	
	//check 企业信息
	
	public Enterprise checkByUserId(Enterprise t) {
		return enterprisemapper.get(t);
	}
}	
