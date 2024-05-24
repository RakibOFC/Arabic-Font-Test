package com.rakibofc.arabicfonttest

import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val specialChar = "اَلِیْمٌ ۙ۬۟ \uF64A— ,أَلِيمُۢ"
        val urlEncoder = URLEncoder.encode(specialChar, "UTF-8");
        val word = URLEncoder.encode("\uF64A", "UTF-8")

        val spannedText: Spanned = Html.fromHtml(specialChar, Html.FROM_HTML_MODE_LEGACY)
        findViewById<TextView>(R.id.tvTemp).text = specialChar

        val word = "هَنِیْٓـًٔا\uF64A"
        val char2 = "\uF64B"

        for (char in word) {
            Log.e("TAG", "ASCII code for '$char' is ${char.code}")
        }*/
    }
}