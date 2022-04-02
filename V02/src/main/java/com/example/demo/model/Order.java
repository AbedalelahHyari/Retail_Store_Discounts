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
    ///////////////////////////////////////////////////////////////////////
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    ////////////////////////////////////////////////////////////////////
    @Column(name = "sub_total", nullable = false)
    private Double subTotal;
    /////////////////////////////////////////////////////////////////
    @Column(name = "discount_value", nullable = false)
    private Double discount;
    ///////////////////////////////////////////////////////////////
    @Column(name = "net_payable", nullable = false)
    private Double TotalAmount;

}
