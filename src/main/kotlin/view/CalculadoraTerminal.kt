package view

import controller.Calculadora
import model.TipusOperacio
import util.*

class CalculadoraTerminal {
    private val calculadora: Calculadora

    constructor(calculadora: Calculadora) {
        this.calculadora = calculadora
    }

    fun getCalculadora(): Calculadora {
        return this.calculadora
    }

    fun escollirOperacio(){
        do {
            // Mostrem les operacions disponibles
            for (op in TipusOperacio.entries) {
                println("\t$op")
            }

            val operacio: String = readWord("Escull la teva operació", "Input incorrecte")

            // Convertim el String a TipusOperacio (si és vàlid)
            val tipusOperacio = TipusOperacio.entries.find { it.name == operacio }

            when (tipusOperacio) {
                TipusOperacio.SUMA -> calculadora.sumar()
                TipusOperacio.RESTA -> calculadora.restar()
                TipusOperacio.MULTIPLICACIO -> calculadora.multiplicar()
                TipusOperacio.DIVISIO -> calculadora.dividir()
                else -> println(RED + "ERROR: Operació no vàlida" + RESET)
            }
        } while (tipusOperacio == null)
    }

}