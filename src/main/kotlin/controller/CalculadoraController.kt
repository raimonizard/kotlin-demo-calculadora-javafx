package org.example.utils

/**
 * Classe singleton Calculadora.
 * D'aquesta classe només se'n podrà crear un objecte.
 * S'usa a mode de llibreria d'atributs i mètodes similar al concepte de classe estàtica
 * que podem trobar a Java.
 * @author RIS
 */
object CalculadoraController {
    /**
     * Funció que suma els dos paràmetre double donats i en retorna el resultat
     * @author RIS
     * @param a valor 1
     * @param b valor 2
     * @return retorna la suma de a + b en Double
     */
    internal fun suma(a: Double, b: Double): Double{
        return a + b
    }

    /**
     * Funció que resta els dos paràmetre double donats i en retorna el resultat
     * @author RIS
     * @param a valor 1
     * @param b valor 2
     * @return retorna la resta de a - b en Double
     */
    internal fun resta(a: Double, b: Double): Double{
        return a - b
    }

    /**
     * Funció que multiplica els dos paràmetre double donats i en retorna el resultat
     * @author RIS
     * @param a valor 1
     * @param b valor 2
     * @return retorna la multiplica de a * b en Double
     */
    internal fun multi(a: Double, b: Double): Double{
        return a * b
    }

    /**
     * Funció que divideix els dos paràmetre double donats i en retorna el resultat
     * @author RIS
     * @param a valor 1
     * @param b valor 2
     * @return retorna la divisió de a / b en Double
     */
    internal fun div(a: Double, b: Double): Double{
        return a / b
    }
}