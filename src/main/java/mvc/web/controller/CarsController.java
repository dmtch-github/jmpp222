package mvc.web.controller;

import mvc.business.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value="count", required=false) String strCount,
                            ModelMap model) {
        int count = -1; //выдать весь список
        try {
            count = Integer.parseInt(strCount);
        } catch (Exception ignore) {

        }
        model.addAttribute("cars",carService.listCars(count));
        return "cars";
    }

}
