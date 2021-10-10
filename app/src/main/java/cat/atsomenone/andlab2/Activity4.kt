package cat.atsomenone.andlab2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent.ACTION_DOWN
import android.view.MotionEvent.ACTION_UP
import cat.atsomenone.andlab2.databinding.Activity4Binding

class Activity4 : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility", "UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = Activity4Binding.inflate(layoutInflater);

        binding.button14.setOnTouchListener { v, e ->
            if (e.action == ACTION_DOWN)
                v.background = getDrawable(R.drawable.supercoolpressedbutton)
            if (e.action == ACTION_UP)
                v.background = getDrawable(R.drawable.supercoolbutton);
            true
        }
        setContentView(binding.root)
    }
}