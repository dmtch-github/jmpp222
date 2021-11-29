package mvc.business.entities.repositories;

import mvc.business.entities.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class CarRepository {
    private static List<Car> cars = new ArrayList<>();

    static {
        ResourceBundle rb;
        rb = ResourceBundle.getBundle("locale/messages/business", Locale.forLanguageTag("ru"));

        cars.add(new Car(rb.getString("model.ferrari"),rb.getString("color.red"),2017));
        cars.add(new Car(rb.getString("model.maserati"),rb.getString("color.yellow"),2021));
        cars.add(new Car(rb.getString("model.bentley"),rb.getString("color.gray"),2020));
        cars.add(new Car(rb.getString("model.rollsroysce"),rb.getString("color.black"),2018));
        cars.add(new Car(rb.getString("model.toyota"),rb.getString("color.khaki"),2015));
    }

    private CarRepository() {

    }

    public static List<Car> getListCars() {
        return cars;
    }
}
