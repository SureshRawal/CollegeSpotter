package com.example.collegespotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.CollegeAdapter;
import model.College;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCollege = findViewById(R.id.rvCollege);

        List<College> collegeList = new ArrayList<>();

        collegeList.add(new College("softwarica","Dillibazar","BIT",10, R.drawable.softwarica));
        collegeList.add(new College("Islington","KamalPokhari","BIT",91,R.drawable.islington));
        collegeList.add(new College("softwarica","Dillibazar","BIT",10, R.drawable.softwarica));
        collegeList.add(new College("Islington","KamalPokhari","BIT",91,R.drawable.islington));
        collegeList.add(new College("softwarica","Dillibazar","BIT",10, R.drawable.softwarica));
        collegeList.add(new College("Islington","KamalPokhari","BIT",91,R.drawable.islington));
        collegeList.add(new College("softwarica","Dillibazar","BIT",10, R.drawable.softwarica));
        collegeList.add(new College("Islington","KamalPokhari","BIT",91,R.drawable.islington));

        CollegeAdapter collegeAdapter = new CollegeAdapter(getApplicationContext(),collegeList);
        rvCollege.setAdapter(collegeAdapter);
        rvCollege.setLayoutManager(new LinearLayoutManager(this));
    }
}
