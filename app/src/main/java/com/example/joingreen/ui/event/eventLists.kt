/**
package com.example.joingreen.ui.event


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.joingreen.R
import androidx.databinding.DataBindingUtil

/**
 * A simple [Fragment] subclass.
 */
class eventLists : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEventBinding>(inflater,
            R.layout.event_list,container,false)
        return binding.root
    }


}
**/