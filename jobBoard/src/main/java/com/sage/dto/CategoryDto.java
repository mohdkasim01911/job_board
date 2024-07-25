package com.sage.dto;

import lombok.Data;

@Data
public class CategoryDto {

    private String categoryName;

    private Boolean status;

    private int sortOrder;
}
