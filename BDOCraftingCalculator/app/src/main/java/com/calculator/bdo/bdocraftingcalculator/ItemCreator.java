package com.calculator.bdo.bdocraftingcalculator;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhampton on 4/12/17.
 */

public class ItemCreator {
    public ItemCreator(){
        this.recipes = createRecipes();
    };

    private Map<String, Recipe> recipes;

    public Map<String, Recipe> createRecipes(){
        Map<String, Recipe> recipes = new HashMap<>();
        String TAG = "ItemCreator";
        Recipe Beer = new Recipe("Beer", new ArrayList<>(Arrays.asList(new Item("Grain", "Does Grainy stuff.", 5), new Item("Mineral Water", "Is water that has been changed.", 6),
                new Item("Sugar", "Is sweet.", 1), new Item("Leavening Agent", "does some weird stuff.", 2))));
        recipes.put("Beer", Beer);
        return recipes;
    }

    public Map<String, Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Map<String, Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipe(String name, Recipe recipe){
        this.recipes.put(name, recipe);
    }
}
