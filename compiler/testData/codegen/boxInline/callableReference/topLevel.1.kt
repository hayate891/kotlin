import test.*

fun box() : String {
    return if (call(10, ::calc) == 5) "OK" else "fail"
}

fun calc(p: Int) : Int {
    return p / 2
}