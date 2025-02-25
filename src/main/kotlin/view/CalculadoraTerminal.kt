package view

import model.TipusOperacio
import org.example.utils.CalculadoraController.div
import org.example.utils.CalculadoraController.multi
import org.example.utils.CalculadoraController.resta
import org.example.utils.CalculadoraController.suma
import util.*

class CalculadoraTerminal {
    private var x: Double
    private var y: Double
    lateinit var operacio: TipusOperacio
    private var resultat: Double

    constructor() {
        this.x = 0.0
        this.y = 0.0
        this.resultat = 0.0
    }

    constructor(x: Double, y: Double) {
        this.x = x
        this.y = y
        this.resultat = 0.0
    }

    fun getX(): Double {
        return this.x
    }

    fun setX(x: Double) {
        this.x = x
    }

    fun getY(): Double {
        return this.y
    }

    fun setY(y: Double) {
        this.y = y
    }

    fun sumar(){
        this.operacio = TipusOperacio.SUMA
        this.resultat = suma(this.x, this.y)
    }

    fun restar(){
        this.operacio = TipusOperacio.RESTA
        this.resultat = resta(this.x, this.y)
    }

    fun multiplicar(){
        this.operacio = TipusOperacio.MULTIPLICACIO
        this.resultat = multi(this.x, this.y)
    }

    fun dividir(){
        this.operacio = TipusOperacio.DIVISIO
        this.resultat = div(this.x, this.y)
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
                TipusOperacio.SUMA -> this.sumar()
                TipusOperacio.RESTA -> this.restar()
                TipusOperacio.MULTIPLICACIO -> this.multiplicar()
                TipusOperacio.DIVISIO -> this.dividir()
                else -> println(RED + "ERROR: Operació no vàlida" + RESET)
            }
        } while (tipusOperacio == null)
    }

    override fun toString(): String {
        return "CalculadoraTerminal(${this.x} ${this.operacio.simbol} ${this.y} = ${this.resultat})"
    }


}