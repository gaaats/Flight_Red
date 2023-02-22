package com.generamobile.headso.gntgtgug

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headso.R
import com.generamobile.headso.frjgthtg.JIfjrhfrhurfhuhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeecooondFragment : Fragment() {
    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    val viewMainModel by activityViewModel<JIfjrhfrhurfhuhrf>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_seeecooond, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewMainModel.bghyjujuujj.observe(viewLifecycleOwner) {
            if (it!=null) {
                country = it.countryCode
                shareP.edit().putString("country", country).apply()
                findNavController().navigate(R.id.action_seeecooondFragment_to_thhhhiiirddddFragment)
            }
        }

    }
}