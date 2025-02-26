package view

import model.Calculadora
import model.Color
import model.TipusOperacio
import util.*

class CalculadoraTerminal {
    private val calculadora: Calculadora

    /**
     * Constructor de la classe de la vista
     * @param calculadora: Inicialitza l'atribut calculadora
     * @author RIS
     */
    constructor(calculadora: Calculadora) {
        this.calculadora = calculadora
    }

    /**
     * Mètode usat per tal de retornar l'atribut calculadora
     * per poder accedir als mètodes de l'objecte.
     * @author RIS
     * @return calculadora
     */
    fun getCalculadora(): Calculadora {
        return this.calculadora
    }

    /**
     * Mètode principal de la vista del temrinal de IntelliJ.
     * Manté un diàleg amb l'usuari de la app via terminal.
     * @author RIS
     */
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
                else -> println(Color.RED.consoleColor + "ERROR: Operació no vàlida" + Color.RESET.consoleColor)
            }
        } while (tipusOperacio == null)
    }
}