package rajnet.car.car.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import rajnet.car.car.entity.Car
import rajnet.car.car.service.CarService
import java.util.*

@RestController
@RequestMapping("api/car")
class CarController(val carService: CarService) {

    @PostMapping
    fun createCar(@RequestBody car: Car): ResponseEntity<Car>  = ResponseEntity(carService.create(car), HttpStatus.CREATED)

    @GetMapping
    fun getAllCars(): ResponseEntity<MutableList<Car>> = ResponseEntity(carService.getAll(), HttpStatus.OK)



}