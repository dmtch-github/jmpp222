package mvc.business.dao;

import lombok.NoArgsConstructor;
import mvc.business.entities.Car;
import mvc.business.entities.repositories.CarRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Repository
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
        int min = count < 0? cars.size() : Math.min(count,cars.size());
        return cars.stream().limit(min).collect(Collectors.toList());
    }
}
