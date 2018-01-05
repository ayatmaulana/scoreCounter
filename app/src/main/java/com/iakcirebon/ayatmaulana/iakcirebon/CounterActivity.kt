    package com.iakcirebon.ayatmaulana.iakcirebon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_counter.*

    class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val nameTeamA = intent.getStringExtra( "team_A" )
        val nameTeamB = intent.getStringExtra( "team_B" )

        nmTeamA.text = nameTeamA
        nmTeamB.text = nameTeamB

        scoreB.setOnClickListener {
            var valScoreB = scoreB.text.toString()
            scoreB.text = (Integer.parseInt( valScoreB ) + 1).toString()

        }

        scoreA.setOnClickListener {
            var valScoreA = scoreA.text.toString()
            scoreA.text = (Integer.parseInt( valScoreA ) + 1).toString()

        }

        buttonFinish.setOnClickListener{
            val intent = Intent( this, ResultActivity::class.java )
            intent.putExtra( "scoreA", scoreA.text.toString() )
            intent.putExtra( "scoreB", scoreB.text.toString() )
            intent.putExtra( "teamA", nameTeamA.toString() )
            intent.putExtra( "teamB", nameTeamB.toString() )
            startActivity( intent )
        }

    }

}
