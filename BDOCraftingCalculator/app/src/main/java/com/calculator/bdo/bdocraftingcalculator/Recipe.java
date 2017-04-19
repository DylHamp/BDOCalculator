package com.calculator.bdo.bdocraftingcalculator;

import java.util.ArrayList;

/**
 * Created by dhampton on 4/12/17.
 */

public class Recipe {
    public Recipe(String name, ArrayList<Item> recipe){
        this.name = name;
        this.recipe = recipe;
    }

    private String name;
    private ArrayList<Item> recipe;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Item> getRecipe(){
        return this.recipe;
    }

    public void setRecipe(ArrayList<Item> recipe){
        this.recipe = recipe;
    }
}
