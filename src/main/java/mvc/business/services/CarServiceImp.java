package mvc.business.services;

import lombok.NoArgsConstructor;
import mvc.business.dao.CarDao;
import mvc.business.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCars(int count) {
        return carDao.listCars(count);
    }
}
