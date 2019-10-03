package net.buildbox.sample.buildbox_AlertDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onShowAlertDialog(view: View) {
        AlertDialog.Builder(this)
            .setTitle("ダイアログのタイトルです")
            .setMessage("ダイアログのメッセージです。伝えたい内容をここに記入してください。")
            .show()
    }
}
