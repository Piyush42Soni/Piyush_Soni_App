package com.example.piyushsoni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.piyushsoni.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {
    private lateinit var binding:FragmentAboutBinding

    class ProgressBarAnimation(
        private val progressBar: ProgressBar,
        private val from: Float,
        private val to: Float
    ) :
        Animation() {
        override fun applyTransformation(interpolatedTime: Float, t: Transformation?) {
            super.applyTransformation(interpolatedTime, t)
            val value = from + (to - from) * interpolatedTime
            progressBar.progress = value.toInt()
        }
    }
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
        binding.hakerrankButton.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://www.hackerrank.com/piyush42soni")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        var anim = ProgressBarAnimation(binding.progressBar, 0F, 95F)
        anim.duration = 3000
        binding.progressBar.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar1, 0F, 80F)
        anim.duration = 3000
        binding.progressBar1.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar2, 0F, 80F)
        anim.duration = 3000
        binding.progressBar2.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar3, 0F, 80F)
        anim.duration = 3000
        binding.progressBar3.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar4, 0F, 95F)
        anim.duration = 3000
        binding.progressBar4.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar5, 0F, 90F)
        anim.duration = 3000
        binding.progressBar5.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar6, 0F, 90F)
        anim.duration = 3000
        binding.progressBar6.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar7, 0F, 65F)
        anim.duration = 3000
        binding.progressBar7.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar8, 0F, 70F)
        anim.duration = 3000
        binding.progressBar8.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar9, 0F, 90F)
        anim.duration = 3000
        binding.progressBar9.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar10, 0F, 90F)
        anim.duration = 3000
        binding.progressBar10.startAnimation(anim)
        anim = ProgressBarAnimation(binding.progressBar11, 0F, 75F)
        anim.duration = 3000
        binding.progressBar11.startAnimation(anim)
    }
}