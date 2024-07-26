package com.sage.mapper;

import com.sage.dto.CategoryDto;
import com.sage.entity.Category;

public class CategoryMapper {

    public static CategoryDto mapToCategoryDto(Category category, CategoryDto categoryDto){

         categoryDto.setCategoryName(category.getCategoryName());
         categoryDto.setSortOrder(category.getSortOrder());
         categoryDto.setStatus(category.isStatus());
         return categoryDto;
    }

    public static Category mapToCategory(Category category, CategoryDto categoryDto){

        category.setCategoryName(categoryDto.getCategoryName());
        category.setSortOrder(categoryDto.getSortOrder());
        category.setStatus(categoryDto.isStatus());
        return category;
    }

}
