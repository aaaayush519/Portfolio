package com.SpringBoot.Portfolio.repos;

import com.SpringBoot.Portfolio.entity.ContactMe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMeRepos extends JpaRepository<ContactMe, Integer> {
    ContactMe save(ContactMe contactMe);
}
