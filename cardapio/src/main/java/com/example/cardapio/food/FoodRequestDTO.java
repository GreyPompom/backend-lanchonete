package com.example.cardapio.food;

public record FoodRequestDTO (String title, String image, Integer price ) {

    public FoodRequestDTO(Food food){
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}
