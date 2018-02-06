package br.com.livroandroid.hellofirebase.extensions

import android.os.Bundle

fun Map<String, String>.toBundle(): Bundle {
    val bundle = Bundle()
    for (key in keys) {
        bundle.putString(key, get(key))
    }
    return bundle
}