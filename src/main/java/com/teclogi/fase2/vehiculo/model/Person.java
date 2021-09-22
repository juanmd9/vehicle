package com.teclogi.fase2.vehiculo.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String documentTypeId;
    private String documentTypeName;
    private String document;
    private String name;
}
