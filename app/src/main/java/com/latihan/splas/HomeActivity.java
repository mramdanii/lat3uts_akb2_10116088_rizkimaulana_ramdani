package com.latihan.splas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    private ViewPager pager;
    private Button button;
    private int[] layouts = {R.layout.fragment_first_slide, R.layout.fragment_second_slide, R.layout.fragment_third_fragment};
    private pagerAdaptor mpagerAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        pager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdaptor = new pagerAdaptor(layouts, this);
        pager.setAdapter(mpagerAdaptor);






    }
    public void next(View view){
        Intent in = new Intent(this, Menu.class);
        startActivity(in);

    }




}