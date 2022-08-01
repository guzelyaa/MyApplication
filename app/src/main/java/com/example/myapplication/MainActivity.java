package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView enter;
    private TextView login;
    private TextView forgot;
    private TextView click;
    private EditText email;
    private EditText password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.enter);
        login = findViewById(R.id.login);
        forgot = findViewById(R.id.forgot);
        click = findViewById(R.id.click);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.enterr);

        addOnContextAvailableListener();
        button.setOnClickListener(view -> {
            if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(MainActivity.this, "Вы успешно зарегистировались!", Toast.LENGTH_SHORT).show();
                enter.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                forgot.setVisibility(View.GONE);
                click.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
            } else {
                Toast.makeText(MainActivity.this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });
    }


    boolean isEmpty = true;

    private void addOnContextAvailableListener() {
        email.addTextChangedListener(new TextWatcher() {

            @SuppressLint("ResourceAsColor")
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(R.color.grey);
            }

            @SuppressLint({ "ResourceAsColor"})
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(R.color.orange);
            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable editable) {
                button.setBackgroundColor(R.color.grey);
            }
        });
        password.addTextChangedListener(new TextWatcher() {

            @SuppressLint("ResourceAsColor")
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(R.color.grey);
            }

            @SuppressLint({ "ResourceAsColor"})
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(R.color.orange);
            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable editable) {
                button.setBackgroundColor(R.color.grey);
            }
        });
    }
}