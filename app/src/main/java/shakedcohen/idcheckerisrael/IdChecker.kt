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

import java.lang.IllegalArgumentException

object IdChecker {
    private val numberSize = 9

    fun checkLength(idNumber: String) : Boolean {
        return idNumber.length == numberSize
    }

    fun checkInteger(idNumber: String) : Boolean {
        try {
            Integer.parseInt(idNumber)
        } catch (e: IllegalArgumentException) {
            return false
        }
        return true
    }

    fun checkDigitTest(idNumber: String) : Boolean {
        var weightedSum: Int = 0
        for(i in 0 until numberSize - 1) {
            var weightedDigit: Int = idNumber[i].toInt() - 48
            if(i % 2 == 1) {
                weightedDigit *= 2
            }
            weightedSum += weightedDigit / 10 + weightedDigit % 10
        }
        return 10 - weightedSum % 10 == idNumber[numberSize - 1].toInt() - 48
    }

    fun checkPositive(idNumber: String) : Boolean {
        return idNumber[0] != '-'
    }
}