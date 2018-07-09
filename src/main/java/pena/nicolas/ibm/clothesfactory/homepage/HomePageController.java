package pena.nicolas.ibm.clothesfactory.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home-page")
public class HomePageController {
	
	@RequestMapping(value = "")
	public String homePage() {
		return "home-page";
	}
	
}
