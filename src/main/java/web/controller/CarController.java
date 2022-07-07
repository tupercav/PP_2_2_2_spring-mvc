package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @RequestMapping("/")
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bentley", "Bentayga", 700));
        cars.add(new Car("Lada", "Priora", 105));
        cars.add(new Car("BMW", "M3", 460));
        cars.add(new Car("Volkswagen", "Passat", 220));
        cars.add(new Car("Lada", "Kopeyka", 60));
        return cars;
    }

}
