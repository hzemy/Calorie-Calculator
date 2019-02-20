package com.example.hzemy.hello;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main4Activity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.title_profile: {
                        mTextMessage.setText("Profile");
                        startActivity(new Intent(Main4Activity.this, MainActivity.class));
                    }

                    return true;
                    case R.id.title_data: {
                        mTextMessage.setText(R.string.title_data);
                        startActivity(new Intent(Main4Activity.this, Main2Activity.class));

                    }
                    return true;
                    case R.id.title_journal: {
                        mTextMessage.setText(R.string.title_journal);
                        startActivity(new Intent(Main4Activity.this, Main3Activity.class));

                    }
                    return true;
                    case R.id.title_history: {
                        mTextMessage.setText(R.string.title_history);
                        startActivity(new Intent(Main4Activity.this, Main4Activity.class));

                    }
                    return true;
                }
                return false;
            }
        };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);

            mTextMessage = (TextView) findViewById(R.id.message);
            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

            backButtonConfig();

        }
    private void backButtonConfig(){
        Button backButton4 = (Button)findViewById(R.id.backButton4);
        backButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();

            }

        });
    }


}
