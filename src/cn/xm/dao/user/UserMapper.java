package cn.xm.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xm.pojo.Relations;
import cn.xm.pojo.User;

public interface UserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(@Param("userCode")String userCode)throws Exception;
	
	/**
	 * 查询用户信息
	 * @param userName
	 * @param userRole
	 * @param userDept
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserList(@Param("userName")String userName,@Param("userRole")Integer userRole,
			@Param("userDept")Integer userDept)throws Exception;
	
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
