package com.igorwojda.codingpuzzle

private fun chunkSolution1(list: List<Int>, size: Int): List<List<Int>> {
    val chunks = mutableListOf<MutableList<Int>>()

    list.forEach {
        if(chunks.size == 0 || chunks.last().size == size) {
            chunks.add(mutableListOf(it))
        } else {
            chunks.last().add(it)
        }
    }

    return chunks
}

private fun chunkSolution2(list: List<Int>, size: Int): List<List<Int>> {
    val chunks = mutableListOf<List<Int>>()

    for(i in 0..list.lastIndex step size) {
        var rightIndex = if(i + size < list.size) i + size else list.size
        chunks.add(list.subList(i, rightIndex))
    }

    return chunks
}

private fun chunkSolution3(list: List<Int>, size: Int): List<List<Int>> {
    var index = 0
    val chunks = mutableListOf<List<Int>>()

    while (index <= list.lastIndex) {
        var rightIndex = if(index + size < list.size) index + size else list.size
        chunks.add(list.subList(index, rightIndex))

        index += size
    }

    return chunks
}
