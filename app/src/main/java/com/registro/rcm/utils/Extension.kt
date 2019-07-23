package com.registro.rcm.utils

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.ViewTarget
import com.registro.rcm.model.BuscaNovio

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun normalGlideAssigment(context: Context, imgPath: String, targetView: ImageView): ViewTarget<ImageView, Bitmap> {
    return Glide.with(context)
        .asBitmap()
        .load(imgPath)
        .into(targetView)
}

fun titleBuscaNovio(novio: BuscaNovio): String {
    return "${novio.mascota.name} tiene ${novio.mascota.edad} años, raza ${novio.mascota.raza}"
}