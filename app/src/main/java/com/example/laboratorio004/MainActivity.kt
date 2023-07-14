package com.untels.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFollow.setOnClickListener{
            var status = btnFollow.getText().toString()
            if (status.equals("Follow me")){
                imgAgregar.setImageDrawable(getDrawable(R.drawable.friends))
                txtFollowers.setText("151")
                btnFollow.setText("Unfollow")
            }
            if (status.equals("Unfollow")){
                imgAgregar.setImageDrawable(getDrawable(R.drawable.add))
                txtFollowers.setText("150")
                btnFollow.setText("Follow me")
            }
        }
    }
}