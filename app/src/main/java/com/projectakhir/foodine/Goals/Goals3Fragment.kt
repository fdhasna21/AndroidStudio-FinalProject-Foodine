package com.projectakhir.foodine.Goals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.projectakhir.foodine.R
import kotlinx.android.synthetic.main.fragment_goals3.view.*

class Goals3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_goals3, container, false)
        (activity as GoalsActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as GoalsActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as GoalsActivity).supportActionBar?.title = "Your Ideal Goals"

        val nameText = view.goals_profile_name
        val ageText = view.goals_profile_age_editText
        val weightText = view.goals_profile_weight_editText
        val heightText = view.goals_profile_height_editText
        val genderImage = view.goals_profile_gender

        val maleImage = R.drawable.goals_male
        val femaleImage = R.drawable.goals_female

        //TODO : send API for calculate ideal goals
        nameText.setText("${setGoal.name}")
        ageText.setText("${setGoal.age} y.o")
        weightText.setText("${setGoal.weight} kg")
        heightText.setText("${setGoal.height} cm")
        if(setGoal.gender == "male"){
            genderImage.setImageDrawable(resources.getDrawable(maleImage))
        }
        else{
            genderImage.setImageDrawable(resources.getDrawable(femaleImage))
        }
        return view
    }
}