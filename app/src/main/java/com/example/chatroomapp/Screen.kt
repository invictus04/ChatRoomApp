package com.example.chatroomapp

sealed class Screen(val route: String) {
    object LoginScreen:Screen("loginscreen")
    object SignUpScreen:Screen("signupscreen")
    object ChatRoomsScreen:Screen("chatroomscreen")
    object ChatScreen:Screen("chatscreen")
}