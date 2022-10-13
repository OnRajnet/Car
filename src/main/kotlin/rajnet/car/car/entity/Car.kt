package rajnet.car.car.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
data class Car(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "car_id") val carId: Long,
        val color: String,
        @ManyToMany(cascade = [CascadeType.ALL])
        @JoinTable(name = "car_driver", joinColumns = [JoinColumn(name = "car_id")],inverseJoinColumns = [JoinColumn(name = "driver_id")])
        @JsonIgnoreProperties val drivers: MutableList<Driver> = mutableListOf()

)

