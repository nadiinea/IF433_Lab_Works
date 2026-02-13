package oop_111152_nadine.week2

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}