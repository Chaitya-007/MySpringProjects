package springmvc.expetionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class MyExceptionHandler {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model model) {
		model.addAttribute("msg", "this is null exception");
		return "null_page";
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber(Model model) {
		model.addAttribute("msg", "this is number exception");
		return "null_page";
	}

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneic(Model model) {
		model.addAttribute("msg", "this is generic exception");
		return "null_page";
	}

}
