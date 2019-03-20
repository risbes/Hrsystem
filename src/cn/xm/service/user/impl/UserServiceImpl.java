package cn.xm.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.xm.dao.user.UserMapper;
import cn.xm.pojo.Relations;
import cn.xm.pojo.User;
import cn.xm.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User login(String userCode, String userPassword) throws Exception {
		User user = null;
		user = userMapper.getLoginUser(userCode);
		//匹配密码
		if(null != user){
			if(!user.getUserPassword().equals(userPassword))
				user = null;
		}
		return user;
	}

	@Override
	public List<User> getUserList(String userName, Integer userRole, Integer userDept) throws Exception {
		return userMapper.getUserList(userName, userRole, userDept);
	}

	@Override
	public List<Relations> getRoleList() throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getRoleList();
	}

	@Override
	public List<Relations> getDeptList() throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getDeptList();
	}

}
