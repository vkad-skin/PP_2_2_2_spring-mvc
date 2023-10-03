package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "E34", 5000));
        cars.add(new Car("Mazda", "Primacy", 3000));
        cars.add(new Car("Mercedes", "S230", 6000));
        cars.add(new Car("VAZ", "2230", 2000));
        cars.add(new Car("LADA", "Priora", 1000));

        return cars;
    }
}
