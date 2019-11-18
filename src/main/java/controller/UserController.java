package controller;

import java.util.List;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		List<User> list = userService.login();
		mav.getModel().put("data", list);
		return mav;
	}
}
