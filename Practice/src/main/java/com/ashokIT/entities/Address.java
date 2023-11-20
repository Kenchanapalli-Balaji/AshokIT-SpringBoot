package com.ashokIT.entities;

import jakarta.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addrid;
    private String city;
    private String state;
    private String type;
    @ManyToOne
    @JoinColumn(name="personId")
    private Person person;

    public Address(){}

    public Address(String city, String state, String type) {
        this.city = city;
        this.state = state;
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAddrid() {
        return addrid;
    }

    public void setAddrid(Integer addrid) {
        this.addrid = addrid;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
