package com.projectakhir.foodine.MainApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.projectakhir.foodine.R

class MainHomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_home, container, false)
        (activity as MainActivity).supportActionBar?.title = "Foodine"
//        (requireActivity() as MainActivity).topbarSettings.setVisible(false)

        if((activity as MainActivity).isTopBarSettingsInitialized()){
            Toast.makeText(requireActivity(), (activity as MainActivity).topbarSettings.toString(), Toast.LENGTH_SHORT).show()
            (activity as MainActivity).topbarSettings.isEnabled = false
        } else{
            Toast.makeText(requireActivity(), "abc", Toast.LENGTH_SHORT).show()
        }


//        if (activity is MainActivity){
//            (activity as? MainActivity)!!.topbarSettings.isVisible = false
//        }

        return view
    }
}