package mohsin.code.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName : EditText = findViewById(R.id.etName)
        btnStart.setOnClickListener {

            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}