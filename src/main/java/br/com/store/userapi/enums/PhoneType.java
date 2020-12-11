package br.com.store.userapi.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum PhoneType {
    FIXED,
    CELL_PHONE;

    public static PhoneType fromName( String value ) {

        if( StringUtils.isBlank( value ) ) {
            return null;
        }
        for( PhoneType typePhone : values() ) {
            if( typePhone.name().equals( value ) ) {
                return typePhone;
            }
        }
        return null;
    }
}
