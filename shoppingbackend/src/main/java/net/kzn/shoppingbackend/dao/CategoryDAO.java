package net.kzn.shoppingbackend.dao;



import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {

//HERE WE WILL BE CREATING LIST SO THAT I CANN RETURN LIST OF PRODUCTS
	List<Category> list();
	Category get(int id); //this becomes our absract method so we need to import this in our categoryDAOImpl
	


}
