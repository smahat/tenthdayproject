package com.rjt.tenthdayproject.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjt.tenthdayproject.Fragments.Fragment1
import com.rjt.tenthdayproject.Fragments.Fragment2
import com.rjt.tenthdayproject.R

class MainActivity : AppCompatActivity(),Fragment1.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().add(R.id.main_page, fragment1).commit()
    }

    override fun onFragmentInteraction(name: String) {


        val fragment2 = Fragment2.newInstance(name)

        supportFragmentManager.beginTransaction().replace(R.id.main_page, fragment2).commit()

    }

}

