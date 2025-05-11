package com.wellingtonhenrique.calculadoramedias.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.wellingtonhenrique.calculadoramedias.ui.calculator.CalculatorFragment
import com.wellingtonhenrique.calculadoramedias.ui.team.MembersFragment

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) MembersFragment() else CalculatorFragment()
    }
}