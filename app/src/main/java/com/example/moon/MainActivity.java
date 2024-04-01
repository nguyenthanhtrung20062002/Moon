package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moon.activities.AudioPlayerActivity;
import com.example.moon.fragment.BookDetailFragment;
import com.example.moon.fragment.ExploreFragment;
import com.example.moon.fragment.HomeFragment;
import com.example.moon.fragment.PaymentFragment;
import com.example.moon.fragment.login.LoginEmailFragment;
import com.example.moon.fragment.login.LoginPassFragment;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AudioPlayerActivity.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setVisibility(View.GONE);
                Fragment fragment = new ExploreFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.activity, fragment).commit();
            }
        });
    }
}