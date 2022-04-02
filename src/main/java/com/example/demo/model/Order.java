package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    ////////////////////////////////////////////////////////////////////
    @Column(name = "sub_total", nullable = false)
    private Integer subTotal;
    /////////////////////////////////////////////////////////////////
    @Column(name = "discount_value", nullable = false)
    private Double discountValue;
    ///////////////////////////////////////////////////////////////
    @Column(name = "net_payable")
    private Integer totalAmount;

}
