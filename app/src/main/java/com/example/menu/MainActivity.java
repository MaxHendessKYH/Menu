package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startersBtn;
    Button mainCourseBtn;
    Button dessertsBtn;
    TextView item1_header;
    TextView item1_infoText;
    ImageView item1_img;
    TextView item2_header;
    TextView item2_infoText;
    ImageView item2_img;
    TextView item3_header;
    TextView item3_infoText;
    ImageView item3_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set buttons
        startersBtn = findViewById(R.id.starters_button);
        mainCourseBtn = findViewById(R.id.mainCourse_button);
        dessertsBtn = findViewById(R.id.dessert_button);
        //set txtviews and imgs
        item1_header = findViewById(R.id.item1Header);
        item1_infoText = findViewById(R.id.item1infotext);
        item1_img = findViewById(R.id.foodItem1);

        item2_header = findViewById(R.id.item2Header);
        item2_infoText = findViewById(R.id.item2Infotext);
        item2_img = findViewById(R.id.foodItem2);
        item3_header = findViewById(R.id.item3Header);
        item3_infoText = findViewById(R.id.item3_Info_Text);
        item3_img = findViewById(R.id.foodItem3);
        startersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showStartersMenu();
            }
        }) ;
        mainCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainCourseMenu();
            }
        }) ;
        dessertsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDessertMenu();
            }
        }) ;
    }
    public void showStartersMenu()
    {
        //Set item 1
        item1_header.setText( R.string.item1_Header_Starters);
        item1_infoText.setText(R.string.item1_Info_Starters);
        item1_img.setImageResource(R.drawable.apple);
        //Set item 2
        item2_header.setText( R.string.item2_Header_Starters);
        item2_infoText.setText(R.string.item2_Info_Starters);
        item2_img.setImageResource(R.drawable.delish_220823_witch_finger_cookies_031_horizontal_rv_web_1662059215);
        //Set item 3
        item3_header.setText( R.string.item3_Header_Starters);
        item3_infoText.setText(R.string.item3_Info_Starters);
        item3_img.setImageResource(R.drawable.halloween_party_snack_phantom_pierogi_pizza_pockets);
    }
    public void showMainCourseMenu()
    {
        //Set item 1
        item1_header.setText( R.string.item1_Header_MainCourse);
        item1_infoText.setText(R.string.item1_Info_MainCourse);
        item1_img.setImageResource(R.drawable.fresh_wild_mushroom_soup);
        //Set item 2
        item2_header.setText( R.string.item2_Header_MainCourse);
        item2_infoText.setText(R.string.item2_Info_MainCourse);
        item2_img.setImageResource(R.drawable.meats);
        //Set item 3
        item3_header.setText( R.string.item3_Header_MainCourse);
        item3_infoText.setText(R.string.item3_Info_MainCourse);
        item3_img.setImageResource(R.drawable.rfo_1400x919_monster_burgers_ea2d9eb9_3c70_4453_aca3_b48f9cc872c5_0_1400x919);
    }
    public void showDessertMenu()
    {
        // Set item 1
        item1_header.setText( R.string.item1_Header_Desserts);
        item1_infoText.setText(R.string.item1_Info_Desserts);
        item1_img.setImageResource(R.drawable.featured_gingerbread_cookies_recipe);
        // set item 2
        item2_header.setText( R.string.item2_Header_Desserts);
        item2_infoText.setText(R.string.item2_Info_Desserts);
        item2_img.setImageResource(R.drawable.apple_pie_classic_hero_0114_1);
        //Set item 3
        item3_header.setText( R.string.item3_Header_Desserts);
        item3_infoText.setText(R.string.item3_Info_Desserts);
        item3_img.setImageResource(R.drawable.pumpkinthingy);
    }
}