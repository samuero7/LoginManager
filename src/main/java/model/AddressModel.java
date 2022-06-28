package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity(name = "Address")

public class AddressModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;
    String country;

    String state;

    String city;

    String postalCode;

    String address;

    String complement;



}
