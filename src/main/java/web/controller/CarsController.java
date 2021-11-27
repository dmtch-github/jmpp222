package web.controller;

import business.services.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value="count", required=false) String strCount,
                            ModelMap model) {
        int count = -1; //выдать весь список
        try {
            count = Integer.parseInt(strCount);
        } catch (Exception ignore) {

        }
        model.addAttribute("cars",new CarServiceImp().listCars(count));
        return "cars";
    }

}
