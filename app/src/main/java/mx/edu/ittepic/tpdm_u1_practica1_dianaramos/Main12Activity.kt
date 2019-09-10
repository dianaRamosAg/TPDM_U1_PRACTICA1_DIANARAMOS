package mx.edu.ittepic.tpdm_u1_practica1_dianaramos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main12Activity : AppCompatActivity() {
    var etiquetadesc : TextView?= null
    var regresar : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        etiquetadesc= findViewById(R.id.descripcion)
        regresar = findViewById(R.id.btnregresar)

        //Ventana principal
        var menu= Intent(this,MainActivity::class.java)

        var desc1 = intent.extras?.getString("descripcion")
        etiquetadesc?.setText(desc1)

        regresar?.setOnClickListener {
            startActivity(menu)
        }
    }
}
