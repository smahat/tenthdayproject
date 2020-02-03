package com.rjt.tenthdayproject.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rjt.tenthdayproject.R
import kotlinx.android.synthetic.main.fragment_fragment2.view.*

/**
 * A simple [Fragment] subclass.
 */

private const val ARG_PARAM1 = "param1"
class Fragment2: Fragment() {

    private var param1: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_fragment2, container, false)
        //inputText = arguments?.getString("input_txt")
        rootView.output_textview.text = param1
        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            Fragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

}