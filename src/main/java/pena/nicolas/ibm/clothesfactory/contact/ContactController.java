package pena.nicolas.ibm.clothesfactory.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contact")
public class ContactController {
	
	@RequestMapping(value = "")
	public String contact() {
		return "contact";
	}

}
