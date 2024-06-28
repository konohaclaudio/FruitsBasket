
import android.content.Context
import android.content.Intent
import android.provider.MediaStore
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.example.fruitsbasket.extensions.tentaCarregarImagem
import com.example.fruitsbasket.databinding.FormularioImagemBinding


class FormularioImagemDialog(private val context: Context) {

    fun mostra(
        urlPadrao: String? = null,
        quandoImagemCarragada: (imagem: String) -> Unit
    )  {
//        val binding = FormularioImagemBinding


        FormularioImagemBinding
            .inflate(LayoutInflater.from(context)).apply {

                urlPadrao?.let{
                 formularioImagemImageview.tentaCarregarImagem(it)
                 formularioImagemUrl.setText(it)
                }

             formularioImagemBotaoCarregar.setOnClickListener {
                    val url = formularioImagemUrl.text.toString()
                    formularioImagemImageview.tentaCarregarImagem(url)
                }



                AlertDialog.Builder(context)
                    .setView(root)
                    .setPositiveButton("Confirmar") { _, _ ->
                        val url = formularioImagemUrl.text.toString()
//                        Log.i("FormularioImagemDialog", "mostra: $url")
                        quandoImagemCarragada(url)
                    }
                    .setNegativeButton("Cancelar") { _, _ ->

                    }
                    .show()

                formularioImagemBotaoCamera.setOnClickListener {
                    val url = formularioImagemUrl.text.toString()
                    formularioImagemImageview.tentaCarregarImagem(url)
                }




            }




//        urlPadrao?.let{
//            binding.formularioImagemImageview.tentaCarregarImagem(it)
//            binding.formularioImagemUrl.setText(it)
//        }

//        binding.formularioImagemBotaoCarregar.setOnClickListener {
//            val url = binding.formularioImagemUrl.text.toString()
//            binding.formularioImagemImageview.tentaCarregarImagem(url)
//        }

//        AlertDialog.Builder(context)
//            .setView(binding.root)
//            .setPositiveButton("Confirmar") { _, _ ->
//                val url = binding.formularioImagemUrl.text.toString()
//                Log.i("FormularioImagemDialog", "mostra: $url")
//                quandoImagemCarragada(url)
//            }
//            .setNegativeButton("Cancelar") { _, _ ->
//
//            }
//            .show()
    }

}