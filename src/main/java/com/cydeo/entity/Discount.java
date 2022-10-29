package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Discount extends BaseEntity{
    private BigDecimal discount;
    private DiscountType discountType;
    private String name;
}
