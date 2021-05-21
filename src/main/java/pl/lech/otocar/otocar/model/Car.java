package pl.lech.otocar.otocar.model;

import org.springframework.context.annotation.Bean;

public class Car {

    private long id;
    private String mark;
    private String model;
    private String color;
    private int year;

    public Car() {
    }

    public Car(long id, String mark, String model, String color, int year) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
