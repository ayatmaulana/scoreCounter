package com.iakcirebon.ayatmaulana.iakcirebon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val nameTeamA : String = editText1.text.toString()
            val nameTeamB : String = editText2.text.toString()

            var intent = Intent(this, CounterActivity::class.java)
            intent.putExtra( "team_A", nameTeamA )
            intent.putExtra( "team_B", nameTeamB )

            startActivity( intent )
        }
    }
}
