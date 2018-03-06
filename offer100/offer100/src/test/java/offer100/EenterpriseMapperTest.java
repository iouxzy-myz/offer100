/**
 * 
 */
package offer100;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hust.offer100.dao.EnterpriseMapper;
import cn.hust.offer100.pojo.Check;
import cn.hust.offer100.pojo.Enterprise;

/**
 * @author Super-mao
 *
 */
public class EenterpriseMapperTest extends BaseTest{
	
	@Autowired
	private EnterpriseMapper dao;
	
	@Test
	public void testsave()throws Exception{
		Enterprise e = new Enterprise();
		e.setUserId(5);
		e.setEnterpriseName("网易");
		e.setEnterpriseLogourl("a.png");
		e.setEnterpriseWebsite("www.wangyi.com");
		e.setEnterprisePhone("18979341587");
		e.setEnterpriseEmail("sdf@qq.com");
		e.setEnterpriseCity("杭州");
		e.setEnterpriseSector("互联网");
		e.setEnterpriseScale("2000人以上");
		e.setEnterpriseProfile("大平台");
		e.setEnterpriseDetails("国内游戏互联网公司");
		dao.save(e);
		
		//checkdao.insertCheck(c);
		
	}
	
	@Test
	public void testget() throws Exception{
		Enterprise en = new Enterprise();
		en.setUserId(5);
		System.out.print(dao.get(en).toString());
	}
	
	@Test
	public void testUpdate()throws Exception{
		Enterprise e = new Enterprise();
		e.setEnterpriseId(3);
		e.setUserId(10);
		e.setEnterpriseName("今日头条");
		e.setEnterpriseLogourl("a.png");
		e.setEnterpriseWebsite("www.wangyi.com");
		e.setEnterprisePhone("18979341587");
		e.setEnterpriseEmail("sdf@qq.com");
		e.setEnterpriseCity("杭州");
		e.setEnterpriseSector("互联网");
		e.setEnterpriseScale("1000人以上");
		e.setEnterpriseProfile("大平台");
		e.setEnterpriseDetails("国内新闻类互联网公司");
		dao.update(e);
	}

}
