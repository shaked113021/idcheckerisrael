package shakedcohen.idcheckerisrael

import android.content.Context
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class OnCheckButtonClicked(appContext: Context, val IdNumberEditText: EditText): View.OnClickListener {

    private val lengthErrorToast: Toast = Toast.makeText(appContext,R.string.length_error, LENGTH_SHORT)
    private val isValidToast: Toast = Toast.makeText(appContext, R.string.is_valid, LENGTH_SHORT)
    private val isNotValidToast: Toast = Toast.makeText(appContext, R.string.is_not_valid, LENGTH_SHORT)

    override fun onClick(v: View?): Unit {
        val input: String = IdNumberEditText.text.toString()

        if(IdChecker.checkLength(input) == false) {
            lengthErrorToast.show()
            return
        }

        if (IdChecker.checkDigitTest(input)) {
            isValidToast.show()
        } else {
            isNotValidToast.show()
        }
    }
}