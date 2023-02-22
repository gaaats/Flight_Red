package com.generamobile.headso.gntgtgug

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headso.R


class FffffiiiersststsFragment : Fragment() {
    private lateinit var hyjuujujuj: Context


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fffffiiiersststs, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyjuujujuj=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(R.id.action_fffffiiiersststsFragment_to_seeecooondFragment)
    }
}