package local.dmi.shippingbackend.dao;

import java.util.List;

import local.dmi.shippingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
