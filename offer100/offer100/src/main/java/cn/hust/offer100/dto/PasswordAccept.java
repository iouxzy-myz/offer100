/**
 * 
 */
package cn.hust.offer100.dto;

/**
 * @author Super-mao
 *
 */
public class PasswordAccept {
	String newPassword;
	String oldPassword;

	public String getOldPassword() {
		return oldPassword;
	}
	/**
	 * @param oldPassword the oldPassword to set
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	String cofirPassword;
	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	/**
	 * @return the cofirPassword
	 */
	public String getCofirPassword() {
		return cofirPassword;
	}
	/**
	 * @param cofirPassword the cofirPassword to set
	 */
	public void setCofirPassword(String cofirPassword) {
		this.cofirPassword = cofirPassword;
	}
	
}
