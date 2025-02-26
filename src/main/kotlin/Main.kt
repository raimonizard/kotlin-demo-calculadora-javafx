import javafx.application.Application
import org.example.CalculadoraJavaFXAPI
import util.readDouble
import util.readInt
import view.CalculadoraTerminal

fun main() {
    do {
        var opcioGui: Int = readInt(
            "Escull vista:\n\t1. Terminal\n\t2. GUI\n\t3. Sortir",
            "Valor incorrecte",
            "Valor fora de rang",
            1,
            3
        )
        when (opcioGui) {
            1 -> calculadoraVistaTerminal(calculadora)
            2 -> calculadoraVistaGUI()
            3 -> println("Sortint...")
        }
    }while (opcioGui != 3)
}

fun calculadoraVistaTerminal(calculadora: Calculadora) {
    /* Cridem a la vista del terminal de IntelliJ */

    calculadora.setX(readDouble("Escriu el valor del primer operand", "Valor incorrecte"))
    calculadora.setY(readDouble("Escriu el valor del segon operand", "Valor incorrecte"))

    val calculadoraTerminal: CalculadoraTerminal = CalculadoraTerminal(calculadora)
    calculadoraTerminal.escollirOperacio()
    println(calculadoraTerminal.getCalculadora())
}

fun calculadoraVistaGUI() {
    /* Cridem a la vista de JavaFX API */
    Application.launch(CalculadoraJavaFXAPI()::class.java)
}