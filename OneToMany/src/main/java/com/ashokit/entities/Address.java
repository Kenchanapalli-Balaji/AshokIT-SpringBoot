package com.ashokit.entities;

import jakarta.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addrId;
    private String city;
    private String state;
    private String type;
    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;

    public Address(){}

    public Address(String city, String state, String type) {
        this.city = city;
        this.state = state;
        this.type = type;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", employee=" + employee +
                '}';
    }
}
