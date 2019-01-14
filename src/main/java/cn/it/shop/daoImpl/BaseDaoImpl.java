package cn.it.shop.daoImpl;

import cn.it.shop.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class clazz;  //clazz中存储了当前操作的类型
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public  BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
	}
	

	public void save(T t) {
		getSession().save(t);
	}


	public void update(T t) {
		getSession().update(t);
	}


	public void delete(int id) {
		String hql = "DELETE "+ clazz.getSimpleName()+ " WHERE id=:id";
		getSession().createQuery(hql)
				.setInteger("id", id)
				.executeUpdate();
	}


	public T get(int id) {
		return (T) getSession().get(clazz, id);
	}


	public List<T> query() {
		String hql = "FROM "+ clazz.getSimpleName();
		return getSession().createQuery(hql).list();
	}


}
