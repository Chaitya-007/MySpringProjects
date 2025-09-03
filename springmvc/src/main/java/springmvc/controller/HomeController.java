package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	
	@RequestMapping("/user/{id}/{userName}")
	public String getDetail(@PathVariable("id") int userId, @PathVariable("userName") String userName)
	{
		System.out.println("User id : " + userId);
		System.out.println("User name : " + userName);
		Integer.parseInt(userName);
		return "home";
	}

	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Tippu Sultan");
		model.addAttribute("id", 5214);
		
		List<String> friends = new ArrayList<String>();
		friends.add("vandana");
		friends.add("roshni");
		friends.add("sakshi");
		model.addAttribute("f",friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		String str = null;
		System.out.println(str.length());
		return "about";
	}

	@RequestMapping("/service")
	public String services() {
		System.out.println("this is services url");
		return "services";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help url");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Chaitya");
		modelAndView.addObject("id",542);
		
		modelAndView.setViewName("help");
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(89);
		list.add(750);
		
		modelAndView.addObject("list",list);
		return modelAndView;
	}
	
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	public String exceptionHandlerNull()
//	{
//		return "null_page";
//	}
	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull(Model model )
//	{
//		model.addAttribute("msg", "this is null exception");
//		return "null_page";
//	}
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumber(Model model)
//	{
//		model.addAttribute("msg", "this is number exception");
//		return "null_page";
//	}
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneic(Model model)
//	{
//		model.addAttribute("msg", "this is generic exception");
//		return "null_page";
//	}
//	
	
}
