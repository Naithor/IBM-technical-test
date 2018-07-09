package pena.nicolas.ibm.clothesfactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pena.nicolas.ibm.clothesfactory.clothe.Clothe;
import pena.nicolas.ibm.clothesfactory.order.Order;

@SpringBootApplication
public class ClothesFactoryApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(ClothesFactoryApplication.class, args);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		Date date = dateFormat.parse("12-12-2018 05:54");
		System.out.println(date);
		
		Clothe clothe = new Clothe( "Camisa formal", 5);
		System.out.println(clothe);
		
		Order order = new Order( "company", "description", "form", "name", "cc", "123", clothe, 2, date, "cll" );
		System.out.println(order);
	}
}
