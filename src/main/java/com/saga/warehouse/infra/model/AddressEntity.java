package com.saga.warehouse.infra.model;

import com.saga.warehouse.infra.model.enums.AddressType;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {
    @Id
    @GeneratedValue
    Integer id;
    @Enumerated(EnumType.STRING)
    AddressType type;
    String city;
    String zip;
    String streetName;
    String streetNumber;
}
