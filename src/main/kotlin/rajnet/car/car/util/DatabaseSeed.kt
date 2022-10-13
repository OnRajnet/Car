package rajnet.car.car.util

import org.springframework.stereotype.Component
import rajnet.car.car.entity.Car
import rajnet.car.car.entity.Driver
import rajnet.car.car.repository.DriverRepository
import rajnet.car.car.service.CarService
import javax.annotation.PostConstruct

@Component
class DatabaseSeed(val carService: CarService, val driverRepository: DriverRepository) {

    @PostConstruct
    fun createCarWithDriver(){
        var driver = Driver(1L, "Jan")
        var drivers :MutableList<Driver> = mutableListOf()
        drivers.add(driver)
        var car = Car(1L, "Red", drivers)
        carService.create(car)
    }
}