package com.store.discounts.order;

import com.store.discounts.user.User;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    ///////////////////////////////////////////////////////////////////////
/*    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;*/
    private String userName;
    ////////////////////////////////////////////////////////////////////
    @Column(name = "sub_total", nullable = false)
    private Double subTotal;
    /////////////////////////////////////////////////////////////////
    @Column(name = "discount_value", nullable = false)
    private Double discount;
    ///////////////////////////////////////////////////////////////
    @Column(name = "net_payable", nullable = false)
    private Double TotalAmount;

    /////////////////////////////////////////
    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", subTotal=" + subTotal +
                ", discount=" + discount +
                ", TotalAmount=" + TotalAmount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        TotalAmount = totalAmount;
    }

    public Order(String userName, Double subTotal, Double discount, Double totalAmount) {
        this.userName = userName;
        this.subTotal = subTotal;
        this.discount = discount;
        TotalAmount = totalAmount;
    }
}