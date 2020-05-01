package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        RelativeLayout relativeLayout;
        relativeLayout=findViewById(R.id.relativelayout);

        switch (item.getItemId()){
            case R.id.id_blue:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                break;
            case R.id.id_red:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                break;
        }


        return true;
    }
}
