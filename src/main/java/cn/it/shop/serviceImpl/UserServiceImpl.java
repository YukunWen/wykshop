package cn.it.shop.serviceImpl;

import cn.it.shop.model.User;
import cn.it.shop.service.UserService;
import org.springframework.stereotype.Service;

/*
 * 模块自身的业务逻辑
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Override
	public User login(User user) {
		return userDao.login(user);
	}


}
