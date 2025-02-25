import javafx.application.Application
import org.example.CalculadoraJavaFXAPI
import util.readDouble
import view.CalculadoraTerminal

fun main() {
    /* Cridem a la vista de JavaFX API */
    Application.launch(CalculadoraJavaFXAPI::class.java)

    /* Cridem a la vista del terminal de IntelliJ */
    val calculadoraTerminal: CalculadoraTerminal = CalculadoraTerminal()

    calculadoraTerminal.setX(readDouble("Escriu el valor del primer operand", "Valor incorrecte"))
    calculadoraTerminal.setY(readDouble("Escriu el valor del segon operand", "Valor incorrecte"))
    calculadoraTerminal.escollirOperacio()
    println(calculadoraTerminal)
}