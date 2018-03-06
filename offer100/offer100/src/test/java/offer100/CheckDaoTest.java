package offer100;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//import cn.hust.offer100.dao.CheckMapper;
import cn.hust.offer100.pojo.Check;

public class CheckDaoTest extends BaseTest {
		
		@Autowired
		//private CheckDao checkdao;
		
		@Test
		public void testInsertCheck()throws Exception{
			Check c = new Check();
			c.setUserId(10);
			c.setEnterpriseName("网易");
			c.setEnterpriseEmail("46686@qq.com");
			c.setEnterpriseUrl("mm.png");
			c.setCreateTime(new Date());
			c.setStatus("0");
			//checkdao.insertCheck(c);
			
		}
}
