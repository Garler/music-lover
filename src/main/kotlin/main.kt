package ru.netology

fun main() {
    val amount = 5000
    val discountFix = 100
    val discountPercent = 100 - 5
    val discountExtra = 100 - 1
    val index = 1 * 100
    val discountFixStart = 1_001
    val discountPercentStart = 10_001
    val discountExtraStart = true

    val result = if (amount >= discountPercentStart) amount * discountPercent / index else
        if (amount >= discountFixStart) amount - discountFix else amount
    val resultExtra = if (discountExtraStart) result * discountExtra / index else result

    println(
        "Покупка - $amount руб.\n" +
                "После применения скидки - $result руб.\n" +
                if (discountExtraStart) "После применения скидки постоянного покупателя - $resultExtra руб."
                else "Станьте постоянным покупателем и получайте дополнительную скидку 1%"
    )
}