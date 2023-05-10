package pl.sda.OrangeJavaPL2.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity // Database entity-object to map
@Setter // Required for entity
@Getter // Required for entity
@NoArgsConstructor // Required for entity
@AllArgsConstructor
@ToString
@Table(name = "breads") // Change default name to custom one
public class Bread {

    @Id // Required for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement id with every single object
    Long id;
    String name;
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "price_in_pln") // Change default name to custom one
    BigDecimal price;

    public Bread(String name, BreadType breadType, BigDecimal price) {
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }
}