package com.example.octubre13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    private ImageView ivavatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        loadImage();
    }

    private void initWidgets() {
        ivavatar = findViewById(R.id.iv_avatar);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://depor.com/resizer/dFX3j034-CJgT9Mpb4d5sVopRp4=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/5UUV6NB7PJHALDU7WOFJBGKKH4.jpg")
                .into(ivavatar);
    }
}