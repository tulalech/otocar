package pl.lech.otocar.otocar.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.lech.otocar.otocar.model.Car;
import pl.lech.otocar.otocar.model.CarDao;
import pl.lech.otocar.otocar.model.Years;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private List<Car> cars = new ArrayList<>();

    private CarDao carDao;
    private Years years;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
        cars = carDao.getAll();
    }

    @GetMapping("/cars")
    public String getAllCars(Model model) {
//        cars = carDao.getAll();
        model.addAttribute("cars", cars);
        model.addAttribute("newcar", new Car());
        if (this.years == null) {
            model.addAttribute("years", new Years());
        } else {
            model.addAttribute("years", years);
        }
        return "carlist";
    }

    @PostMapping("/addcar")
    public String addCar(@ModelAttribute Car car) {
        carDao.addCar(car);
        cars = carDao.getAll();
//        cars.add(car);
        return "redirect:/cars";
    }

    @PostMapping("/filtercar")
    public String filterCar(@ModelAttribute Years years) {
        if (years.getFromYear() == null) {
            cars = carDao.getAll();
            this.years = null;
        } else {
            cars = carDao.getCarsBetweenYears(Integer.valueOf(years.getFromYear()), Integer.valueOf(years.getToYear()));
            this.years = years;
        }
        return "redirect:/cars";
    }


}
