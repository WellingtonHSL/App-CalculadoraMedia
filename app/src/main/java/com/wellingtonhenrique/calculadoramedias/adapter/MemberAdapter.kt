package com.wellingtonhenrique.calculadoramedias.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wellingtonhenrique.calculadoramedias.R
import com.wellingtonhenrique.calculadoramedias.model.Members

class MemberAdapter(private val listMember: List<Members>, private val onClick: (Members) -> Unit) :
    RecyclerView.Adapter<MemberAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tv_position)
        val name: TextView = view.findViewById(R.id.tv_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_member, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = listMember.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = listMember[position]
        holder.title.text = member.title
        holder.name.text = member.name
        holder.itemView.setOnClickListener { onClick(member)}
    }



}