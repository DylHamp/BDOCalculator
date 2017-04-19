package com.calculator.bdo.bdocraftingcalculator;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

/**
 * A placeholder fragment containing a simple view.
 */
public class BeerCalculatorFragment extends ListFragment {
    public static final String TAG = "BeerCalculator";

    private TextView mTextView;

    private ItemCreator mItemCreator = new ItemCreator();
    private Map<String, Recipe> mRecipes = mItemCreator.getRecipes();
    private String mMessage;

    public BeerCalculatorFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Beer Calculator");

        Recipe[] values = mRecipes.values().toArray(new Recipe[mRecipes.values().size()]);

        RecipeAdapter adapter = new RecipeAdapter(values);
        setListAdapter(adapter);
        setHasOptionsMenu(true);
    }

    private class RecipeAdapter extends ArrayAdapter<Recipe> {
        public RecipeAdapter(Recipe[] recipe) {
            super(getActivity(), 0, recipe);
        }

        @Override
        public View getView(int posisition, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.fragment_beer_calculator, null);
            }

            Log.d(TAG, "Thing was opened.");

            TextView recipeTextView = (TextView) convertView.findViewById(R.id.list_item_textView);
            recipeTextView.setText("Stuff has happend");

            return convertView;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_beer_calculator, container, false);

        mTextView = (TextView) rootView.findViewById(R.id.list_item_textView);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        mMessage = "";

        for(Item item: mRecipes.get("Beer").getRecipe()){
            mMessage = mMessage + " " + item.getName();
        }
        mTextView.setText(mMessage);
        Log.e(TAG, mMessage);

    }
}
