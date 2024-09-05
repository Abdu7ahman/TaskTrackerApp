package ru.abdur.SecurityApp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Data
@RequiredArgsConstructor
public class UserDto {

    @NotNull
    private String username;
    @NotNull
    @Length(min = 2, max = 20)
    private String firstName;
    @NotNull
    @Length(min = 2, max = 20)
    private String lastName;
    @Email
    private String email;
    @NotNull
    @Length(min = 8, max = 20)
    private String password;
}
