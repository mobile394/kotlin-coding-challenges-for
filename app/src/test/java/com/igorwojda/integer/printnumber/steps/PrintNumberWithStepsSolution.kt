package com.igorwojda.integer.printnumber.steps

private object Solution1 {
    private fun printNumber(n: Int, step: Int = 1): List<Int> =
        (n downTo 1 step step).toList()
}

private object Solution2 {
    private fun printNumber(n: Int, step: Int = 1): List<Int> {
        val list = mutableListOf<Int>()

        if (n <= 0) {
            return listOf()
        } else {
            list.add(n)
        }

        list.addAll(printNumber(n - step, step))
        return list
    }
}

private object KtLintWillNotComplain
