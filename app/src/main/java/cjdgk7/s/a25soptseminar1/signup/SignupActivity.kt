package cjdgk7.s.a25soptseminar1.signup

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cjdgk7.s.a25soptseminar1.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        btn_signup.setOnClickListener {
            valid()
        }
    }

    private fun pwcheck() {
        if (edt_pw.text.toString() != edt_pwcheck.text.toString()){
            Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show()
        }
        else {
            postSignupResponse()
        }
    }

    private fun valid() {
        if (edt_name.text.toString() != "" && edt_id.text.toString() != "" && edt_pw.text.toString() != "" && edt_pwcheck.text.toString() != ""){
            pwcheck()
        }
        else {
            Toast.makeText(this, "모든 칸을 채워주세요 ><", Toast.LENGTH_SHORT).show()
        }
    }

    private fun postSignupResponse() {
        val intent = Intent()
        intent.putExtra("user_id", edt_id.text.toString())
        intent.putExtra("user_pw", edt_pw.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}
