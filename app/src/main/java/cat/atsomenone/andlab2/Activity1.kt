package cat.atsomenone.andlab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cat.atsomenone.andlab2.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = Activity1Binding.inflate(layoutInflater)
        binding.button1.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
        binding.button2.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this, Activity4::class.java))
        }
        binding.button4.setOnClickListener {
            finish()
        }
        setContentView(binding.root)
    }
}