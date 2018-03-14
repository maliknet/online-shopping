package local.dmi.shippingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import local.dmi.shippingbackend.dao.CategoryDAO;
import local.dmi.shippingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("local.dmi.shippingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory(){
		category = new Category();
		category.setName("Television");
		category.setDescription("Some Desc");
		category.setImageUrl("1.jpg");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	}
}
