package com.example.mad2_63_b6

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.coordinatorlayout.widget.CoordinatorLayout

class MainActivity : AppCompatActivity() {
    val Tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display("on create")

    }
    override fun onStart() {
        super.onStart()
        display("on start")
        dis("123")
    }

    override fun onResume() {
        super.onResume()
        display("on resume")
    }

    override fun onPause() {
        super.onPause()
        display("on Pause")
    }

    override fun onStop() {
        super.onStop()
        display("on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        display("on Destroy")
    }
    fun display(msg:String){
        Toast.makeText(this,"This is $msg",Toast.LENGTH_LONG).show()
        Log.i(Tag,"$msg is called")
    }
    fun dis(msg:String){
        //Snackbar.make(R.id.mainfram)
        val myCoordinatorLayout = findViewById<CoordinatorLayout>(R.id.myCoordinatorLayout)
        Snackbar.make(myCoordinatorLayout, R.string.email_sent, Snackbar.LENGTH_SHORT).show()
    }


}