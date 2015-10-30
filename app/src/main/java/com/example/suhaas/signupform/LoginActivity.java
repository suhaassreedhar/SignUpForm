package com.example.suhaas.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    Button mSubmitButton;
    EditText mUsernameInput;
    EditText mPasswordInput;
    EditText mConfirmationInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSubmitButton = (Button) findViewById(R.id.submit_button);
        mUsernameInput = (EditText) findViewById(R.id.username_input);
        mPasswordInput = (EditText) findViewById(R.id.password_input);
        mConfirmationInput = (EditText) findViewById(R.id.confirm_input);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameInput.getText().toString();
                String password = mPasswordInput.getText().toString();
                String confirmation = mConfirmationInput.getText().toString();

                if(password.equals(confirmation)){
                    User newUser = new User(username,password);

                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);

                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
}
