package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.emptity.Car;

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
