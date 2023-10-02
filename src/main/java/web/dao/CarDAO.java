package web.dao;

import web.model.Car;

import java.util.List;


public interface CarDAO {

    public List<Car> getCountCar(List<Car> cars, int count);

    public List<Car> getCars();
}
