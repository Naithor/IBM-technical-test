package pena.nicolas.ibm.clothesfactory.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/order",  method = RequestMethod.GET)
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "order";
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
    public String orderSubmit(@ModelAttribute Order order, Model model) {
         
        model.addAttribute("order", order);
        String info = String.format("Order Submission: companyname = %s, "
        		+ "productServiceDescription = %s, "
        		+ "formName = %s, "
        		+ "requestorName = %s, "
        		+ "idType = %s, "
        		+ "idNummber = %s, "
        		+ "productQuantity = %d, "
        		+ "deliveryAddress = %s,"
        		+ "totalCost = %f",
        		order.getCompanyname(),
        		order.getProductServiceDescription(),
        		order.getFormName(),
        		order.getRequestorName(),
        		order.getIdType(),
        		order.getIdNummber(),
        		order.getProductQuantity(),
        		order.getDeliveryAddress(),
        		order.getTotalCost());
        
        log.info(info);
         
        return "result";
    }

}
