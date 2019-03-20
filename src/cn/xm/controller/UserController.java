package cn.xm.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.xm.service.user.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	
	private Logger logger = Logger.getLogger(LoginController.class);
	
	@Resource
	private UserService userService;
	
	/**
	 * 进入用户管理页面或点击查询
	 * @param userName
	 * @param userRole
	 * @param userDept
	 * @return
	 */
	@RequestMapping(value="/userList")
	public String userList(Model model,@RequestParam String userName,
			@RequestParam Integer userRole,@RequestParam Integer userDept) {
		//分页
		return "";
	}
}
