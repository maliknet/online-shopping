package local.dmi.shippingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import local.dmi.shippingbackend.dao.CategoryDAO;
import local.dmi.shippingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Some Desc");
		category.setImageUrl("1.jpg");
		categories.add(category);
		
		//Adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Some Desc");
		category.setImageUrl("2.jpg");
		categories.add(category);
		
		//Adding third category
		category = new Category();
		category.setId(3);
		category.setName("Notebook");
		category.setDescription("Some Desc");
		category.setImageUrl("3.jpg");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enchanced for loop
		for (Category category : categories) {
			if (category.getId() == id) return category;
		}
		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
