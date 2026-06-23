package com.arzur.springBootCRUD.controller;

import com.arzur.springBootCRUD.model.Car;
import com.arzur.springBootCRUD.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.createCar(car);
    }
    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }
    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }
}
