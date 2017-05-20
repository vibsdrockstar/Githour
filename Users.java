package com.example.vibhor.githour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Spinner;

public class Users extends AppCompatActivity {
    Spinner spuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        spuser =(Spinner) findViewById(R.id.spuser);
    }
    public void  getInfo(View view){
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("details",spuser.getSelectedItem().toString());
        startActivity(intent);
    }
}
