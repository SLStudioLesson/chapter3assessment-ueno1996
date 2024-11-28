package com.recipeapp.model;

public class Ingredient {

    /* nameフィールドの設置
     * nameのアクセサを設置
     */

    private String name;

    public Ingredient(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
