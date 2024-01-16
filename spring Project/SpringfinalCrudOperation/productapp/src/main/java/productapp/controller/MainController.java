package productapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productapp.dao.ProductDao;
import productapp.modle.Product;

@Controller
public class MainController {
    
	
	@Autowired
	private ProductDao productdao;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/add_product")
	public String Addproduct(Model model)
	{
		model.addAttribute("title", "Add Product");
		return "add_product_from";
	}
	
	@RequestMapping(value = "/handler_product" , method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product , HttpServletRequest request)
	{
		System.out.println(product);
		productdao.createproduct(product);
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl(request.getContextPath() + "/home");
		return redirectview;
	}
}
