package org.example

import model.Calculadora
import javafx.application.Application
import javafx.geometry.Insets
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import model.TipusOperacio
import org.example.utils.CalculadoraController.div
import org.example.utils.CalculadoraController.multi
import org.example.utils.CalculadoraController.resta
import org.example.utils.CalculadoraController.suma

class CalculadoraJavaFXAPI(private val calculadora: Calculadora) : Application() {

    override fun start(primerStage: Stage) {
        /* Declarem els atributs de la vista */
        val txtPrimerOperador = TextField()
        val txtSegonOperador = TextField()
        val btnSuma = Button(TipusOperacio.SUMA.simbol)
        val btnResta = Button(TipusOperacio.RESTA.simbol)
        val btnMulti = Button(TipusOperacio.MULTIPLICACIO.simbol)
        val btnDiv = Button(TipusOperacio.DIVISIO.simbol)
        val lblResultat = Label()

        /* Definim el comportament de les accions de clickar cadascun dels botons */

        btnSuma.setOnAction {
            this.calculadora.setX(txtPrimerOperador.text.toDouble())
            this.calculadora.setY(txtSegonOperador.text.toDouble())
            val resultat: Double = suma(this.calculadora.getX(), this.calculadora.getY())
            lblResultat.text = "La suma de ${this.calculadora.getX()} i ${this.calculadora.getY()} és: $resultat"
        }

        btnResta.setOnAction {
            val primerNumero: Double = txtPrimerOperador.text.toDouble()
            val segonNumero: Double = txtSegonOperador.text.toDouble()
            val resultat: Double = resta(primerNumero, segonNumero)
            lblResultat.text = "La resta de $primerNumero i $segonNumero és: $resultat"
        }

        btnMulti.setOnAction {
            val primerNumero: Double = txtPrimerOperador.text.toDouble()
            val segonNumero: Double = txtSegonOperador.text.toDouble()
            val resultat: Double = multi(primerNumero, segonNumero)
            lblResultat.text = "La multiplicació de $primerNumero i $segonNumero és: $resultat"
        }

        btnDiv.setOnAction {
            val primerNumero: Double = txtPrimerOperador.text.toDouble()
            val segonNumero: Double = txtSegonOperador.text.toDouble()
            val resultat: Double = div(primerNumero, segonNumero)
            lblResultat.text = "La divisió entre $primerNumero i $segonNumero és: $resultat"
        }

        /* DEFINIM ELS COMPONENTS DE LA VISTA */

        // Definim un container horitzontal (una fila d'elements a mostrar a la GUI)
        // L'atribut 5.0 que li passem per paràmetre al constructor serveix per determinar
        // quants píxels de separació hi haurà entre els elements que contingui l'horitzontal box.
        val filaButonsOperacions = HBox(5.0)
        filaButonsOperacions.padding = Insets(10.0)
        filaButonsOperacions.children.addAll(
            btnSuma,
            btnResta,
            btnMulti,
            btnDiv
        )

        // Definim un container vertical (una columna d'elements a mostrar a la GUI)
        val vBox = VBox(10.0)
        vBox.padding = Insets(20.0)
        vBox.children.addAll(
            Label("Introdueix el primer número:"),
            txtPrimerOperador,
            Label("Introdueix el segon número:"),
            txtSegonOperador,
            filaButonsOperacions, // Li afegim tots els elements de l'horitzontal box que hem creat abans
            lblResultat
        )

        // Definim la finestra emergent amb el seu contingut vbox i la seva mida en píxels horitzontal i vertical
        val scene = Scene(vBox, 300.0, 250.0)
        // Definim el títol que es mostrarà a la finestra emergent
        primerStage.title = "Calculadora"
        // Li assignem l'escena creada a l'atribut scene a la finestra GUI del nostre programa 'primerStage'
        primerStage.scene = scene
        // Fem que aparegui la finestra de la GUI
        primerStage.show()
    }
}
