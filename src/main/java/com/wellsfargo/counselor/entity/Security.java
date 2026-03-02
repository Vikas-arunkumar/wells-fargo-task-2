package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolio_Id",nullable=false)
    private Portfolio portfolio;
    
    @Column
    private String name;

    @Column
    private String category;

    @Column
    private long PurchasePrice;

    @Column
    private LocalDate PurchaseDate;

    @Column
    private int Quantity;

    protected Security()
    {

    }

    public Security(String name,String category,long PurchasePrice,LocalDate PurchaseDate,int Quantity)
    {
        this.name=name;
        this.category=category;
        this.PurchasePrice=PurchasePrice;
        this.PurchaseDate=PurchaseDate;
        this.Quantity=Quantity;
    }

    public long getSecurityId()
    {
        return securityId;
    }

    public Portfolio getPortfolio()
    {
        return portfolio;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category=category;
    }

    public LocalDate getPurchaseDate()
    {
        return PurchaseDate;
    }

    public void setPurchaseDate(LocalDate PurchaseDate)
    {
        this.PurchaseDate=PurchaseDate;
    }

    public long getPurchasePrice()
    {
        return PurchasePrice;
    }

    public void setPurchasePrice(long PurchasePrice)
    {
        this.PurchasePrice=PurchasePrice;
    }

    public int getQuantity()
    {
        return Quantity;
    }

    public void setQuantity(int Quantity)
    {
        this.Quantity=Quantity;
    }

}
