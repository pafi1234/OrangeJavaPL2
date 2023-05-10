package pl.sda.OrangeJavaPL2.entity;

import lombok.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    //    @Transient // to not include this field in DB schema
    String number;
    String postalCode;
    String country;

    /* One Direction:
    Bakery{
        id;

        @OneToOne
        Address address;
    }
    bakery.getAddress - possible
    -----------------------------------
    Address{
        id;

    }
    address.getBakery - impossible

    */
//    -----------------------------------
        /* bi-Direction:
    Bakery{
        id;

        @OneToOne
        Address address;
    }
    bakery.getAddress - possible
    -----------------------------------
    Address{
        id;

        @OneToOne
        Bakery bakery;
    }
    address.getBakery - possible

    */



    // all fields except id
    public Address(String name, String number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}