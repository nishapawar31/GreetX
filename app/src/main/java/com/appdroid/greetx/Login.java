package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView text2, next;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        text2 = findViewById(R.id.text2);
        next = findViewById(R.id.next);

        text2.setText(Html.fromHtml("By signing in you agree to our  <b><u><font color=cyan>Terms of use and Privacy Policy</font></u></b>"));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Login2.class));
            }
        });
    }

}

