import javafx.application.Application
import model.Calculadora
import org.example.CalculadoraJavaFXAPI
import org.example.CalculadoraJavaFXAPIColor
import util.readDouble
import util.readInt
import view.CalculadoraTerminal

/**
 * Entry point de l'aplicació.
 * @author RIS
 */
fun main() {
    menuPrincipal()
}

private fun menuPrincipal(){
    val calculadora: Calculadora = Calculadora()

    do {
        var opcioGui: Int = readInt(
            "Escull vista:\n\t1. Terminal\n\t2. GUI\n\t3. GUI a color\n\t4. Sortir",
            "Valor incorrecte",
            "Valor fora de rang",
            1,
            4
        )
        when (opcioGui) {
            1 -> calculadoraVistaTerminal(calculadora)
            2 -> calculadoraVistaGUI()
            3 -> calculadoraVistaGUIColor()
            4 -> println("Sortint...")
        }
    }while (opcioGui != 4)
}

/**
 * Mètode usat per a inicialitzar els valors de l'objecte calculadora,
 * declarar i inicialitzar l'objecte de la vista del terminal.
 * @author RIS
 * @param calculadora
 */
private fun calculadoraVistaTerminal(calculadora: Calculadora) {
    /* Donem valors als atributs de l'Objecte Calculadora usant els seus setters */
    calculadora.setX(readDouble("Escriu el valor del primer operand", "Valor incorrecte"))
    calculadora.setY(readDouble("Escriu el valor del segon operand", "Valor incorrecte"))

    /* Inicialitzem la vista de Calculadora Terminal */
    val calculadoraTerminal: CalculadoraTerminal = CalculadoraTerminal(calculadora)
    /* Cridem a la vista del terminal de IntelliJ */
    calculadoraTerminal.escollirOperacio()
    println(calculadoraTerminal.getCalculadora())
}

/**
 * Mètode que genera la finestra emergent de JavaFX API.
 * Fa gestió d'excepcions ja que si es tanca la finestra emergent,
 * no es podrà tornar a mostrar mentre el programa està en execució.
 * @author RIS
 */
private fun calculadoraVistaGUI() {
    try {
        /* Cridem a la vista de JavaFX API */
        Application.launch(CalculadoraJavaFXAPI()::class.java)
    }catch (ise: IllegalStateException){
        println("ERROR: Si es tanca finestra de la GUI no es pot llançar més d'un cop mentre la app es troba en execució. S'hauria de generar una nova scene.")
    }catch(e: Exception){
        println("FATAL ERROR: ${e.stackTraceToString()}")
    }
}

/**
 * Mètode que genera la finestra emergent de JavaFX API amb GUI a color.
 * Fa gestió d'excepcions ja que si es tanca la finestra emergent,
 * no es podrà tornar a mostrar mentre el programa està en execució.
 * @author RIS
 */
private fun calculadoraVistaGUIColor() {
    try {
        /* Cridem a la vista de JavaFX API */
        Application.launch(CalculadoraJavaFXAPIColor()::class.java)
    }catch (ise: IllegalStateException){
        println("ERROR: Si es tanca finestra de la GUI no es pot llançar més d'un cop mentre la app es troba en execució. S'hauria de generar una nova scene.")
    }catch(e: Exception){
        println("FATAL ERROR: ${e.stackTraceToString()}")
    }
}