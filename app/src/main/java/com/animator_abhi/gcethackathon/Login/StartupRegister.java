package com.animator_abhi.gcethackathon.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.animator_abhi.gcethackathon.R;
import com.animator_abhi.gcethackathon.Startup.StartupMain;

public class StartupRegister extends AppCompatActivity {
    Button startup_register;
    EditText startup_name,startup_founder,startup_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_register);
        startup_name = (EditText) findViewById(R.id.startup_name);
        startup_founder = (EditText) findViewById(R.id.startup_description);
        startup_description = (EditText) findViewById(R.id.startup_founder);
        startup_register = (Button) findViewById(R.id.startup_register);
        startup_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StartupRegister.this,StartupMain.class);
                i.putExtra("s_n",startup_name.getText().toString());
                i.putExtra("s_f",startup_founder.getText().toString());
                i.putExtra("s_d",startup_description.getText().toString());
                startActivity(i);
            }
        });


    }
}
