package com.ashokit.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Entity
public class Passport
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passportId;
    private String passportNumber;
    private LocalDate issueDate;
    private LocalDate expDate;
    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;

    public Passport(){}
    public Passport(String passportNumber, LocalDate issueDate, LocalDate expDate) {
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.expDate = expDate;
    }

    public Integer getPassportId() {
        return passportId;
    }

    public void setPassportId(Integer passportId) {
        this.passportId = passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
