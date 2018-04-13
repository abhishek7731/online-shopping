package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller // HELPER CONTROLLER
public class PageController {

	
	@Autowired 
	private CategoryDAO categoryDAO; //here we are not instanstating this is done by spring framework using autowire annotation
	
	
	@RequestMapping(value = { "/", "/home", "/index" }) // home ,index these are
														// request and who will
														// manage these request
														// it will be managed by
														// model and view neecha
														// dekho
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page"); // here view name is page it
													// is not the logical name
													// as the logical name is
													// page .jsp but we are
													// giving page and actual
													// page is residing into
													// views-->page.jsp
		mv.addObject("title", "Home");
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/contact") // home ,index these are
	// request and who will
	// manage these request
	// it will be managed by
	// model and view neecha
	// dekho
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page"); // here view name is page it
		// is not the logical name
		// as the logical name is
		// page .jsp but we are
		// giving page and actual
		// page is residing into
		// views-->page.jsp
		mv.addObject("title", "Contact Us"); //here title everywhere will be passed to page.jsp
		mv.addObject("userClickContact", true);
		return mv;
	}

	@RequestMapping(value = "/about") // home ,index these are
	// request and who will
	// manage these request
	// it will be managed by
	// model and view neecha
	// dekho
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page"); // here view name is page it
		// is not the logical name
		// as the logical name is
		// page .jsp but we are
		// giving page and actual
		// page is residing into
		// views-->page.jsp
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	    // method to load all the products based on category
	       
	@RequestMapping(value = "/show/all/products") // home ,index these are
	// request and who will
	// manage these request
	// it will be managed by
	// model and view neecha
	// dekho
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page"); // here view name is page it
		// is not the logical name
		// as the logical name is
		// page .jsp but we are
		// giving page and actual
		// page is residing into
		// views-->page.jsp
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	
	
	@RequestMapping(value = "/show/category/{id}/products") // home ,index these are
	// request and who will
	// manage these request
	// it will be managed by
	// model and view neecha
	// dekho
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page"); // here view name is page it
		
		//categoryDAO to fetch a single category
		Category category = null;
		
		category = categoryDAO.get(id); //getid ka implementation categoryDAO mei diya hai
		// is not the logical name
		// as the logical name is
		// page .jsp but we are
		// giving page and actual
		// page is residing into
		// views-->page.jsp
		mv.addObject("title", category.getName());

		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true); 
		return mv;
	}










}



