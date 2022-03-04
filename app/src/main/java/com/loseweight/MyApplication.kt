package com.loseweight

import android.app.Application
import android.content.*
import android.net.ConnectivityManager
import android.os.Handler
import android.speech.tts.TextToSpeech
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.loseweight.utils.*
import java.lang.Exception
import java.util.*


class MyApplication : Application() {

    internal var handler = Handler()

    companion object {
        var textToSpeech: TextToSpeech? = null
        //var musicUtil: MusicUtil? = null

        fun speechText(context: Context, strSpeechText: String,fromTestTTS:Boolean = false) {
            if (checkVoiceOnOrOff(context) || fromTestTTS) {
                if (textToSpeech != null) {
                    textToSpeech!!.setSpeechRate(0.9f)
                    textToSpeech!!.speak(strSpeechText, TextToSpeech.QUEUE_FLUSH, null,Date().time.toString())
                }
            }
        }

        fun checkVoiceOnOrOff(context: Context): Boolean {
            return Utils.getPref(context, Constant.PREF_IS_INSTRUCTION_SOUND_ON, true)
        }


    }

    override fun onCreate() {
        super.onCreate()

        textToSpeech = TextToSpeech(this, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR) {
                textToSpeech!!.language = Locale.ENGLISH
                /*val loc = Locale("spa", "ESP")
                textToSpeech!!.language = loc*/

            }
        })
    }



    class InternetConnectionReceiver() : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {

            if (Utils.isInternetConnected(context) && Utils.isUserLoggedIn(context!!)) {
                Debug.e("InternetConnectionReceiver", "internet Connected")

                LocalBroadcastManager.getInstance(context)
                    .sendBroadcast(Intent(Constant.CONNECTIVITY_CHANGE))

            }

        }

    }


}