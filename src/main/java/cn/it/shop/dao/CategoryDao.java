package cn.it.shop.dao;

import cn.it.shop.model.Category;
import cn.it.shop.model.Pager;
import cn.it.shop.model.Product;

import java.util.List;

public interface CategoryDao extends BaseDao<Category> {

	//查询类别信息，级联管理员
	public List<Category> queryJoinAccount(String type, int page, int size);

	//根据关键字查询总记录数
	public Long getCount(String type);

	//根据id删除多条记录
	public void deleteByIds(String ids);

	//根据boolean查询热点或非热点类别
	public List<Category> queryByHot(boolean hot);

	public Pager<Product> findProduct(int pageNum, int pageSize, int id);
}
