package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{
    private String cartState;
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;
}
