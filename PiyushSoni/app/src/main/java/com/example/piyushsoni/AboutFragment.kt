package com.example.piyushsoni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.piyushsoni.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {
    private lateinit var binding:FragmentAboutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_about, container, false)
        binding.progressBar.setProgress(90,false)
        binding.codechefButton.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://www.codechef.com/users/piyush_soni_1")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.linkedinButton.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://www.linkedin.com/in/piyush-soni-2400b2220?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3Bbs6jOsHyTw20H0RmZicIoA%3D%3D")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.codeforcesButton.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://codeforces.com/profile/piyush42soni")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.GithubButton.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://github.com/Piyush42Soni")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.hakerrankButton.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://www.hackerrank.com/piyush42soni")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        return binding.root
    }
}