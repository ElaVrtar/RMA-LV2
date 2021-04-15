package com.example.inspiringpeople

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_user.*

class AddPersonActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        submit.setOnClickListener()
        {
            PeopleRepository.addPerson(InspiringPerson(input_name.text.toString(), input_birth.text.toString(), input_description.text.toString(),
                input_image.text.toString(), input_quotes.text.toString().split("\n"))
            )
            finish()
        }
    }
}