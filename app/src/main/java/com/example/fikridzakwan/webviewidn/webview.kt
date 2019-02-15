package com.example.fikridzakwan.webviewidn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_webview.*

classwebview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webview.settings.javaScriptEnabled

        val idn = intent.getStringExtra("idn")

        if (idn.equals("https://idn.sch.id/2018/08/24/dua-siswa-bogor-jadi-tim-network-asian-games-satu-satunya-tim-smk-yang-bertugas-jaga-kestabilan-jaringan/")) {
            webview.loadUrl("https://idn.sch.id/2018/08/24/dua-siswa-bogor-jadi-tim-network-asian-games-satu-satunya-tim-smk-yang-bertugas-jaga-kestabilan-jaringan/")
        }else if (idn.equals("https://idn.sch.id/2018/09/26/olimpiade-mikrotik-2018/")){
            webview.loadUrl("https://idn.sch.id/2018/09/26/olimpiade-mikrotik-2018/")
        }else if (idn.equals("https://idn.sch.id/2018/09/23/seminar-kesehatan-untuk-siswa-idn-boarding-school/")){
            webview.loadUrl("https://idn.sch.id/2018/09/23/seminar-kesehatan-untuk-siswa-idn-boarding-school/")
        }else{
            webview.loadUrl("https://idn.sch.id/2018/09/24/smk-idn-siapkan-it-andal-hingga-pintar-mengaji/")
        }
    }

}
