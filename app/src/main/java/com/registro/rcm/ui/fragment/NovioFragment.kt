package com.registro.rcm.ui.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.registro.rcm.R
import com.registro.rcm.viewmodel.NovioViewModel

class NovioFragment : Fragment() {

    companion object {
        fun newInstance() = NovioFragment()
    }

    private lateinit var viewModel: NovioViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.novio_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NovioViewModel::class.java)

    }

}
