package _10_JavaOOPRetakeExam_20December2021.christmasRaces.repositories;

import _10_JavaOOPRetakeExam_20December2021.christmasRaces.entities.cars.Car;
import _10_JavaOOPRetakeExam_20December2021.christmasRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CarRepository implements Repository<Car> {

    private Collection<Car> models;

    public CarRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Car getByName(String name) {

        return this.models
                .stream()
                .filter(e -> e.getModel().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Car> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Car model) {
        this.models.add(model);
    }

    @Override
    public boolean remove(Car model) {
        return this.models.remove(model);
    }
}
