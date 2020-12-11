package br.com.store.userapi.enums;

import org.apache.commons.lang3.StringUtils;

public enum EducationalLevel {
    PRIMARY_EDUCATION_COMPLETE,
    PRIMARY_EDUCATION_INCOMPLETE,
    SECONDARY_EDUCATION_COMPLETE,
    SECONDARY_EDUCATION_INCOMPLETE,
    SUPERIOR_EDUCATION_COMPLETE,
    SUPERIOR_EDUCATION_INCOMPLETE,
    POST_GRADUATED,
    MASTER,
    DOCTORATE;

    private static EducationalLevel fromName(String value) {
        if ( StringUtils.isBlank( value ) ) {
            return null;
        }

        for( EducationalLevel educationalLevel: values() ) {
            if( educationalLevel.name().equals( value ) ) {
                return educationalLevel;
            }
        }
        return null;
    }
}
