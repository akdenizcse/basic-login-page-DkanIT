package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView userinfo ;
    private Button Logout ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userinfo = findViewById(R.id.username);
        Logout = (Button)findViewById(R.id.logout);

      // userinfo.setText(findViewById(R.id.username));
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dologout();
            }
        });
    }


    private void dologout (){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);


    }
}