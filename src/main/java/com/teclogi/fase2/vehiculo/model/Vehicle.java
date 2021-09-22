package com.teclogi.fase2.vehiculo.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Vehicle {
    private String id;
    private int emptyWeight;
    private int axles;
    private Person owner;
    private Person driver;
}
