package web.controller;

import java.util.List;

public interface CarService {
    List<Car> getDesiredQtyCars (List<Car> cars, int qty);
}
