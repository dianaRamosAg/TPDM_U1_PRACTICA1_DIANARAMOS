package mx.edu.ittepic.tpdm_u1_practica1_dianaramos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var img1 : ImageView ?=null
    var img2 : ImageView ?=null
    var img3 : ImageView ?=null
    var img4 : ImageView ?=null
    var img5 : ImageView ?=null
    var img6 : ImageView ?=null
    var img7 : ImageView ?=null
    var img8 : ImageView ?=null
    var img9 : ImageView ?=null
    var img10 : ImageView ?=null
    var img11 : ImageView ?=null
    var img12 : ImageView ?=null
    var img13 : ImageView ?=null
    var img14 : ImageView ?=null
    var img15 : ImageView ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //REFERENCIAS
          img1 = findViewById(R.id.imagen1)
          img2 = findViewById(R.id.imagen2)
          img3 = findViewById(R.id.imagen3)
          img4 = findViewById(R.id.imagen4)
          img5 = findViewById(R.id.imagen5)
          img6 = findViewById(R.id.imagen6)
          img7 = findViewById(R.id.imagen7)
          img8 = findViewById(R.id.imagen8)
          img9 = findViewById(R.id.imagen9)
          img10 = findViewById(R.id.imagen10)
          img11 = findViewById(R.id.imagen11)
          img12 = findViewById(R.id.imagen12)
          img13 = findViewById(R.id.imagen13)
          img14 = findViewById(R.id.imagen14)
          img15 = findViewById(R.id.imagen15)


        //Eventos
        img1?.setOnClickListener {
            var imgdesc= Intent(this,Main2Activity::class.java)
            var  desc = "Mis hermanas y yo de pequeñas"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img2?.setOnClickListener {
            var imgdesc2= Intent(this,Main3Activity::class.java)
          //  var  desc = "Altar de muertos"
           // imgdesc2.putExtra("descripcion",desc)
            startActivity(imgdesc2)
        }
        img3?.setOnClickListener {
            var imgdesc= Intent(this,Main4Activity::class.java)
            var  desc = "Año nuevo"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img4?.setOnClickListener {
            var imgdesc= Intent(this,Main5Activity::class.java)
            var  desc = "Mis papás,hermana y yo en una boda"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img5?.setOnClickListener {
            var imgdesc= Intent(this,Main6Activity::class.java)
            var  desc = "Cumpleaños de mi mamá"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img6?.setOnClickListener {
            var imgdesc= Intent(this,Main7Activity::class.java)
            var  desc = "Abuela Chepina y yo <3"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img7?.setOnClickListener {
            var imgdesc= Intent(this,Main8Activity::class.java)
            var  desc = "Cupcake(Representación de mi familia)"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img8?.setOnClickListener {
            var imgdesc= Intent(this,Main9Activity::class.java)
            var  desc = "Mi mamá y yo"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img9?.setOnClickListener {
            var imgdesc= Intent(this,Main10Activity::class.java)
            var  desc = "Amigos..."
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img10?.setOnClickListener {
            var imgdesc= Intent(this,Main11Activity::class.java)
            var  desc = "Mejor amiga y yo"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img11?.setOnClickListener {
            var imgdesc= Intent(this,Main12Activity::class.java)
            var  desc = "Jugando Beisbol con mi sobrino"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img12?.setOnClickListener {
            var imgdesc= Intent(this,Main13Activity::class.java)
            var  desc = "El mejor regalo :p"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img13?.setOnClickListener {
            var imgdesc= Intent(this,Main14Activity::class.java)
            var  desc = "Mi sobrina y yo xd"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img14?.setOnClickListener {
            var imgdesc= Intent(this,Main15Activity::class.java)
            var  desc = "Boda de mi prima 2016"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }
        img15?.setOnClickListener {
            var imgdesc= Intent(this,Main16Activity::class.java)
            var  desc = "Primas Familia Ramos Navidad 2018"
            imgdesc.putExtra("descripcion",desc)
            startActivity(imgdesc)
        }



    }
}
