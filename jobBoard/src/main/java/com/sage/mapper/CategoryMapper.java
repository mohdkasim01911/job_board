package com.sage.mapper;

import com.sage.dto.CategoryDto;

public class CategoryMapper {

    public static CategoryDto mapToCategoryDto(entity.Category category, CategoryDto categoryDto){

         categoryDto.setCategoryName(category.getCategoryName());
         categoryDto.setSortOrder(category.getSortOrder());
         categoryDto.setStatus(category.isStatus());
         return categoryDto;
    }

    public static entity.Category mapToCategory(entity.Category category, CategoryDto categoryDto){

        category.setCategoryName(categoryDto.getCategoryName());
        category.setSortOrder(categoryDto.getSortOrder());
        category.setStatus(categoryDto.isStatus());
        return category;
    }

}
