package com.example.fikridzakwan.webviewidn

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cdAsianGame.setOnClickListener {
            val intent = Intent(this, webview::class.java)
            intent.putExtra("idn", "https://idn.sch.id/2018/08/24/dua-siswa-bogor-jadi-tim-network-asian-games-satu-satunya-tim-smk-yang-bertugas-jaga-kestabilan-jaringan/")
            startActivity(intent)
        }

        cdMikriTik.setOnClickListener {
            val intent = Intent(this, webview::class.java)
            intent.putExtra("idn", "https://idn.sch.id/2018/09/26/olimpiade-mikrotik-2018/")
            startActivity(intent)
        }

        cdKesehatan.setOnClickListener {
            val intent = Intent(this, webview::class.java)
            intent.putExtra("idn", "https://idn.sch.id/2018/09/23/seminar-kesehatan-untuk-siswa-idn-boarding-school/")
            startActivity(intent)
        }

        cdKoran.setOnClickListener {
            val intent = Intent(this, webview::class.java)
            intent.putExtra("idn", "https://idn.sch.id/2018/09/24/smk-idn-siapkan-it-andal-hingga-pintar-mengaji/")
            startActivity(intent)
        }

        instagram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/smp.smk.idn/?hl=id"))
            startActivity(intent)
        }

        facebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/smk.idn/"))
            startActivity(intent)

        }

        youtube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/channel/UCjkVxmE--3e7skferZbHWhg"))
            startActivity(intent)
        }

        gmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto","pesantren@idn.id", null))
            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }else{
                Toast.makeText(this, "Donwload dlu aplikasi gmailnya", Toast.LENGTH_SHORT).show()
            }


        }

    }
}
