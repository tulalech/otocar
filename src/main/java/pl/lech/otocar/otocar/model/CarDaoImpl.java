package pl.lech.otocar.otocar.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CarDaoImpl implements CarDao {

    private JdbcTemplate jdbcTemplate;
    String sql = "SELECT * FROM otocars";;

    @Autowired
    public CarDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Car> getAll() {
        List<Car> carList = new ArrayList<>();
        List<Map<String, Object>> mapCars = jdbcTemplate.queryForList(sql);
        prepareCarList(carList, mapCars);
        return carList;
    }

    private void prepareCarList(List<Car> carList, List<Map<String, Object>> mapCars) {
        mapCars.stream().forEach(car -> carList.add(
            new Car(Long.parseLong(String.valueOf(car.get("id"))),
                    String.valueOf(car.get("mark")),
                    String.valueOf(car.get("model")),
                    String.valueOf(car.get("color")),
                    Integer.valueOf(String.valueOf(car.get("year")))
                    )
        ));
    }

    @Override
    public void addCar(Car car) {
        String sql = "INSERT INTO otocars (mark, model, color, year) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, car.getMark(), car.getModel(), car.getColor(), car.getYear());
    }

    @Override
    public List<Car> getCarsBetweenYears(int fromYear, int toYear) {
        List<Car> carList = new ArrayList<>();
        String sql = "SELECT * FROM otocars WHERE year > ? and year < ?";
        List<Map<String, Object>> mapCars = jdbcTemplate.queryForList(sql, fromYear, toYear);
        prepareCarList(carList, mapCars);
        return carList;
    }
}
