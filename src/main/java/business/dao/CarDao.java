package business.dao;

import business.entities.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars(int count);
}
