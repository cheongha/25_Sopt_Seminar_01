package cjdgk7.s.a25soptseminar1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClick()
    }

    private fun setOnClick() {
        rl_hobby.isSelected = false
        rl_like_things.isSelected = false
        rl_hate_things.isSelected = false

        rl_hobby.setOnClickListener {
            if (rl_hobby.isSelected == false){
                rl_hobby.isSelected = true
                ll_hobby.visibility = View.VISIBLE
                txt_hobby.setTextColor(Color.parseColor("#000000"))
            }
            else {
                rl_hobby.isSelected = false
                ll_hobby.visibility = View.GONE
                txt_hobby.setTextColor(Color.parseColor("#BDBDBD"))
            }
        }

        rl_like_things.setOnClickListener {
            if (rl_like_things.isSelected == false){
                rl_like_things.isSelected = true
                ll_like_things.visibility = View.VISIBLE
                txt_like_things.setTextColor(Color.parseColor("#000000"))

            }
            else {
                rl_like_things.isSelected = false
                ll_like_things.visibility = View.GONE
                txt_like_things.setTextColor(Color.parseColor("#BDBDBD"))
            }
        }

        rl_hate_things.setOnClickListener {
            if (rl_hate_things.isSelected == false){
                rl_hate_things.isSelected = true
                ll_hate_things.visibility = View.VISIBLE
                txt_hate_things.setTextColor(Color.parseColor("#000000"))

            }
            else {
                rl_hate_things.isSelected = false
                ll_hate_things.visibility = View.GONE
                txt_hate_things.setTextColor(Color.parseColor("#BDBDBD"))
            }
        }
    }
}
