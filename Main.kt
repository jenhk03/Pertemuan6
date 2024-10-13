fun printMyName()
{
    println("Nama saya Jen")
    println("Saya lahir di Palembang dan menetap di Jakarta")
}

fun printMultiply5(value: Int = 1)
{
    println("$value * 5 = ${value * 5}")
}

fun printMultiply(multiplier: Int = 5, value: Int = 1)
{
    println("$multiplier * $value = ${multiplier * value}")
}

fun multiply(value: Int = 10, multiplier: Int = 1): Int
{
    var multiply = value * multiplier
    return multiply
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int>
{
    val multiply = number * factor
    val divide = number / factor
    return Pair(multiply, divide)
}

fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

fun incrementAndPrint(value: Int)
{
    val newValue = value + 1
    println(newValue)
}

fun getValue(value: Int): Int
{
    return value + 1
}

fun getValue(value: String): String
{
    return "The value is $value"
}

fun add(a: Int, b: Int): Int
{
    return a + b
}

fun sub(a: Int, b: Int): Int
{
    return a - b
}

fun printResult(function: (Int, Int) -> Int, a: Int, b: Int)
{
    val result = function(a, b)
    println(result)
}

fun main()
{
    printMyName()
    printMultiply5(5)
    printMultiply(5, 5)
    println(multiply(10, 5))
    println(multiplyAndDivide(4, 2))
    println(multiplyInferred(5, 5))
    var function = ::add
    println(function(4, 2))
    printResult(::add, 4, 2)
    function = ::sub
    println(function(4, 2))
    printResult(::sub, 4, 2)
}