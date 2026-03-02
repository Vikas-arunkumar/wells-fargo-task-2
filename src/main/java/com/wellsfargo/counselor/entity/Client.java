package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name="advisor_id",nullable=false)
    private Advisor advisor;

    @Column(nullable=false)
    private String firstname;

    @Column(nullable=false)
    private String lastname;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String phone;

    @Column(nullable=false)
    private String email;

    protected Client(){

    }
    public Client(Advisor advisor,String firstname,String lastname,String address,String phone,String email)
    {
        this.advisor=advisor;
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

    public long getClientId()
    {
        return clientId; 
    }

    public String getFirstName()
    {
        return firstname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setFirstName(String firstname)
    {
        this.firstname=firstname;
    }

    public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public void setPhone(String phone)
    {
        this.phone=phone;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
