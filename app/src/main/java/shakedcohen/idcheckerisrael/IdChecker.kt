package shakedcohen.idcheckerisrael

import java.lang.IllegalArgumentException

object IdChecker {
    private val numberSize = 9

    fun checkLength(idNumber: String) : Boolean {
        return idNumber.length == numberSize;
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
        var weightedSum: Int = 0;
        for(i in 0 until numberSize - 1) {
            var weightedDigit: Int = idNumber[i].toInt() - 48
            if(i % 2 == 1) {
                weightedDigit *= 2;
            }
            weightedSum += weightedDigit / 10 + weightedDigit % 10
        }
        return 10 - weightedSum % 10 == idNumber[numberSize - 1].toInt() - 48
    }

    fun checkPositive(idNumber: String) : Boolean {
        return idNumber[0] != '-'
    }
}