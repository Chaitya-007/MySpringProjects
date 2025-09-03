package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

//	Common data to be displayed
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "LearnCodeWith Chaitya");
		model.addAttribute("desc", "This is my desc");
		System.out.println("Adding common data");

	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		System.out.println("this is contact");
		return "contact";
	}

//	@RequestMapping(path = "processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String email, @RequestParam("userName") String userName,
//			@RequestParam("userPassword") String userPassword, Model model) {
//
//		User user = new User();
//		user.setEmail(email);
//		user.setUserName(userName);
//		user.setUserPassword(userPassword);
//
//		model.addAttribute("user", user);
//
//		return "success";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println("this is handleform");
		
		if (user.getUserName() == null || user.getUserName().isBlank()) {
		    return "redirect:/contact";
		}

		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + createdUser);
		return "success";
	}
}
