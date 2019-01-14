package cn.it.shop.daoImpl;

import cn.it.shop.dao.SorderDao;
import cn.it.shop.model.Sorder;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 模块自身的业务逻辑
 */
@SuppressWarnings("unchecked")
@Repository("sorderDao")
public class SorderDaoImpl extends BaseDaoImpl<Sorder> implements SorderDao {

	@Override
	public List<Object> querySale(int number) {
		String hql = "SELECT s.name,sum(s.number) FROM Sorder s JOIN s.product GROUP BY s.product.id";
		return getSession().createQuery(hql)
				.setFirstResult(0)
				.setMaxResults(number)
				.list();
	}


}
