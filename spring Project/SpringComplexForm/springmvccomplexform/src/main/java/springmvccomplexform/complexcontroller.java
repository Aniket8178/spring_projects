package springmvccomplexform;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class complexcontroller {
	
	@RequestMapping("/complex")
	public String showfrom() {
		
		return "complex_from";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String fromHandler(@ModelAttribute("student") student student , BindingResult result)
	{
        if(result.hasErrors())
        {
        	return "complex_from";
        }
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

}
