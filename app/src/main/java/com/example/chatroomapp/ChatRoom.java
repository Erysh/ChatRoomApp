package com.example.chatroomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatroomapp.databinding.ActivityChatRoomBinding;

public class ChatRoom extends AppCompatActivity {

    ActivityChatRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}