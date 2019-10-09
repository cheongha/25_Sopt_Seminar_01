package cjdgk7.s.a25soptseminar1.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cjdgk7.s.a25soptseminar1.MainActivity
import cjdgk7.s.a25soptseminar1.R
import cjdgk7.s.a25soptseminar1.signup.SignupActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setOnClick()
    }

    private fun setOnClick() {
        btn_login.setOnClickListener {
            valid()
        }
        btn_login_signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivityForResult(intent, 1000)
        }
    }
    private fun valid() {
        if (txt_login_id.text.toString() != "" && txt_login_pw.text.toString() != ""){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else if (txt_login_id.text.toString() == ""){
            Toast.makeText(this, "아이디를 입력해주세요 ><", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "비밀번호를 입력해주세요 ><", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Toast.makeText(this, requestCode.toString(), Toast.LENGTH_SHORT).show()
        if (requestCode == 1000){
            if (resultCode == Activity.RESULT_OK){
                txt_login_id.setText(data!!.getStringExtra("user_id"))
                txt_login_pw.setText(data!!.getStringExtra("user_pw"))
            }
        }
    }
}
