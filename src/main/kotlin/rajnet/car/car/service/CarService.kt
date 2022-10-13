package rajnet.car.car.service

import org.springframework.stereotype.Service
import rajnet.car.car.entity.Car
import rajnet.car.car.repository.CarRepository

@Service
class CarService(val carRepository: CarRepository) {

    fun create(car: Car) : Car = carRepository.save(car)

    fun getAll(): MutableList<Car> = carRepository.findAll()

}