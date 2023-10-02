package web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCountCar(List<Car> cars, int count) {
        return carDAO.getCountCar(cars, count);
    }

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }
}
