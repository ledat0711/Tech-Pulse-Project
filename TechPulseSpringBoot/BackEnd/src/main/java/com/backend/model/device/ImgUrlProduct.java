package com.backend.model.device;


import javax.persistence.*;

@Entity
public class ImgUrlProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    private Integer flagDelete;
    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice")
    private Device device;

    public ImgUrlProduct() {
    }

    public ImgUrlProduct(Long id, String url, Integer flagDelete, Device device) {
        this.id = id;
        this.url = url;
        this.flagDelete = flagDelete;
        this.device = device;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Integer flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
