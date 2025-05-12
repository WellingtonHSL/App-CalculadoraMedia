package com.wellingtonhenrique.calculadoramedias.ui.team

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.wellingtonhenrique.calculadoramedias.R

class DetailMembersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_members)

        val toolbar = findViewById<MaterialToolbar>(R.id.appBar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            finish()
        }

        val name = intent.getStringExtra("name")
        val title = intent.getStringExtra("title")
        val ra = intent.getStringExtra("ra")
        val course = intent.getStringExtra("course")
        val graduation = intent.getStringExtra("graduation")

        findViewById<TextView>(R.id.tv_name_detail).text = name
        findViewById<TextView>(R.id.tv_info).text = "Informações do $title:"
        findViewById<TextView>(R.id.tv_ra).text = "R.A: $ra"
        findViewById<TextView>(R.id.tv_course).text = "Curso: $course"
        findViewById<TextView>(R.id.tv_graduation).text = "Graduação: $graduation"
    }
}