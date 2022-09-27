package pu.csce.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.login_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name =findViewById(R.id.editName);
                EditText password =findViewById(R.id.editPassword);
                if((name.getText().toString().equals("Hsiang"))&&
                (password.getText().toString().equals("Shirly")))
                {
                    Intent it = new Intent(getApplicationContext(),UserActivity.class);
                    startActivity(it);
                    Toast.makeText(getApplicationContext(), "登入成功", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "登入失敗", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}