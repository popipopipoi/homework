package com.ohgiraffers.model.dto;

import java.util.List;

public class MenuDTO {
    private int code;
    private String name;
    private int price;

    private List<CategoryDTO> categoryList;
    private String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(int code, String name, int price, List<CategoryDTO> categoryList, String orderableStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryList = categoryList;
        this.orderableStatus = orderableStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<CategoryDTO> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryDTO> categoryList) {
        this.categoryList = categoryList;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryList=" + categoryList +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }


}

