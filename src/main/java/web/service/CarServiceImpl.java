package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    public CarServiceImpl (List<Car> carList) {
        this.carList = carList;
        carList.add(new Car("Bentley", "Bentayga", 700));
        carList.add(new Car("Lada", "Priora", 105));
        carList.add(new Car("BMW", "M3", 460));
        carList.add(new Car("Volkswagen", "Passat", 220));
        carList.add(new Car("Lada", "Kopeyka", 60));
    }

    public List<Car> getCarList () {
        return carList;
    }
    public List<Car> getDesiredQtyCars(int qty) {
        Collections.shuffle(carList);
        return (qty >= 5) ? carList : carList.subList(0, qty);



        //Вытаскивание без дублей
//        if (qty >= 5) {
//            return carList;
//        } else {
//            List<Car> carsToBringToView = new ArrayList<>();
//            Collections.shuffle(carList);
//            for (int i = 0; i < qty; i++) {
//                carsToBringToView.add(carList.get(i));
//            }

            //Просто рандомное вытаскивание из списка
//            for (int i = 0; i < qty; i++) {
//                Random random = new Random();
//                int upperbound = carList.size();
//                int randomIndex = random.nextInt(upperbound);
//
//                carsToBringToView.add(carList.get(randomIndex));
//                carList.remove(randomIndex);
//            }
//            return carsToBringToView;
//        }
    }
}
