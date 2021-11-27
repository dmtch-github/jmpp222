package business.services;

import business.entities.Car;

import java.util.List;

public interface CarService {
    List<Car> listCars(int count);
}
