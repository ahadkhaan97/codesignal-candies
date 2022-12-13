fun main() {
    print(solution(3, 10))
}

fun solution(n: Int, m: Int): Int {
    for (i in m downTo 1) {
        if (i % n == 0) {
            return i
        }
    }
    return 1
}
