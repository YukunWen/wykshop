package cn.it.shop.dao;

import cn.it.shop.model.Pager;
import cn.it.shop.model.Product;

import java.util.List;

public interface ProductDao extends BaseDao<Product> {

	public List<Product> queryJoinCategory(String name, int page, int size);

	//根据关键字查询总记录数
	public Long getCount(String name);

	//根据类别查询商品
	public List<Product> queryByCid(int cid);

	//根据类别查询商品
	public List<Product> queryAllPro(int cid);

	//根据关键字获得商品名称
	public List<String> getProName(String name) ;

	//用户点击搜索，列出相关商品
	public Pager<Product> getSearchProduct(int pageNum, int pageSize, String name);
}
