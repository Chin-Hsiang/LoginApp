package pu.csce.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Button dialbtn = findViewById(R.id.dialbtn);
        dialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phone = Uri.parse("tel://0800-123-456");
                Intent it = new Intent(Intent.ACTION_DIAL,phone);
                startActivity(it);
            }
        });
        Button webbtn = findViewById(R.id.webbtn);
        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("http://www.google.com");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });
        Button exitbtn = findViewById(R.id.exitbtn);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}