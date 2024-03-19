package com.example.christopaul_card

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var answersVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialiser les TextViews de réponse
        val answer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val answer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val answer3 = findViewById<TextView>(R.id.flashcard_answer3)

        // Ajouter un OnClickListener à chaque TextView de réponse
        answer1.setOnClickListener { checkAnswer(answer1) }
        answer2.setOnClickListener { checkAnswer(answer2) }
        answer3.setOnClickListener { checkAnswer(answer3) }

        // Initialiser le bouton de basculement des réponses
        val toggleButton = findViewById<ImageButton>(R.id.toggle_answers_button)
        toggleButton.setOnClickListener { toggleAnswersVisibility() }
    }

    // Méthode pour vérifier la réponse sélectionnée
    private fun checkAnswer(selectedAnswer: TextView) {
        if (selectedAnswer.text.toString() == "Barack Obama") {
            selectedAnswer.setBackgroundColor(Color.GREEN) // Réponse correcte
        } else {
            selectedAnswer.setBackgroundColor(Color.RED) // Réponse incorrecte
        }
    }

    // Méthode pour basculer la visibilité des réponses
    private fun toggleAnswersVisibility() {
        val answer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val answer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val answer3 = findViewById<TextView>(R.id.flashcard_answer3)

        if (answersVisible) {
            answer1.visibility = View.INVISIBLE
            answer2.visibility = View.INVISIBLE
            answer3.visibility = View.INVISIBLE
            answersVisible = false
        } else {
            answer1.visibility = View.VISIBLE
            answer2.visibility = View.VISIBLE
            answer3.visibility = View.VISIBLE
            answersVisible = true
        }
    }
}



















