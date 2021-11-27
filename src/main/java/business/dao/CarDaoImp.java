package business.dao;

import business.entities.Car;
import business.entities.repositories.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao{

    /**
     * Метод возвращает список машин заданного количества
     * или полный список, если количество < 0 или превышает размер
     * полного списка.
     * @param count - количество машин в списке
     * @return - список машин
     */
    @Override
    public List<Car> listCars(int count) {
        List<Car> cars = CarRepository.getListCars();
        int i = count < 0? cars.size() : Math.min(count,cars.size());
        return cars.stream().limit(i).collect(Collectors.toList());
    }
}
