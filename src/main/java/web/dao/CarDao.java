package web.dao;

import web.emptity.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars(int count);
}
