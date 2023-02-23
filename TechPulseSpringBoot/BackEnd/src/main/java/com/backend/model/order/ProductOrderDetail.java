package com.backend.model.order;

import com.backend.model.device.Device;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class ProductOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;

    private Integer deleteStatus;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice")
    private Device device;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "product_order_id", referencedColumnName = "id")
    private ProductOrder productOrder;

    public ProductOrderDetail() {
    }

    public ProductOrderDetail(Integer id, Integer quantity, Integer deleteStatus, Device device, ProductOrder productOrder) {
        this.id = id;
        this.quantity = quantity;
        this.deleteStatus = deleteStatus;
        this.device = device;
        this.productOrder = productOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }
}
