package cn.xm.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xm.pojo.Relations;
import cn.xm.pojo.User;

public interface UserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public User login(String userCode,String userPassword) throws Exception;
	
	/**
	 * 查询用户信息
	 * @param userName
	 * @param userRole
	 * @param userDept
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserList(String userName,Integer userRole,Integer userDept)throws Exception;

	/**
	 * 查询全部角色
	 * @return
	 * @throws Exception
	 */
	public List<Relations> getRoleList()throws Exception;
	
	/**
	 * 查询全部部门
	 * @return
	 * @throws Exception
	 */
	public List<Relations> getDeptList()throws Exception;
}
