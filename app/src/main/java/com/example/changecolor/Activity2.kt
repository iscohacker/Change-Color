package com.example.changecolor

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.changecolor.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {


    private val binding by lazy { Activity2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.apply {
            mySwitch.isChecked = MyColor.svich

            qora.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#000000"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#000000"
                    MyColor.svich = mySwitch.isChecked
                }
            }
            sariq.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#FFEB3B"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#FFEB3B"
                    MyColor.svich = mySwitch.isChecked
                }

            }
            qizil.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#FF0000"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#FF0000"
                    MyColor.svich = mySwitch.isChecked
                }
            }
            yashil.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#01C809"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#01C809"
                    MyColor.svich = mySwitch.isChecked
                }
            }
            kok.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#0023FF"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#0023FF"
                    MyColor.svich = mySwitch.isChecked
                }
            }
            pushti.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#FF00F2"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#FF00F2"
                    MyColor.svich = mySwitch.isChecked
                }

            }
            binafsha.setOnClickListener {
                if (mySwitch.isChecked) {
                    MyColor.color = "#9C27B0"
                    MyColor.svich = mySwitch.isChecked
                    finish()
                } else {
                    MyColor.color = "#9C27B0"
                    MyColor.svich = mySwitch.isChecked
                }
            }
        }
    }
}
