package com.recipeapp.datahandler;
import java.util.ArrayList;
import java.io.IOException;

import com.recipeapp.model.Recipe;

public interface DataHandler {
    /* getMode(),readDate(),writeDate(),searchdate()
     * のメソッドを定義
     */

    public String getMode();//

    public ArrayList<Recipe> readData() throws IOException;

    public void writeData(Recipe recipe) throws IOException;

    public ArrayList<Recipe> searchData(String keyword) throws IOException;


    
    
}
