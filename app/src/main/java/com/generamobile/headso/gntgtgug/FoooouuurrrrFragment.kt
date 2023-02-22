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


class FoooouuurrrrFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_foooouuurrrr, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val checkFly = nhjuujujuj.getString("apps", null)
        val appsCamp = nhjuujujuj.getString("appCamp", null)

        if (checkFly=="1" && appsCamp == null) {
            nhyjkikikikik.rgfgthyjujuujuj(mContecxt)
            nhyjkikikikik.vfvbgbhyhjuuj.observe(viewLifecycleOwner) {
                if (it != null) {
                    ghyhyhyhy = it.toString()
                    nhjuujujuj.edit().putString("appCamp", ghyhyhyhy).apply()
                    findNavController().navigate(R.id.action_foooouuurrrrFragment_to_fiiiveveveveveFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_foooouuurrrrFragment_to_fiiiveveveveveFragment)
        }
    }

    val nhyjkikikikik by activityViewModel<JIfjrhfrhurfhuhrf>(named("MainModel"))
    val nhjuujujuj: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var ghyhyhyhy: String
    private lateinit var mContecxt: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContecxt = context
    }
}