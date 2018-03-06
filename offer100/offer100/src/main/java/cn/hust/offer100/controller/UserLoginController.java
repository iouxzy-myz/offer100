/**
 * 
 */
package cn.hust.offer100.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.User;
import cn.hust.offer100.service.impl.UserServiceImpl;

/**
 * @author Super-mao
 *
 */

@Controller
@SessionAttributes("user")
public class UserLoginController {
	

	@Autowired
	private UserServiceImpl userServivce;
	
//	@Autowired
//	private CheckService checkService;
	
	// 正常访问login页面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	// 表单提交过来的路径
	@RequestMapping("/checkLogin")
	public OfferResult checkLogin(User user, Model model,HttpSession session) {
		// 调用service方法
		User u = userServivce.checkLogin(user);
		// 若有user则添加到model里并且跳转到成功页面
		if (u != null) {
			session.setAttribute("userId", user.getUserId());
			model.addAttribute("user", user);
			if(u.getUserType().equals("普通用户")) {
				if(userServivce.checkByUserId((Integer)u.getUserId()) != null) {
					return new OfferResult(200,"登录成功","index");//跳转普通用户首页
				}
				else
					return new OfferResult(200,"登录成功","resume");//跳转简历完成页面
			}
			else if(u.getUserType().equals("企业用户")) {
				Enterprise t= new Enterprise();
				t.setUserId((Integer)u.getUserId());
				if(userServivce.checkByUserId(t) != null){
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
	// 注销登录
	@RequestMapping("/loginOut")
	public String outLogin(HttpSession session) {
		// 通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return "login";
	}
	
	// 正常访问regist页面
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
	@RequestMapping("/checkRegist")
	public OfferResult checkRegister(User user) {
		int addUserResult = userServivce.addUser(user);
		if(addUserResult > 0)
			return new OfferResult(200,"注册成功","管理员首页");
		return new OfferResult(400,"用户已存在");
	}
	
	//修改密码
		@RequestMapping("/changepassword")
		public OfferResult changePassword(String oldPassword,String newPassword,HttpSession session) {
			int userId = Integer.parseInt((String) session.getAttribute("userId"));
			int addUserResult = userServivce.changePassword(oldPassword,newPassword,userId);
			if(addUserResult > 0)
				return new OfferResult(200,"修改成功","登录页首页");
			return new OfferResult(400,"用户密码错误");
		}
	
	
}
