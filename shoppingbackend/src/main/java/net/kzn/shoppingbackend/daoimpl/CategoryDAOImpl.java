package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO") //this annotation is giving access to he category mentioned below down here
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();
		// adding first category

		category.setId(1);
		category.setName("Telivision");
		category.setDescription("this is some decription for some telivision");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category

		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is some decription for some MOBILE");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		category = new Category();

		// third category

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is some decription for some laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;

	}

	@Override
	public Category get(int id) { //this the unimplemented method
	 // enhance for each loop
		for(Category category : categories){
			if(category.getId() ==id) return category; //here we are returning single element based on its id
	}
		
		return null;
	}
}
