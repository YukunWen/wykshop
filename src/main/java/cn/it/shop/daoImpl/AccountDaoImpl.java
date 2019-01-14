package cn.it.shop.daoImpl;

import cn.it.shop.dao.AccountDao;
import cn.it.shop.model.Account;
import org.springframework.stereotype.Repository;

/*
 * 模块自身的业务逻辑
 */
@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account> implements AccountDao {
	
}
