package cn.it.shop.daoImpl;

import cn.it.shop.dao.UserDao;
import cn.it.shop.model.User;
import org.springframework.stereotype.Repository;

/*
 * 模块自身的业务逻辑
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User login(User user) {
		String hql = "FROM User u WHERE u.login=:login AND u.pass=:pass";
		return (User)getSession().createQuery(hql)
				.setString("login", user.getLogin())
				.setString("pass", user.getPass())
				.uniqueResult();
	}


}
