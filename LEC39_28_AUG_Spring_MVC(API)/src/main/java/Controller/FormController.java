package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String form(Model model)
	{
		System.out.println("Hello, I am Wasif");
		System.out.println("Java Programming");
		model.addAttribute("name","tousif");
		return "form";
	}
	
	
	@RequestMapping("/contact")
	public String contact(Model m)
	{
		System.out.println("Hello , I am in contact COntroller");
		m.addAttribute("key", "hello i am wasif");
		return "contact";
		
	}
	
	@RequestMapping("/userform")
	public String userform()
	{
		return "userform";
	}
	
	@RequestMapping("/formdata")
	public void formdata(@RequestParam("username") String name,@RequestParam("email") String email)
	{
		System.out.println(name);
		System.out.println(email);
	}
	{
		
	}
	
		


}
