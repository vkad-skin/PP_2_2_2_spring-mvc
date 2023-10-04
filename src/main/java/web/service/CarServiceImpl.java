package web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCountCar(int count) {
        if (count >= 5 || count < 1) {
            return getCars();
        } else {
            return getCars().stream().limit(count).toList();
        }
    }

    private List<Car> getCars() {
        return carDAO.getCars();
    }
}
