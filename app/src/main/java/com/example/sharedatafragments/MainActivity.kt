package com.example.sharedatafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedatafragments.R

class MainActivity : AppCompatActivity(),DataCommunicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment1=Fragment_1()
        supportFragmentManager.beginTransaction().replace(
            R.id.container,fragment1
        ).commit()
    }

    override fun sendData(data: String) {
        val bundle=Bundle()
        bundle.putString("inputText",data)
        val fragment2=Fragment_2()
        fragment2.arguments=bundle
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment2).commit()

    }


}