package br.com.igti.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        button =  findViewById(R.id.btnResultado)
        if (savedInstanceState !=null){
            if (savedInstanceState.getBoolean(TAG_VIEW)){
                button.visibility = View.VISIBLE
            }
        }
        Log.i(TAG, "$ACTIVITY onCreate")
        configurarListeners()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(TAG_VIEW, button.visibility == View.VISIBLE)
    }

    private fun configurarListeners(){
        acaoBotaoVoltar()
        acaoBotaoNovo()

    }

    private fun acaoBotaoNovo() {
        findViewById<Button>(R.id.btnNovo).setOnClickListener{
            button.visibility = View.VISIBLE
        }
    }



    private fun acaoBotaoVoltar() {
             button.setOnClickListener{
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "$ACTIVITY onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "$ACTIVITY onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$ACTIVITY onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "$ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "$ACTIVITY onDestroy")
    }

    companion object {
        private const val TAG = "LogI"
        private const val ACTIVITY = "ResultadoActivity::"
        private val TAG_VIEW = "btn_visibility"
    }
}