package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appdroid.greetx.Fragment.ImageFragment;
import com.appdroid.greetx.Fragment.TextFragment;

public class SubCat extends AppCompatActivity{
    TextView imageFrag, textFrag;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_cat);

        imageFrag = findViewById(R.id.textView14);
        textFrag = findViewById(R.id.textView15);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new ImageFragment()).commit();

        imageFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageFrag.setBackgroundResource(R.color.purple_700);
                textFrag.setBackgroundResource(R.color.black);
                getSupportFragmentManager().beginTransaction().add(R.id.container, new ImageFragment()).commit();
            }
        });

        textFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageFrag.setBackgroundResource(R.color.black);
                textFrag.setBackgroundResource(R.color.purple_700);
                getSupportFragmentManager().beginTransaction().add(R.id.container, new TextFragment()).commit();
            }
    });

}
}