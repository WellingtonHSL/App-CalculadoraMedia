package com.wellingtonhenrique.calculadoramedias.ui.team

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wellingtonhenrique.calculadoramedias.R
import com.wellingtonhenrique.calculadoramedias.adapter.MemberAdapter
import com.wellingtonhenrique.calculadoramedias.data.membersList

class MembersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_members, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_members)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MemberAdapter(membersList) { member ->
            val intent = Intent(context, DetailMembersActivity::class.java)
            intent.putExtra("title", member.title)
            intent.putExtra("name", member.name)
            intent.putExtra("ra", member.ra)
            intent.putExtra("course", member.course)
            intent.putExtra("graduation", member.graduation)
            startActivity(intent)
        }
        recyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
        return view
    }
}