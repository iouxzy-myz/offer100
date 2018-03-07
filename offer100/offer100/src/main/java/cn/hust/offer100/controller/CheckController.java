package cn.hust.offer100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hust.offer100.pojo.Check;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.CheckService;
import com.github.pagehelper.PageInfo;

/**
 * 
 * Function:审核控制器. <br/>
 * 
 */

@Controller
@RequestMapping("/check")
public class CheckController {

		@Autowired
		private CheckService checkService;
		
		/**
		 * 未审核职位.
		 */
		@RequestMapping("/findPositionPage")
		@ResponseBody
		public PageInfo<Position> findPositionPage(int currentPage, int pageSize ,Position position){
			return checkService.findPositionPage(currentPage, pageSize,position);
		}		
		
		/**
		 * 职位审核结果提交.
		 */
		@RequestMapping("/updatePosition")
		@ResponseBody
		public String updatePosition(Position p){
			return checkService.updatePosition(p);
		}
		
		/**
		 * 未审核企业.
		 */
		@RequestMapping("/findEnterprisePage")
		@ResponseBody
		public PageInfo<Check> findEnterprisePage(int currentPage, int pageSize ,Check check){
			return checkService.findEnterprisePage(currentPage, pageSize, check);
		}		
		
		/**
		 * 企业审核结果提交.
		 */
		@RequestMapping("/updateEnterprise")
		@ResponseBody
		public String updateEnterprise(Check p){
			return checkService.updateEnterprise(p);
		}
		
	}

