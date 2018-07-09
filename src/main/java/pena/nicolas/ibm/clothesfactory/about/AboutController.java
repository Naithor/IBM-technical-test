package pena.nicolas.ibm.clothesfactory.about;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("about")
public class AboutController {
	
	@RequestMapping(value = "")
	public String about() {
		return "about";
	}

}
