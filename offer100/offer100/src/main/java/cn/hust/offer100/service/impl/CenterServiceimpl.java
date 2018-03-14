/**
 * 
 */
package cn.hust.offer100.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hust.offer100.dao.EnterpriseMapper;
import cn.hust.offer100.pojo.Enterprise;

/**
 * @author Super-mao
 *
 */

@Service
public class CenterServiceimpl {
	
	@Autowired
	private EnterpriseMapper dao;
	
	public int save(Enterprise e) {
		 dao.save(e);
		return 1;
	}
	
	public Enterprise get(Enterprise e) {
		Enterprise en = dao.get(e);
		return en;
		
	}
	
	public int update(Enterprise e) {
		 dao.update(e);
		 return 1;
	}

}
