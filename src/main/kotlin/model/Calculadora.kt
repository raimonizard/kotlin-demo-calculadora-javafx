package model

import org.example.utils.CalculadoraController.div
import org.example.utils.CalculadoraController.multi
import org.example.utils.CalculadoraController.resta
import org.example.utils.CalculadoraController.suma

class Calculadora {
    private var x: Double
    private var y: Double
    lateinit var operacio: TipusOperacio
    private var resultat: Double

    constructor() {
        this.x = 0.0
        this.y = 0.0
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

    override fun toString(): String {
        return "Calculadora(${this.x} ${this.operacio.simbol} ${this.y} = ${this.resultat})"
    }
}