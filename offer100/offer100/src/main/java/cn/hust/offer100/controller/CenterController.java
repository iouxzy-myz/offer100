/**
 * 
 */
package cn.hust.offer100.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;

import cn.hust.offer100.dao.PositionManagerMapper;
import cn.hust.offer100.dto.OfferResult;
import cn.hust.offer100.pojo.Enterprise;
import cn.hust.offer100.pojo.Position;
import cn.hust.offer100.service.impl.CenterServiceimpl;

/**
 * @author Super-mao
 *
 */

@Controller
@RequestMapping("/centerController")
public class CenterController {
	
	@Autowired PositionManagerMapper dao;
	
	@Autowired
	private CenterServiceimpl centerService;
	
	@RequestMapping("/save")
	@ResponseBody
	public OfferResult save(@RequestBody Enterprise e,HttpSession session) throws Exception{
		
		e.setUserId((Integer)session.getAttribute("userId"));
		/*,MultipartFile pictureFile
		if(pictureFile !=null) {
		// 图片上传
		// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();

		// 获取文件名
		String oriName = pictureFile.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));
		//获取上传路径
		String path=session.getServletContext().getRealPath("/images/"); 
		// 开始上传
		pictureFile.transferTo(new File(path+ picName + extName));
		//将图片地址保存到类中
		e.setEnterpriseLogourl(picName + extName);
		}*/
		if (centerService.save(e) >0)
			return new OfferResult(200);
		else
			return new OfferResult(400,"数据有误");
				
	}
	@ResponseBody
	@RequestMapping("/get")
	public OfferResult get(HttpSession session) {
		
		Enterprise e = new Enterprise();
		e.setUserId((Integer) session.getAttribute("userId"));
		//e.setUserId(4);
		List<Enterprise> list = new ArrayList<Enterprise>();
		list.add(centerService.get(e));
		return new OfferResult(200,"",list);
	}
	@ResponseBody
	@RequestMapping("/update")
	public OfferResult update(@RequestBody Enterprise e,HttpSession session) throws Exception, IOException {
	/*
	 * MultipartFile pictureFile;
		if(pictureFile !=null) {
		// 图片上传
		// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();

		// 获取文件名
		String oriName = pictureFile.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));
		//获取上传路径
		String path=session.getServletContext().getRealPath("/images/"); 
		// 开始上传
		pictureFile.transferTo(new File(path+ picName + extName));
		//将图片地址保存到类中
		e.setEnterpriseLogourl(picName + extName);
		}
		*/
		try
		{	
			centerService.update(e);
		    return new OfferResult(200);
			
		}
		catch (Exception ex){
			return new OfferResult(400,"数据有误");
		}
	}
	@ResponseBody
	@RequestMapping("/uploadImage")
	public OfferResult uploadImage(@RequestParam MultipartFile pictureFile,HttpServletRequest request) throws Exception, IOException {

		if(pictureFile !=null) {
		// 图片上传
		// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();

		// 获取文件名
		String oriName = pictureFile.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));
		//获取上传路径
		String path = request.getSession().getServletContext().getRealPath("/images/");
		HttpSession session = request.getSession();
		//File filepath = new File(path+ picName + extName);
		
      /*  //判断路径是否存在
        if(!filepath.getParentFile().exists()){
            filepath.getParentFile().mkdirs();
        }*/
		// 开始上传
		pictureFile.transferTo(new File("D:\\images\\"+ picName + extName));
		//将图片地址保存到类中
		

		Enterprise p = new Enterprise();
	    Map<String, Object> map=new HashMap<String, Object>();
		map.put("userId",session.getAttribute("userId") /*p.getUserId()*/);
		p.setEnterpriseId(dao.findEnterprise(map));
		p.setEnterpriseLogourl(picName + extName);
		centerService.update(p);
		return new OfferResult(200);
		}
		else
			return new OfferResult(400,"上传图片数据有错");

		
	}
	
	
}
