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