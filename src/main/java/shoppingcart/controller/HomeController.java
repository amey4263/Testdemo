package shoppingcart.controller;
import org.springframework.web.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	//whenevr the user opens our webpage, it should navigate to homepage
	
@Required("/")
	public String gotohomepage()
	{
		return "home";
	}
}
