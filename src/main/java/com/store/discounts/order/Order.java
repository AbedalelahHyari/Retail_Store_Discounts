package com.store.discounts.order;

import com.store.discounts.user.User;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user", nullable = false)
    private User user;

    @Column(name = "sub_total", nullable = false)
    private Integer subTotal;

    @Column(name = "discount_value", nullable = false)
    private Integer discount;

    @Column(name = "net_payable", nullable = false)
    private Integer TotalAmount;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        TotalAmount = totalAmount;
    }

    public Order(User user, Integer subTotal, Integer discount, Integer totalAmount) {
        this.user = user;
        this.subTotal = subTotal;
        this.discount = discount;
        TotalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", subTotal=" + subTotal +
                ", discount=" + discount +
                ", TotalAmount=" + TotalAmount +
                '}';
    }
}
