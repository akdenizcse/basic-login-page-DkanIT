package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userName ;
    private EditText userPassword ;
    private TextView Info ;
    private Button loginButton ;
    private int Counter=5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.username);
        userPassword = (EditText)findViewById(R.id.userpassword);
        Info = (TextView) findViewById(R.id.passwordinfo);
        loginButton = (Button)findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(),userPassword.getText().toString());
            }
        });
    }
private void validate (String uname, String upassword){
        if(uname.equals("Admin" )&& upassword.equals("1234")){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    else{
        Counter--;
        Info.setText("Password Remains " + Counter);
        if(Counter==0){
            loginButton.setEnabled(false);
            Info.setText("We have no Captcha Restart Man :)) " );
        }

    }
}


}