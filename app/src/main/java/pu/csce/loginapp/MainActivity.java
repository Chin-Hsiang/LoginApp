package pu.csce.loginapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
                EditText name = findViewById(R.id.editName);
                EditText password = findViewById(R.id.editPassword);
                if ((name.getText().toString().equals("Hsiang")) &&
                        (password.getText().toString().equals("0723"))) {
                    Bundle data = new Bundle();
                    data.putString("account", name.getText().toString());
                    data.putInt("age", 20);
                    Intent it = new Intent(getApplicationContext(), UserActivity.class);

                    it.putExtras(data);

                    startActivityForResult(it, 100);
                    Toast.makeText(getApplicationContext(), "登入成功", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "登入失敗", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            if (resultCode == 1000) {
                Bundle da=data.getExtras();
                String val=da.getString("key");
                Toast.makeText(getApplicationContext(), val, Toast.LENGTH_LONG).show();
            }

        }
    }

    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.id1:
                Toast.makeText(getApplicationContext() ,"select Item1", Toast.LENGTH_LONG).show();
                break;
            case R.id.id2:
                Toast.makeText(getApplicationContext() ,"select Item2", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}