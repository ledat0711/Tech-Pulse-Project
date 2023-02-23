package com.backend.model.device;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDevice;
    private String nameDevice;
    private String codeDevice;
    private String specifications;
    private String size;
    private String weight;
    private String manufacturer;
    private String origin;
    private String guarantee;
    private boolean deletedFlag = false;
    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "idCategory")
    private Category category;

    @JsonBackReference
    @OneToMany(mappedBy = "device")
    private List<ImgUrlProduct> imgUrlProductList;

    public Device() {
    }

    public Device(Long idDevice, String nameDevice, String codeDevice, String specifications, String size, String weight, String manufacturer, String origin, String guarantee, boolean deletedFlag, Category category, List<ImgUrlProduct> imgUrlProductList) {
        this.idDevice = idDevice;
        this.nameDevice = nameDevice;
        this.codeDevice = codeDevice;
        this.specifications = specifications;
        this.size = size;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.origin = origin;
        this.guarantee = guarantee;
        this.deletedFlag = deletedFlag;
        this.category = category;
        this.imgUrlProductList = imgUrlProductList;
    }

    public Long getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Long idDevice) {
        this.idDevice = idDevice;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public String getCodeDevice() {
        return codeDevice;
    }

    public void setCodeDevice(String codeDevice) {
        this.codeDevice = codeDevice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ImgUrlProduct> getImgUrlProductList() {
        return imgUrlProductList;
    }

    public void setImgUrlProductList(List<ImgUrlProduct> imgUrlProductList) {
        this.imgUrlProductList = imgUrlProductList;
    }
}
