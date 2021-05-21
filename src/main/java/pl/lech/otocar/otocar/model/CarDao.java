package pl.lech.otocar.otocar.model;

import java.util.List;

public interface CarDao {

    List<Car> getAll();
    void addCar(Car car);
    List<Car> getCarsBetweenYears(int fromYearm, int toYear);
}
