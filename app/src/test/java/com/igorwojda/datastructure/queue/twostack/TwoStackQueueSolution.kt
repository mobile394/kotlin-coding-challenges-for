package com.igorwojda.datastructure.queue.twostack

import com.igorwojda.datastructure.queue.int.IntStackSolution.IntStack

private object TwoStackQueueSolution {
    private class IntQueue {
        val stackPrimary = IntStack()
        val stackTemporary = IntStack()

        fun add(element: Int) {
            stackPrimary.push(element)
        }

        fun remove(): Int? {
            moveElementsToTemporaryStack()
            val result = stackTemporary.pop()
            moveElementsToPrimaryStack()
            return result
        }

        fun peek(): Int? {
            moveElementsToTemporaryStack()
            val result = stackTemporary.peek()
            moveElementsToPrimaryStack()

            return result
        }

        private fun moveElementsToTemporaryStack() {
            while (stackPrimary.peek() != null) {
                stackPrimary.pop()?.let { stackTemporary.push(it) }
            }
        }

        private fun moveElementsToPrimaryStack() {
            while (stackTemporary.peek() != null) {
                stackTemporary.pop()?.let { stackPrimary.push(it) }
            }
        }
    }
}
