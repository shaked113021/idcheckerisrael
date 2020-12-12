/*
 * <one line to give the program's name and a brief idea of what it does.>
 * Copyright (C) 2020 Shaked Cohen
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of  MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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