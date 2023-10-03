package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car>  getCountCar(int count);

    public List<Car> getCars();
}
