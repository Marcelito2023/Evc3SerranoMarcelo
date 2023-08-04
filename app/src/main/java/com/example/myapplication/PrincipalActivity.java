package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityPrincipalBinding;
import com.example.myapplication.fragments.HomeFragment;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.tbPlayzoom);
        addHomeFragment();


    }

    private void addHomeFragment(){
        getSupportFragmentManager().beginTransaction().add(binding.fcvMain.getId(), new HomeFragment()).commit();


    }

}