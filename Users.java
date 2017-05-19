package com.example.vibhor.githour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Spinner;

public class Users extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        spinner =(Spinner) findViewById(R.id.users);
    }
    public void  getDetails(View view){
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("details",spinner.getSelectedItem().toString());
        startActivity(intent);
    }
}
