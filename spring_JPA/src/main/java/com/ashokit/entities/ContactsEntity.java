package com.ashokit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="contacts")
public class ContactsEntity {
    @Id
    @Column(name="contact_id")
    private  Integer contactId;
    @Column(name="contact_name")
    private String contactName;
    @Column(name="contact_number")
    private  Integer contactNumber;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "ContactsEntity{" +
                "contactId=" + contactId +
                ", contactName='" + contactName + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
