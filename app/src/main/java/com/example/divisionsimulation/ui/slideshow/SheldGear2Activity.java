package com.example.divisionsimulation.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.divisionsimulation.R;

public class SheldGear2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sheldgearlayout2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("진정한 애국자");

        Intent intent = getIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
