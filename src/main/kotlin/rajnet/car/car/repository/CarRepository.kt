package rajnet.car.car.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import rajnet.car.car.entity.Car

@Repository
interface CarRepository: JpaRepository<Car, Long>{
}