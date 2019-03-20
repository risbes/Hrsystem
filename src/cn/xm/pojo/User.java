package cn.xm.pojo;

import java.io.Serializable;

import javax.management.relation.Role;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer ID;
	
	private String userCode;
	
	private String userName;
	
	private String userPassword;
	
	private Integer userRole;
	
	private Integer userDept;
	
	private String phone;
	
	private String r_name;
	
	private String r_category;
	
	

	public String getR_category() {
		return r_category;
	}

	public void setR_category(String r_category) {
		this.r_category = r_category;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public Integer getUserDept() {
		return userDept;
	}

	public void setUserDept(Integer userDept) {
		this.userDept = userDept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
