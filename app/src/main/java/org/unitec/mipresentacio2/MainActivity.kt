package org.unitec.mipresentacio2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import kotlinx.android.synthetic.main.activity_main.*
import com.facebook.share.model.ShareLinkContent



class MainActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
    }

    override fun onPostResume() {
        super.onPostResume()

        //Video
        val uri=Uri.parse("https://sierra-guadalupe.org/videito.mp4")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        videoView.setOnCompletionListener {
            videoView.start()
        }


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        val content = ShareLinkContent.Builder().setQuote("Facebook para android")
            .setContentUrl(Uri.parse("https://sierra-guadalupe.org"))
            .build()

        //compartir.shareContent=content


        //Video
        val uri=Uri.parse("https://sierra-guadalupe.org/videito.mp4")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        videoView.setOnCompletionListener {
            videoView.start()
        }




        //b) manejamos el evento de boton usando el id que le asignamos
        navegar.setOnClickListener {

            var algo= Intent(this, CatalogoActivity::class.java)
            startActivity(algo)

            Toast.makeText(this, "Bienvenido al catálogo", Toast.LENGTH_LONG).show()


        }

    }
}
