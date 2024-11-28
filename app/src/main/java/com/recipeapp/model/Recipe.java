package com.recipeapp.model;
import java.util.ArrayList;
public class Recipe {
    /* name,ArraysList<Ingredient>のフィールドを設定
     *コンストラクタを設置
     * 各フィールドのアクセサを設置
     */

    private String name;

    private ArrayList<Ingredient> ingredients;

    public Recipe(String name, ArrayList<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
}
