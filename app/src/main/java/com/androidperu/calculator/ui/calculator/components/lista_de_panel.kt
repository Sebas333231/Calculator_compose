package com.androidperu.calculator.ui.calculator.components

sealed class lista_de_panel(
    val item: String
){
    object item1: lista_de_panel("C")
    object item2: lista_de_panel("(")
    object item3: lista_de_panel(")")
    object item4: lista_de_panel("/")
    object item5: lista_de_panel("7")
    object item6: lista_de_panel("8")
    object item7: lista_de_panel("9")
    object item8: lista_de_panel("×")
    object item9: lista_de_panel("4")
    object item10: lista_de_panel("5")
    object item11: lista_de_panel("6")
    object item12: lista_de_panel("-")
    object item13: lista_de_panel("1")
    object item14: lista_de_panel("2")
    object item15: lista_de_panel("3")
    object item16: lista_de_panel("+")
    object item17: lista_de_panel("0")
    object item18: lista_de_panel(".")
    object item19: lista_de_panel("◄")
    object item20: lista_de_panel("=")
}


