package com.example.a8rv_as_horizantall_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.a8rv_as_horizantall_list.adapter.CustomAdapter;
import com.example.a8rv_as_horizantall_list.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<User> users = prepareUserList();
        refreshAdapter(users);
    }

    private List<User> prepareUserList() {
        List<User> users = new ArrayList<>();
        for (int i=1; i<21; i++){
            users.add(new User(i+" AbuBakr",i+" Akmal"));
        }
        return  users;
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
    }

    public void refreshAdapter(List<User> users){
        CustomAdapter adapter = new CustomAdapter(context,users);
        recyclerView.setAdapter(adapter);
    }
}