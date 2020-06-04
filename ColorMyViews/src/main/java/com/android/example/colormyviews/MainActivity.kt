package com.android.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }
    private fun  makeColred(view: View){
        when(view.id){

            //Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.dogimage)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.GREEN)

            //custom color background
            R.id.red_button ->box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button ->box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button ->box_five_text.setBackgroundResource(R.color.my_green)

            //txtbtn
            R.id.txtbtn ->txtbtn.setBackgroundResource(R.color.colorPrimaryDark)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private  fun setListener(){

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val txtbtn = findViewById<TextView>(R.id.txtbtn)


        val clickableView: List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout,redButton,greenButton,yellowButton
            ,txtbtn)

        for(item in clickableView) {
            item.setOnClickListener{makeColred(it)}
        }

    }
}
