package com.animator_abhi.gcethackathon.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.animator_abhi.gcethackathon.R;
import com.animator_abhi.gcethackathon.Startup.StartupMain;

public class StudentRegister extends AppCompatActivity {

    Button student_register;
EditText student_name,student_college,student_email,student_interest,student_idea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);
        student_name = (EditText) findViewById(R.id.Student_Name);
        student_college = (EditText) findViewById(R.id.Student_College);
        student_email = (EditText) findViewById(R.id.investor_description);
        student_interest = (EditText) findViewById(R.id.investor_potential);
        student_idea = (EditText) findViewById(R.id.Student_Idea);
        student_register=(Button)findViewById(R.id.Student_Register);

        student_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentRegister.this,StartupMain.class);
                i.putExtra("stu_n",student_name.getText().toString());
                i.putExtra("stu_c",student_college.getText().toString());
                i.putExtra("stu_e",student_email.getText().toString());
                i.putExtra("stu_in",student_interest.getText().toString());
                i.putExtra("stu_id",student_idea.getText().toString());
                startActivity(i);
            }
        });

    }
}
