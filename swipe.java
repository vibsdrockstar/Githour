package com.example.vibhor.weatherupdate;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

import java.util.Random;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        final SwipeRefreshLayout swipeRefreshLayout =(SwipeRefreshLayout) findViewById(R.id.introswipe);
        final TextView textView =(TextView) findViewById(R.id.tv_about);
        swipeRefreshLayout.setColorSchemeResources(R.color.refresh,R.color.refresh1,R.color.refresh2);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                (new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                        int min = 60;
                        int max = 90;
                        Random random = new Random();
                        int i=random.nextInt(max-min+1)+min;
                        textView.setText(String.valueOf(i));

                    }
                },3000);
            }
        });

    }
}
