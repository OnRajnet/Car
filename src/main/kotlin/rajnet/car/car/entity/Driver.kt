package rajnet.car.car.entity

import javax.persistence.*

@Entity
@Table(name = "driver")
data class Driver(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "driver_id") val driverId: Long,
        val name: String,
        @ManyToMany(mappedBy = "drivers") val cars: MutableList<Car> = mutableListOf()

        
)