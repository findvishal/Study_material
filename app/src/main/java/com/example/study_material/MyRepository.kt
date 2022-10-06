package com.example.study_material

import androidx.compose.foundation.layout.Column

class MyRepository {
    fun getAllMessages():List<Message>{
        return listOf(
            Message(
                "Premium Study Material",
                R.drawable.ic_store,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Current Affairs",
                R.drawable.ic_nav_currentaffairs,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Job Alerts",
                R.drawable.ic_nav_jobalerts,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Daily Quizzes",
                R.drawable.ic_nav_quiz,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Subject-wise Quizzes",
                R.drawable.ic_nav_quiz,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Free PDF",
                R.drawable.ic_nav_magazines,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Power Capsules",
                R.drawable.ic_nav_capsules,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Notes and Articles",
                R.drawable.ic_nav_articles,
                R.drawable.ic_chevron_right,
            ),
            Message(
                "Videos",
                R.drawable.ic_nav_videos,
                R.drawable.ic_chevron_right,
            ),


                Message(
                        "All India Mock & Scholarship " + "tests",
                        R.drawable.ic_nav_quiz,
                        R.drawable.ic_chevron_right,
                )

        )
    }

}