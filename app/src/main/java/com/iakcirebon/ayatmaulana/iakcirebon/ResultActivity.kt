package com.iakcirebon.ayatmaulana.iakcirebon

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.content_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setSupportActionBar(toolbar)

        val resultA = intent.getStringExtra("scoreA")
        val resultB = intent.getStringExtra("scoreB")
        val team_A   = intent.getStringExtra("teamA")
        val team_B   = intent.getStringExtra("teamB")

        resultScoreA.text = resultA
        resultScoreB.text = resultB
        teamA.text = team_A
        teamB.text = team_B

        val Winner = "Winner"

        if (resultA < resultB) {
            keteranganTeam.text = team_B
            keterangan.text = Winner
        } else if (resultA > resultB) {
            keteranganTeam.text = team_A
            keterangan.text = Winner
        } else if (resultA == resultB) {
            keteranganTeam.text = ""
            keterangan.text = "Draw"
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
