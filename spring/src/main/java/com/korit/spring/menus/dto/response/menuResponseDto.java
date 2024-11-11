package com.korit.spring.menus.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class menuResponseDto {
    private Long id;
    private String menu_name;
    private String image_url;
    private String menu_description;
    private int menu_price;
    private Boolean is_available;
    private String category;
}

