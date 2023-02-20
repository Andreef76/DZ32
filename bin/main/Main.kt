fun main() {
    val amount = 15000
    val percent = amount * 0.0075
    val commission = if (percent > 35)  percent else 35
println("комиссия за перевод составляет - $commission рублей")
}