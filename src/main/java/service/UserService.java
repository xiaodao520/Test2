package service;

import java.util.List;

import bean.User;
import mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public List<User> login() {
		return userdao.login();
	}
}
