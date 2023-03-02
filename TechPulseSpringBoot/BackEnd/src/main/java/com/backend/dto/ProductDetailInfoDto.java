package com.backend.dto;

public class ProductDetailInfoDto {
    private String title;

    private String content;

    public ProductDetailInfoDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ProductDetailInfoDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
