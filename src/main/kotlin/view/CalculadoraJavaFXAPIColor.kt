package org.example

import javafx.application.Application
import javafx.geometry.Insets
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.*
import model.Color
import model.TipusOperacio
import org.example.utils.CalculadoraController.div
import org.example.utils.CalculadoraController.multi
import org.example.utils.CalculadoraController.resta
import org.example.utils.CalculadoraController.suma

class CalculadoraJavaFXAPIColor: Application() {

    override fun start(primerStage: Stage) {
        /* Declarem els atributs de la vista */
        val txtPrimerOperador = TextField()
        val txtSegonOperador = TextField()
        val btnSuma = Button(TipusOperacio.SUMA.simbol)
        val btnResta = Button(TipusOperacio.RESTA.simbol)
        val btnMulti = Button(TipusOperacio.MULTIPLICACIO.simbol)
        val btnDiv = Button(TipusOperacio.DIVISIO.simbol)
        val lblResultat = Label()
        // Desplegable 'DropDown' per escollir el color de la GUI
        val desplegableColorBackground = ComboBox<Color>()
        // Afegim al desplegable tots els colors definits dins de l'ENUM Color
        desplegableColorBackground.items.addAll(Color.values())

        /* Definim el comportament de les accions de l'acció clickar damunt de cadascun dels botons */

        btnSuma.setOnAction {
            val valors = capturarValorsTextField(txtPrimerOperador, txtSegonOperador)
            val resultat: Double = suma(valors.first, valors.second)
            lblResultat.text = "La ${TipusOperacio.SUMA.toString().lowercase()} de ${valors.first} i ${valors.second} és: $resultat"
        }

        btnResta.setOnAction {
            val valors = capturarValorsTextField(txtPrimerOperador, txtSegonOperador)
            val resultat: Double = resta(valors.first, valors.second)
            lblResultat.text = "La ${TipusOperacio.RESTA.toString().lowercase()} de ${valors.first} i ${valors.second} és: $resultat"
        }

        btnMulti.setOnAction {
            val valors = capturarValorsTextField(txtPrimerOperador, txtSegonOperador)
            val resultat: Double = multi(valors.first, valors.second)
            lblResultat.text = "La ${TipusOperacio.MULTIPLICACIO.toString().lowercase()} de ${valors.first} i ${valors.second} és: $resultat"
        }

        btnDiv.setOnAction {
            val valors = capturarValorsTextField(txtPrimerOperador, txtSegonOperador)
            val resultat: Double = div(valors.first, valors.second)
            lblResultat.text = "La ${TipusOperacio.DIVISIO.toString().lowercase()} de ${valors.first} i ${valors.second} és: $resultat"
        }

        // Definim l'acció a fer quan s'interactuï amb el desplegable
        desplegableColorBackground.setOnAction {
            val colorTriat = desplegableColorBackground.value
            primerStage.scene.root.style = "-fx-background-color: ${colorTriat.backgroundColor};"
        }

        /* DEFINIM ELS COMPONENTS DE LA VISTA */

        // Definim un container horitzontal (una fila d'elements a mostrar a la GUI)
        // L'atribut 5.0 que li passem per paràmetre al constructor serveix per determinar
        // quants píxels de separació hi haurà entre els elements que contingui l'horitzontal box.
        val filaButonsOperacions = HBox(5.0)
        filaButonsOperacions.padding = Insets(10.0) // Aquesta línia estableix un marge intern (padding) de 10 píxels a tots els costats del contenidor VBox.
        filaButonsOperacions.children.addAll(
            btnSuma,
            btnResta,
            btnMulti,
            btnDiv
        )

        // Definim un container vertical (una columna d'elements a mostrar a la GUI)
        val vBox = VBox(10.0)
        vBox.padding = Insets(20.0) // Aquesta línia estableix un marge intern (padding) de 20 píxels a tots els costats del contenidor VBox.
        vBox.children.addAll(
            Label("Escull skin de color de fons"),
            desplegableColorBackground,
            Label("Introdueix el primer número:"),
            txtPrimerOperador,
            Label("Introdueix el segon número:"),
            txtSegonOperador,
            filaButonsOperacions, // Li afegim tots els elements de l'horitzontal box que hem creat abans
            lblResultat
        )
        // Apliquem estil al contenidor vertical
        //vBox.style = "-fx-background-color: ${Color.CYAN.backgroundColor};"

        // Definim la finestra emergent amb el seu contingut vbox i la seva mida en píxels horitzontal i vertical
        val scene = Scene(vBox, 400.0, 300.0)
        // Definim el títol que es mostrarà a la finestra emergent
        primerStage.title = "Calculadora"
        // Li assignem l'escena creada a l'atribut scene a la finestra GUI del nostre programa 'primerStage'
        primerStage.scene = scene
        // Fem que aparegui la finestra de la GUI
        primerStage.show()
    }

    /**
     * Funció que captura els valors de l'input de l'usuari dins dels TextFields de la GUI
     * amb control d'excepcions i els retorna en format Double.
     * @author RIS
     * @param txtPrimerOperador el TextField del primer operador
     * @param txtSegonOperador el TextField del segon operador
     * @return Una parella de valors en format Pair<Double, Double>
     */
    private fun capturarValorsTextField(txtPrimerOperador: TextField,
                                        txtSegonOperador: TextField):
                                        Pair<Double, Double>
    {
        var primerNumero: Double = 0.0
        var segonNumero: Double = 0.0

        try {
            primerNumero = txtPrimerOperador.text.toDouble()
            segonNumero = txtSegonOperador.text.toDouble()
        }catch (e: NumberFormatException){
            println(Color.RED.consoleColor + "ERROR: Has introduit valors incorrectes dins dels TextFields de la Calculadora GUI" + Color.RESET.consoleColor)
        }

        return  Pair(primerNumero, segonNumero)
    }
}
