package com.example.fruitsbasket.extensions

import android.widget.ImageView
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(com.example.fruitsbasket.R.drawable.erro)
        error(com.example.fruitsbasket.R.drawable.erro)
        placeholder(com.example.fruitsbasket.R.drawable.placeholder)
    }
}