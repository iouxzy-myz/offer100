/**
 * 
 */
package cn.hust.offer100.dto;

import java.io.Serializable;

/**
 * @author Super-mao
 *
 */
public class InterviewDto implements Serializable{
	private static final long serialVersionUID = 10L;
	private String userName;
	private String interviewTime;
	private String positionName;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the interviewTime
	 */
	public String getInterviewTime() {
		return interviewTime;
	}
	/**
	 * @param interviewTime the interviewTime to set
	 */
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}
	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}
	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	

}
