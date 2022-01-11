package com.example.demohrms.entities.concretes;

import com.example.demohrms.entities.constants.ValidationMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_EMAIL)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_EMAIL)
    @Column(name = "email")
    private String email;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_PASSWORD)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_PASSWORD)
    @Column(name ="password")
    private String password;


}
