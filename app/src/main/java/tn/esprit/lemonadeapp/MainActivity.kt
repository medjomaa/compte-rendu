package tn.esprit.lemonadeapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val lemonade=Lemonade()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textPrompt = findViewById<TextView>(R.id.textPrompt)
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {
            when (lemonade.currentStep) {
                1 -> {
                    textPrompt.text = "Click to juice the lemon!"
                    imageView.setImageResource(R.drawable.lemon_squeeze)
                    lemonade.requiredSqueezes = Random.nextInt(2, 5)
                    lemonade.squeezeCount = 0
                    lemonade.currentStep = 2
                }
                2 -> {
                    lemonade.squeezeCount++
                    if (lemonade.squeezeCount < lemonade.requiredSqueezes) {
                        Toast.makeText(
                            this,
                            "Squeeze count: ${lemonade.squeezeCount}, keep squeezing!",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        textPrompt.text = "Click to drink your lemonade!"
                        imageView.setImageResource(R.drawable.lemon_drink)
                        lemonade.currentStep = 3
                    }
                }
                3 -> {
                    textPrompt.text = "Click to start again!"
                    imageView.setImageResource(R.drawable.lemon_restart)
                    lemonade.currentStep = 4
                }
                4 -> {
                    textPrompt.text = "Click to select a lemon!"
                    imageView.setImageResource(R.drawable.lemon_tree)
                    lemonade.currentStep = 1
                }
            }
        }
    }
}
