package cn.it.shop.serviceImpl;

import cn.it.shop.model.Category;
import cn.it.shop.model.Pager;
import cn.it.shop.model.Product;
import cn.it.shop.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 模块自身的业务逻辑
 */
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {

	@Override
	public List<Category> queryJoinAccount(String type,int page,int size) {
		return categoryDao.queryJoinAccount(type, page, size);
	}

	@Override
	public Long getCount(String type) {
		return categoryDao.getCount(type);
	}

	@Override
	public void deleteByIds(String ids) {
		categoryDao.deleteByIds(ids);
	}

	@Override
	public List<Category> queryByHot(boolean hot) {
		return categoryDao.queryByHot(hot);
	}

	@Override
	public Pager<Product> findProduct(int pageNum, int pageSize, int id){
		Pager<Product> result = categoryDao.findProduct(pageNum, pageSize, id);
		return result;
	}
}
