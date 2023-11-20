package com.ashokIT.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Passport
{
    @Id
    private Integer passportNo;
    private LocalDateTime issueDate;
    private LocalDateTime expDate;
    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
    private Person person;
    public Passport(){}

    public Passport(Integer passportNo, LocalDateTime issueDate, LocalDateTime expDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expDate = expDate;
    }

    public Integer getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(Integer passportNo) {
        this.passportNo = passportNo;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDateTime getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDateTime expDate) {
        this.expDate = expDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
