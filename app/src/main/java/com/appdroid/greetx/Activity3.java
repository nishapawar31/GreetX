package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.appdroid.greetx.R;

public class Activity3 extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        img = (ImageView) findViewById(R.id.imageView7);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity(); }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(this, category.class);
        startActivity(intent);
    }
}