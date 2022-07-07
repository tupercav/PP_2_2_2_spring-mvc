package web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getDesiredQtyCars(List<Car> cars, int qty) {
        if (qty >= 5) {
            return cars;
        } else {
            List<Car> carsToBringToView = new ArrayList<>();
            for (int i = 0; i < qty; i++) {
                Random random = new Random();
                int upperbound = cars.size();
                int randomIndex = random.nextInt(upperbound);
                carsToBringToView.add(cars.get(randomIndex));
            }
            return carsToBringToView;
        }
    }
}
