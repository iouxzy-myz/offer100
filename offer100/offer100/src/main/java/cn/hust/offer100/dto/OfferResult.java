/**
 * 
 */
package cn.hust.offer100.dto;

import java.io.Serializable;

/**
 * @author Super-mao
 *
 */
public class OfferResult implements Serializable{
	
	private static final long serialVersionUID = 21;
	
	//响应业务状态，200 代表成功，400 代表失败
	private Integer status;
	
	//响应消息 类似提示信息如注册名存在，用户名或密码错误
	private String msg;
	
	//响应中的数据 暂时为跳转链接
	private String url;
	//返回的实体类
	private Object entity;
	
	public OfferResult(){};
	
	public OfferResult(Integer status) {
		super();
		this.status = status;
	}
	
	public OfferResult(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	
	public OfferResult(Integer status, String msg,Object obj) {
		super();
		this.status = status;
		this.msg = msg;
		this.entity = obj;
	}
	
	
	public OfferResult(Integer status, String msg, String url) {
		super();
		this.status = status;
		this.msg = msg;
		this.url = url;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the entity
	 */
	public Object getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(Object entity) {
		this.entity = entity;
	}
	

}
