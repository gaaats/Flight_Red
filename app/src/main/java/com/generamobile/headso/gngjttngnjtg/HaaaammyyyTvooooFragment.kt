package com.generamobile.headso.gngjttngnjtg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.generamobile.headso.R
import com.generamobile.headso.databinding.FragmentHaaaammyyyTvooooBinding
import com.google.android.material.snackbar.Snackbar


class HaaaammyyyTvooooFragment : Fragment() {





    private fun poopopop() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ojgtgtjtggtjgtjjgtjgt()
            rfjfrjjgithuhgtuhgtuhugt()

        } catch (e: Exception) {
            frfrrfr()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun rfjfrjjgithuhgtuhgtuhugt() {
        hyhyhyyhyh.btnUnderstandGameRules.setOnClickListener {
            gtbbgtgtbgtbbgtbgt()
        }
    }

    private fun gtbbgtgtbgtbbgtbgt() {
        findNavController().navigate(R.id.action_haaaammyyyTvooooFragment_to_gaaaamyyyThreeeeFragment)
    }

    private fun frfrrfr() {
        Snackbar.make(
            hyhyhyyhyh.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var gameThreeBinding: FragmentHaaaammyyyTvooooBinding? = null
    private val hyhyhyyhyh get() = gameThreeBinding ?: throw RuntimeException("FragmentHaaaammyyyTvooooBinding = null")

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gameThreeBinding = FragmentHaaaammyyyTvooooBinding.inflate(inflater, container, false)
        return hyhyhyyhyh.root
    }

    private fun ojgtgtjtggtjgtjjgtjgt() {
        hyhyhyyhyh.btnImgExitInfo.setOnClickListener {
            poopopop()
        }
    }

    override fun onDestroy() {
        gameThreeBinding = null
        super.onDestroy()
    }

}