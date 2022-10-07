package com.example.firstdisplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
fun myclick(view: View){

    val a=fn.text.toString()
    val b=sn.text.toString()
    val c=a.toInt()
    val d=b.toInt()

   var e=c+d

result.setText("The sum is "+ e)
}

fun reset(view:View){

    fn.setText("")
    sn.setText("")
    result.setText("")
}
}