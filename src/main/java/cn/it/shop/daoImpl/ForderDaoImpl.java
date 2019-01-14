package cn.it.shop.daoImpl;

import cn.it.shop.dao.ForderDao;
import cn.it.shop.model.Forder;
import org.springframework.stereotype.Repository;

/*
 * 模块自身的业务逻辑
 */
@Repository("forderDao")
public class ForderDaoImpl extends BaseDaoImpl<Forder> implements ForderDao {


	public void updateStatusById(int id, int sid) {
		String hql = "UPDATE Forder f SET f.status.id=:sid WHERE f.id=:id";
		getSession().createQuery(hql)
					.setInteger("sid", sid)
					.setInteger("id", id)
					.executeUpdate();
	}

}
