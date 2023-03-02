package com.backend.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String productCode;
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
    @OneToMany(mappedBy = "product")
    private List<ImgUrlProduct> imgUrlProductList;

    public Product() {
    }

    public Product(Long productId, String productName, String productCode, String specifications, String size, String weight, String manufacturer, String origin, String guarantee, boolean deletedFlag, Category category, List<ImgUrlProduct> imgUrlProductList) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
