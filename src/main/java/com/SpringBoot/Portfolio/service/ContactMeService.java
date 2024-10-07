package com.SpringBoot.Portfolio.service;

import com.SpringBoot.Portfolio.dto.ContactMeDto;
import com.SpringBoot.Portfolio.entity.ContactMe;
import com.SpringBoot.Portfolio.repos.ContactMeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMeService {
    @Autowired
    ContactMeRepos contactMeRepos;

    public void saveMessage(ContactMeDto contactMeDto) {
        ContactMe contactMe = new ContactMe();
        contactMe.setFullName(contactMeDto.getFullName());
        contactMe.setEmail(contactMeDto.getEmail());
        contactMe.setPhoneNumber(contactMeDto.getPhoneNumber());
        contactMe.setSubject(contactMeDto.getSubject());
        contactMe.setMessage(contactMeDto.getMessage());
        System.out.println("Contact Me"+contactMe.toString());
        contactMeRepos.save(contactMe);
    }
}
