package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/car")
	public String printCars(@RequestParam(value = "count" , defaultValue = "5") int count
			, Model model) {

		List<Car> cars = new ArrayList<>();
		CarService carService = new CarServiceImpl();

		cars.add(new Car("BMW", "E34", 5000));
		cars.add(new Car("Mazda", "Primacy", 3000));
		cars.add(new Car("Mercedes", "S230", 6000));
		cars.add(new Car("VAZ", "2230", 2000));
		cars.add(new Car("LADA", "Priora", 1000));

		//carService.getCountCar(cars, count)
		model.addAttribute("cars", carService.getCountCar(cars, count));


		return "cars";
	}
	
}