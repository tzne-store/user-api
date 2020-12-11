package br.com.store.userapi.entities;

import br.com.store.userapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {
    private Long areaCode;
    private String countryCode;
    private Long number;
    private PhoneType phoneType;
}
