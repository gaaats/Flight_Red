package com.generamobile.headso.gngjttngnjtg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.headso.R
import com.generamobile.headso.databinding.FragmentGaaaamyyyThreeeeBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class GaaaamyyyThreeeeFragment : Fragment() {


    private fun frghj222() {
        val gjitjtgjgtjgjti = Random.nextInt(hyjuujujuj.size - 1)

        val ngtgtbgtbbgtbgtbh = (360 - gjitjtgjgtjgjti * hujjujuuj5k5i).toFloat()
        val jgtitghgthgtgthgt = RotateAnimation(
            0f,
            (360f * hyjuujujuj.size) + ngtgtbgtbbgtbgtbh,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        jgtitghgthgtgthgt.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = hyjuujujuj[gjitjtgjgtjgjti]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    h5ju5j1j5 = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            bgyujujuj.imgEl1.startAnimation(jgtitghgthgtgthgt)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        yhyujuujuj = FragmentGaaaamyyyThreeeeBinding.inflate(inflater, container, false)
        return bgyujujuj.root
    }


    private val hyjuujujuj = arrayOf(700, 1000, 100, 200, 500, 155, 80, 999, 777)
    private val hyhyjukikik = hyjuujujuj.clone()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            nhjuujujuj()
            bgyujujuj.btnSmall.setOnClickListener {
                if (!hyjuujujhyhyhy) {
                    jukikilool()
                    hyjuujujhyhyhy = true
                }
            }

            bgyujujuj.btnBig.setOnClickListener {
                if (!h5ju5j1j5) {
                    frghj222()
                    h5ju5j1j5 = true
                }
            }

            bgyujujuj.btnnNexxxt.setOnClickListener {
                findNavController().navigate(R.id.action_gaaaamyyyThreeeeFragment_to_gaaamymyyyOneeeeFragment)
            }

        } catch (e: Exception) {
            fgthyhy555()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private var yhyujuujuj: FragmentGaaaamyyyThreeeeBinding? = null
    private val bgyujujuj get() = yhyujuujuj ?: throw RuntimeException("FragmentGaaaamyyyThreeeeBinding = null")


    private fun jukikilool() {
        val ngtjngtntgnhynhnyjnhy = Random.nextInt(hyjuujujuj.size - 1)

        val jgtjitgijgtjgtjigt = (360 - ngtjngtntgnhynhnyjnhy * hujjujuuj5k5i).toFloat()
        val fgrfyfyrgfrgfr = RotateAnimation(
            0f,
            (360f * hyjuujujuj.size) + jgtjitgijgtjgtjigt,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        fgrfyfyrgfrgfr.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = hyjuujujuj[ngtjngtntgnhynhnyjnhy]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    hyjuujujhyhyhy = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            bgyujujuj.imgElfrgtgtgtgt.startAnimation(fgrfyfyrgfrgfr)
        }
    }

    private val hujjujuuj5k5i = 360 / hyjuujujuj.size
    private var hyjuujujhyhyhy = false
    private var h5ju5j1j5 = false

    override fun onDestroy() {
        yhyujuujuj = null
        super.onDestroy()
    }

    private fun nhjuujujuj() {
        for (i in hyjuujujuj.indices) {
            hyhyjukikik[i] = (i + 1) * hujjujuuj5k5i
        }
    }




    private fun fgthyhy555() {
        hyjujujkiik()
        vbbrgghgthgt()
    }

    private fun vbbrgghgthgt() {
        requireActivity().onBackPressed()
    }

    private fun hyjujujkiik() {
        Snackbar.make(
            bgyujujuj.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }
}