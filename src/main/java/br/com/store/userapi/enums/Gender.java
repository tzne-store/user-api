package br.com.store.userapi.enums;

import org.apache.commons.lang3.StringUtils;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender fromName( String value ) {
        if( StringUtils.isBlank( value ) ) {
            return null;
        }
        for( Gender gender : values() ) {
            if( gender.name().equals( value ) ) {
                return gender;
            }
        }
        return null;
    }
}
