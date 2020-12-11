package br.com.store.userapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Long zipCode;
    private String street;
    private String number;
    private String district;
    private String city;
    private String State;
    private String country;
}
