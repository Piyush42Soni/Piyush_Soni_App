package com.example.piyushsoni

import android.graphics.Point
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private fun getDeepChildOffset(
        mainParent: ViewGroup,
        parent: ViewParent,
        child: View,
        accumulatedOffset: Point
    ) {
        val parentGroup = parent as ViewGroup
        accumulatedOffset.x += child.left
        accumulatedOffset.y += child.top
        if (parentGroup == mainParent) {
            return
        }
        getDeepChildOffset(mainParent, parentGroup.parent, parentGroup, accumulatedOffset)
    }
    private fun scrollToView(scrollViewParent: ScrollView, view: View) {
        // Get deepChild Offset
        val childOffset = Point()
        getDeepChildOffset(scrollViewParent, view.getParent(), view, childOffset)
        // Scroll to child.
        scrollViewParent.smoothScrollTo(0, childOffset.y)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<BottomNavigationItemView>(R.id.action_about).setOnClickListener {
            findViewById<BottomNavigationView>(R.id.bottomnav).getMenu().getItem(0).isChecked = true
            scrollToView(findViewById(R.id.scrollhai),findViewById(R.id.about))
        }
        findViewById<BottomNavigationItemView>(R.id.action_skills).setOnClickListener {
            findViewById<BottomNavigationView>(R.id.bottomnav).getMenu().getItem(1).isChecked = true
            scrollToView(findViewById(R.id.scrollhai),findViewById(R.id.textView7))
        }
        findViewById<BottomNavigationItemView>(R.id.action_education).setOnClickListener {
            findViewById<BottomNavigationView>(R.id.bottomnav).getMenu().getItem(2).isChecked = true
            scrollToView(findViewById(R.id.scrollhai),findViewById(R.id.textView3))
        }
        findViewById<BottomNavigationItemView>(R.id.action_contact).setOnClickListener {
            findViewById<BottomNavigationView>(R.id.bottomnav).getMenu().getItem(3).isChecked = true
            scrollToView(findViewById(R.id.scrollhai),findViewById(R.id.contact))
        }
    }
}