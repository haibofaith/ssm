package com.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.model.IUserService;
import com.model.User;

@Controller
public class HelloController {
//	@Autowired
//	IUserService IUserService;
	
	@Resource  
    private IUserService userService = null;  
	
	//返回到index.jsp	
//	@RequestMapping(value="/hello.do")
//	public void hello(HttpServletResponse response) throws IOException{
//		response.getWriter().write(JSONObject.toJSONString(IUserService.getUserById(0)).toString());;
//	}
	
	@RequestMapping(value="/getuserbyid.do")
//	@ResponseBody
	public String getUserById(Model model) {
		int userId = 1;  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user); 
//        return JSONObject.toJSONString(user);
        return "index";  
	}
}
