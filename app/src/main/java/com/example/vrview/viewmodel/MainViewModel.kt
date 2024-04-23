package com.example.vrview.viewmodel

import android.net.Uri
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
    val openGallery : MutableLiveData<Boolean> = MutableLiveData(false)

    fun clickedOpenGallery(){
        openGallery.value = true
    }

    /*fun playMergedVideo(videoUris: List<Uri>) {
        viewModelScope.launch(Dispatchers.IO) { val mediaItems = mutableListOf<MediaItem>()
            for (uri in videoUris) {
                val mediaItem = MediaItem.fromUri(uri)
                mediaItems.add(mediaItem)
            }
            val mergedMediaItems = MediaItem.fromUriList(mediaItems.map { it.uri })

            withContext(Dispatchers.Main) {
                exoPlayer.setMediaItems(mergedMediaItems)
                exoPlayer.prepare()
                exoPlayer.play()
            }
        }

    }*/

}