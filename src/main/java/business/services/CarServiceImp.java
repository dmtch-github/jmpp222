package business.services;

import business.dao.CarDao;
import business.dao.CarDaoImp;
import business.entities.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    private CarDao carDao;

    public CarServiceImp() {
        carDao = new CarDaoImp();
    }

    @Override
    public List<Car> listCars(int count) {
        return carDao.listCars(count);
    }
}
