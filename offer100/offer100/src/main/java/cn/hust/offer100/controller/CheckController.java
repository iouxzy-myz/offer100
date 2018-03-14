package cn.hust.offer100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.Check;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.CheckService;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * 
 * Function:审核控制器. <br/>
 * 
 */

@Controller
@RequestMapping("/checkController")
public class CheckController {

		@Autowired
		private CheckService checkService;
		
		/**
		 * 未审核职位.
		 */
		@RequestMapping("/findPosition")
		@ResponseBody
		public OfferResult findPositionPage(Position position){
			List<Position> list =  checkService.findPositionPage(position);
			return new OfferResult(200,"",list);
		}		
		
		/**
		 * 职位审核结果提交.
		 */
		@RequestMapping("/updatePosition")
		@ResponseBody
		public OfferResult updatePosition(@RequestBody Position p){
			 checkService.updatePosition(p);
			 return new OfferResult(200);
		}
		
		/**
		 * 未审核企业.
		 */
		@RequestMapping("/findEnterprisePage")
		@ResponseBody
		public OfferResult findEnterprisePage(){
			List<Enterprise> list =  checkService.findEnterprisePage();
			return new OfferResult(200,"",list);
		}		
		
		/**
		 * 企业审核结果提交.
		 */
		@RequestMapping("/updateEnterprise")
		@ResponseBody
		public OfferResult updateEnterprise(@RequestBody Enterprise e){
			checkService.updateEnterprise(e);
			return new OfferResult(200);
		}
		
	}

