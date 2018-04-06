package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // HELPER CONTROLLER
public class PageController {

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
}
