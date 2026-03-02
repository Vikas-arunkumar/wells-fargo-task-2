package com.wellsfargo.counselor.entity;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    
    @ManyToOne
    @JoinColumn(name="client_id",nullable=false)
    private Client client;
    
    @Column
    private LocalDate creationDate;

    protected Portfolio()
    {

    }

    public Portfolio(LocalDate creationDate)
    {
        this.creationDate=creationDate;
    }

    public long getPortfolioId()
    {
        return portfolioId;
    }
    
    public Client getClient()
    {
        return client;
    }

    public LocalDate getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate)
    {
        this.creationDate=creationDate;
    }
}
