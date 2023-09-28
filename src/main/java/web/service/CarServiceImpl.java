package web.service;

import java.util.List;

import web.model.Car;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCar(List<Car> cars, int count) {
        if (count >= 5 || count < 1) {
            return cars;
        } else {
            return cars.subList(0,count);
        }
    }
}
