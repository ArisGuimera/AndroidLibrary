package com.cursokotlin.aristibutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class AristiButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.component_btn_aristidevs, this, true)
        val btn = findViewById<ImageButton>(R.id.btnAristi)
        btn.setOnClickListener { Toast.makeText(context, "Soy un inutil", Toast.LENGTH_SHORT).show() }
    }
}