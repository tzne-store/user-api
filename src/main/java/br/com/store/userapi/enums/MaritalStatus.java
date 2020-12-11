package br.com.store.userapi.enums;

import org.apache.commons.lang3.StringUtils;

public enum MaritalStatus {
    SINGLE,
    MARRIED,
    WIDOWED,
    DIVORCED,
    OTHER;

    public static MaritalStatus fromName( String value ) {
        if( StringUtils.isBlank( value ) ) {
            return null;
        }

        for( MaritalStatus maritalStatus : values() ) {
            if( maritalStatus.name().equals( value ) ) {
                return maritalStatus;
            }
        }
        return null;
    }

}
