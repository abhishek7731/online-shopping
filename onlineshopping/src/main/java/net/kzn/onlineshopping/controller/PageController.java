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
		mv.addObject("greeting", "welcome to spring web mvc"); // here greeting
																// is the view
																// and it will
																// be passed to
																// page.jsp
		return mv;
	}

}
