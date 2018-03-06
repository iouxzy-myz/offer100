/**
 * 
 */
package cn.hust.offer100.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.CenterServiceimpl;

/**
 * @author Super-mao
 *
 */

@Controller
@RequestMapping("/center")
public class CenterController {
	
	@Autowired
	private CenterServiceimpl centerService;
	
	@RequestMapping("/save")
	@ResponseBody
	public OfferResult save(Enterprise e,HttpSession session){
		e.setUserId((Integer)session.getAttribute("userId"));
		if (centerService.save(e) >0)
			return new OfferResult(200);
		else
			return new OfferResult(400,"数据有误");
				
	}
	
	@RequestMapping("/get")
	public Enterprise get(Enterprise e,HttpSession session) {
		e.setUserId((Integer) session.getAttribute("userId"));
		return centerService.get(e);
	}
	
	@RequestMapping("/update")
	public OfferResult update(Enterprise e) {
		if (centerService.update(e)>0)
			return new OfferResult(200);
		else
			return new OfferResult(400,"数据有误");
	}
	
	
}
