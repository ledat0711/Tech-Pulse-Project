package com.backend.model.order;

import com.backend.model.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String orderDate;

    private Integer deleteStatus;

    private Integer paymentStatus = 0;

    private Long totalMoney;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @JsonBackReference
    @OneToMany(mappedBy = "productOrder")
    private List<ProductOrderDetail> productOrderDetailSet;

    public ProductOrder() {
    }

    public ProductOrder(Integer id, String orderDate, Integer deleteStatus, Integer paymentStatus, Long totalMoney, User user, List<ProductOrderDetail> productOrderDetailSet) {
        this.id = id;
        this.orderDate = orderDate;
        this.deleteStatus = deleteStatus;
        this.paymentStatus = paymentStatus;
        this.totalMoney = totalMoney;
        this.user = user;
        this.productOrderDetailSet = productOrderDetailSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ProductOrderDetail> getProductOrderDetailSet() {
        return productOrderDetailSet;
    }

    public void setProductOrderDetailSet(List<ProductOrderDetail> productOrderDetailSet) {
        this.productOrderDetailSet = productOrderDetailSet;
    }
}
