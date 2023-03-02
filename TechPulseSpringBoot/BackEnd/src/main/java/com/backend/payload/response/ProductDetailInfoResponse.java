package com.backend.payload.response;

import com.backend.dto.ProductDetailInfoDto;
import com.backend.model.product.Product;

import java.util.List;

public class ProductDetailInfoResponse {
    private Product product;

    private List<ProductDetailInfoDto> productOrderDetailDtoList;

    public ProductDetailInfoResponse() {
    }

    public ProductDetailInfoResponse(Product product, List<ProductDetailInfoDto> productOrderDetailDtoList) {
        this.product = product;
        this.productOrderDetailDtoList = productOrderDetailDtoList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ProductDetailInfoDto> getProductOrderDetailDtoList() {
        return productOrderDetailDtoList;
    }

    public void setProductOrderDetailDtoList(List<ProductDetailInfoDto> productOrderDetailDtoList) {
        this.productOrderDetailDtoList = productOrderDetailDtoList;
    }
}
