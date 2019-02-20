package com.example.hzemy.hello;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import java.util.Scanner;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public void switchToFragment1() {
        FragmentManager man = getSupportFragmentManager();
        man.beginTransaction().replace(R.id.title_data, new Fragment()).commit();
    }

    public void switchToFragment2() {
        FragmentManager man = getSupportFragmentManager();
        man.beginTransaction().replace(R.id.title_journal, new Fragment()).commit();
    }

    public void switchToFragment3() {
        FragmentManager man = getSupportFragmentManager();
        man.beginTransaction().replace(R.id.title_history, new Fragment()).commit();
    }

    private TextView mTextMessage;
  /*  public void buttonOnClick(View v)
    {
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { */




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.title_profile: {
                    mTextMessage.setText("Profile");
                    // startActivity(new Intent(MainActivity.this, MainActivity.class));
            }

                    return true;
                case R.id.title_data: {
                    mTextMessage.setText(R.string.title_data);
                    //startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    switchToFragment1();


                }
                return true;
                case R.id.title_journal: {
                    mTextMessage.setText(R.string.title_journal);
                    switchToFragment2();
                   // startActivity(new Intent(MainActivity.this, Main3Activity.class));

                }
                return true;
                case R.id.title_history: {
                    mTextMessage.setText(R.string.title_history);
                    switchToFragment3();
                    //startActivity(new Intent(MainActivity.this, Main4Activity.class));

                }
                return true;
            }
            return false;
        }
    };

        private EditText ageMessage;
    private EditText weightMessage;

    private EditText heightMessage;
    public void textBoxConvertion()

    {
        ageMessage = (EditText) findViewById(R.id.ageText);
       weightMessage = (EditText) findViewById(R.id.weightText);
     heightMessage = (EditText) findViewById(R.id.heightText);


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}



}
