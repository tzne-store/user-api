package br.com.store.userapi.entities;

import br.com.store.userapi.enums.EducationalLevel;
import br.com.store.userapi.enums.Gender;
import br.com.store.userapi.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document( collection = "user" )
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String cpf;
    private Timestamp birthDate;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private EducationalLevel educationalLevel;
    private PhoneNumber phoneNumber;
    private Address address;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedDate;
    private String email;
    private String password;
    private boolean delete;
    private boolean active;
}