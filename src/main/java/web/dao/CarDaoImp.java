package web.dao;

import web.emptity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao{
    private List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        cars.add(new Car("Ferrary","Красное пламя",2017));
        cars.add(new Car("Maserati","Желтый луч",2021));
        cars.add(new Car("Bentley","Серый туман",2020));
        cars.add(new Car("Rolls-Royce","Черная ночь",2018));
        cars.add(new Car("Toyota","Джунгли",2015));
    }

    /**
     * Метод возвращает список машин заданного количества
     * или полный список, если количество < 0 или превышает размер
     * полного списка.
     * @param count - количество машин в списке
     * @return - список машин
     */
    @Override
    public List<Car> listCars(int count) {
        int i = count < 0? cars.size() : Math.min(count,cars.size());
        return cars.stream().limit(i).collect(Collectors.toList());
    }
}
