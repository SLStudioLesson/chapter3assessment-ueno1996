package com.recipeapp.datahandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.recipeapp.model.Ingredient;
import com.recipeapp.model.Recipe;

public class CSVDataHandler implements DataHandler{

    private String filePath;

    public CSVDataHandler(){
        this.filePath = "app/src/main/resources/recipes.csv";
    }

    public CSVDataHandler(String filePath){

        this.filePath = filePath;
    }

    public String getMode(){
        return "CSV";
    }
    /* 
     * recipes.csvからテキストデーター1行づつ読み込み
     * 変数lineに代入する。
     * 次に、メニューと具材をわけて配列に代入する。
     * メニューと具材の配列に入っている具材をsplitで、"," づつに具材配列に入れていく
     * ingredientオブジェクトにString[] ingredientName配列を代入したものを、ingredientsListに追加する。
     * Recipeオブジェクトにメニュー名とingredientsListを代入したものを、ArrayList<Recipe> recipe追加していく。
     * ArrayList<Recipe> recipeを返す
     */
    public ArrayList<Recipe> readData() throws IOException{
        ArrayList<Recipe> recipe = new ArrayList<>();
        
        
        try(BufferedReader reader = new BufferedReader(new FileReader(this.filePath))){
            
            String line;
            while((line = reader.readLine()) != null){
                //recipes.add(line);
                String[] pair = line.split(",", 2);
                
                String[] ingredientName = pair[1].split(",");
                
                ArrayList<Ingredient> ingredients = new ArrayList<>();
                for(int i = 0; i < ingredientName.length; i++){
                    ingredients.add(new Ingredient(ingredientName[i]));
                }

                    recipe.add(new Recipe(pair[0], ingredients));
                

            }
            return recipe;
        }catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
        
        return null;
    }
    
    public void writeData(Recipe recipe) throws IOException{

    }

    public ArrayList<Recipe> searchData(String keyword) throws IOException{
        return null;
    }
}
