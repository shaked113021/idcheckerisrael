package shakedcohen.idcheckerisrael

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val IdNumberTextEdit: EditText = findViewById(R.id.IdNumberTextEdit)
        val checkButton: Button = findViewById(R.id.checkButton)
        val onCheckButtonClicked: OnCheckButtonClicked = OnCheckButtonClicked(applicationContext,
            IdNumberTextEdit)

        checkButton.setOnClickListener(onCheckButtonClicked)
    }
}