/**
 * 
 */
package cn.hust.offer100.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.dto.PasswordAccept;
import cn.hust.offer100.dto.Register;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.User;
import cn.hust.offer100.service.impl.ManagerServiceImpl;

/**
 * @author Super-mao
 *
 */

@Controller
@RequestMapping("/loginController")
//@SessionAttributes("user")
public class ManagerLoginController {
	

	@Autowired
	private ManagerServiceImpl managerServiceImpl;
	
	
//	@Autowired
//	private CheckService checkService;
	
/*	// 正常访问login页面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}*/
	// 表单提交过来的路径
/*	@RequestMapping("/checkLogin")
	public OfferResult checkLogin(User user, Model model,HttpSession session) {
		// 调用service方法
		User u = managerServiceImpl.checkLogin(user);
		// 若有user则添加到model里并且跳转到成功页面
		if (u != null) {
			session.setAttribute("userId", user.getUserId());
			model.addAttribute("user", user);
			if(u.getUserType().equals("普通用户")) {
				if(managerServiceImpl.checkByUserId((Integer)u.getUserId()) != null) {
					return new OfferResult(200,"登录成功","index");//跳转普通用户首页
				}
				else
					return new OfferResult(200,"登录成功","resume");//跳转简历完成页面
			}
			else if(u.getUserType().equals("企业用户")) {
				Enterprise t= new Enterprise();
				t.setUserId((Integer)u.getUserId());
				if(managerServiceImpl.checkByUserId(t) != null){
					return new OfferResult(200,"登录成功","index");//跳转企业首页
				}
				else
					return new OfferResult(200,"登录成功","企业插入界面");//跳转企业完成页面
				
			}
			else if(u.getUserType().equals("管理用户")) {
				return new OfferResult(200,"登录成功","管理员首页");
			}

		}
		return new OfferResult(400,"账号或密码错误");
	}
	*/
	// 表单提交过来的路径
	@RequestMapping("/login")
	@ResponseBody
	public OfferResult checkLogin( @RequestBody User user, Model model,HttpSession session) {
		// 调用service方法
		User u = managerServiceImpl.checkLogin(user);
		// 若有user则添加到model里并且跳转到成功页面
		if (u != null) {
			session.setAttribute("userId",u.getUserId());
			session.setAttribute("userType", u.getUserType());
			session.setMaxInactiveInterval(30*60);
			//model.addAttribute("user", u);
			return new OfferResult(200,u.getUserType(),"");
		}
		return new OfferResult(400,"账号或密码错误");
	}
	
	// 注销登录
	@RequestMapping("/loginOut")
	@ResponseBody
	public OfferResult outLogin(HttpSession session) {
		// 通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return new OfferResult(200);
	}
	
	/*// 正常访问regist页面
	@RequestMapping("/regist")
	public String regist() {
		return "register";
	}
	//跳转到普通用户注册界面
	@RequestMapping("/person")
	public String personRegist() {
		return "registerperson";
	}
	//跳转到企业用户注册界面
	@RequestMapping("/company")
	public String companyRegist() {
		return "registercompany";
	}
	//注册用户
*/	
	@RequestMapping("/regist")
	@ResponseBody
	public OfferResult checkRegister(@RequestBody Register r) {
		User user = new User();
		Enterprise e = new Enterprise();
		user.setUserName(r.getUserName());
		user.setUserPassword(r.getUserPassword());
		user.setUserType("企业用户");
		e.setEnterpriseCity(r.getEnterpriseCity());
		e.setEnterpriseDetails(r.getEnterpriseDetails());
		e.setEnterpriseEmail(r.getUserName());
		e.setEnterpriseName(r.getEnterpriseName());
		e.setEnterprisePhone(r.getEnterprisePhone());
		e.setEnterpriseProfile(r.getEnterpriseProfile());
		e.setEnterpriseScale(r.getEnterpriseScale());
		e.setEnterpriseSector(r.getEnterpriseSector());
		e.setEnterpriseWebsite(r.getEnterpriseWebsite());
		e.setStatus("0");
		int addUserResult = managerServiceImpl.addUser(user,e);
		if(addUserResult > 0) {
			
			return new OfferResult(200,"注册成功","管理员首页");
		}	
		return new OfferResult(400,"用户已存在");
	}
	
	//修改密码
		@RequestMapping("/changepassword")
		@ResponseBody
//		public OfferResult changePassword(@RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword,@RequestParam("cofirmPassword") String cofirmPassword,HttpSession session) {
		public OfferResult changePassword(@RequestBody PasswordAccept password,HttpSession session) {	
		//int userId = Integer.parseInt((String) session.getAttribute("userId"));
			int addUserResult = managerServiceImpl.changePassword(password.getOldPassword(),password.getNewPassword(),(Integer)session.getAttribute("userId"));
			if(addUserResult > 0)
				return new OfferResult(200);
			else
				return new OfferResult(400,"用户密码错误");
		}
		
		//判断是否登录
		@RequestMapping("/isLogin")
		@ResponseBody
//		public OfferResult changePassword(@RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword,@RequestParam("cofirmPassword") String cofirmPassword,HttpSession session) {
		public Boolean isLogin(HttpServletRequest request) {	
		//int userId = Integer.parseInt((String) session.getAttribute("userId"));
			HttpSession session = request.getSession();
			Integer userId = (Integer) session.getAttribute("userId");
			if(userId != null)
				return true;
			return false;
		}
	
		//判断是否登录
		@RequestMapping("/isManager")
		@ResponseBody
//		public OfferResult changePassword(@RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword,@RequestParam("cofirmPassword") String cofirmPassword,HttpSession session) {
		public OfferResult isManager(HttpSession session) {	
		//int userId = Integer.parseInt((String) session.getAttribute("userId"));
			String userType = (String) session.getAttribute("userType");
			if(userType.equals("管理员"))
				return new OfferResult(200);
			return new OfferResult(400);
		}
	
}
