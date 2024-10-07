package com.SpringBoot.Portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactMeDto {

    private String fullName;

    private String email;

    private String phoneNumber;

    private String subject;

    private String message;
}
