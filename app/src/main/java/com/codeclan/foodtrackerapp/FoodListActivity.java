package com.codeclan.foodtrackerapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FoodListActivity extends AppCompatActivity {

    Button newDiaryEntry;
    ArrayList<FoodItem> foodItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        foodItemList = Manager.getListFromSharedPreferences(this);

        FoodListAdapter foodListAdapter = new FoodListAdapter(this, foodItemList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(foodListAdapter);

        newDiaryEntry = (Button)findViewById(R.id.button);
    }

    public void setNewEntryButtonClicked(View button){
        Intent intent = new Intent(this, AddFoodItemActivity.class);
        startActivity(intent);
    }

    public void onFoodItemClicked(View textView){
        FoodItem foodItem = (FoodItem) textView.getTag();

        Intent intent = new Intent(this, ViewFoodItemActivity.class);
        intent.putExtra("foodItem", foodItem);
        startActivity(intent);
    }

    public void setDeleteButtonClicked(View button){

        int foodItemPosition = (int) button.getTag();

        foodItemList = Manager.getListFromSharedPreferences(this);
        foodItemList.remove(foodItemPosition);

        Manager.saveListInSharedPreferences(this, foodItemList);

        Intent intent = new Intent(this, FoodListActivity.class);
        startActivity(intent);

        Toast.makeText(this, "Item has been deleted!", Toast.LENGTH_LONG).show();
    }

    public void setAllButtonClicked(View button){
        Intent intent = new Intent(this, FoodListActivity.class);
        startActivity(intent);
    }

    public void setJanuaryButtonClicked(View button){
        String input = "January";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setFebruaryButtonClicked(View button){
        String input = "February";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setMarchButtonClicked(View button){
        String input = "March";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setAprilButtonClicked(View button){
        String input = "April";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setMayButtonClicked(View button){
        String input = "May";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setJuneButtonClicked(View button){
        String input = "June";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setJulyButtonClicked(View button){
        String input = "July";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setAugustButtonClicked(View button){
        String input = "August";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setSeptemberButtonClicked(View button){
        String input = "September";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setOctoberButtonClicked(View button){
        String input = "October";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setNovemberButtonClicked(View button){
        String input = "November";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

    public void setDecemberButtonClicked(View button){
        String input = "December";
        Intent intent = new Intent(this, MonthlyActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);
    }

}
