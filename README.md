# Mi Presentacion
## Primer proyecto de Sistemas interactivos

### Ajuste de un **ImageView** con código 

Usamos el método **setImageDrawable()** que recibe un argumento de tipo Drawable como se muestra el ejemplo siguiente:

``
imagen.setImageDrawable(resources.getDrawable(R.mipmap.arte,applicationContext.theme))
``

##  Para  reproducir un video implementa el siguiente código

```

        val uri=Uri.parse("https://sierra-guadalupe.org/videito.mp4")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        videoView.setOnCompletionListener {
            videoView.start()
        }
```

