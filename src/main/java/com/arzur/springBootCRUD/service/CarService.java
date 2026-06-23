package com.arzur.springBootCRUD.service;

import com.arzur.springBootCRUD.model.Car;
import com.arzur.springBootCRUD.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    CarRepository carRepository;

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car getCarById(int id) {
        return carRepository.findById(id).orElse(new Car());
    }
    public Car createCar(Car car) {
        return carRepository.save(car);
    }
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}
