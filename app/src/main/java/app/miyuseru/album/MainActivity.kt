package app.miyuseru.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this,PreviewActivity::class.java)

        albumImage1.setOnClickListener{

            preview.putExtra("image",R.drawable.pachiko1)

            preview.putExtra("title", "ぬくぬくぱちこ")
            startActivity(preview)

        }

        albumImage2.setOnClickListener{
            preview.putExtra("image",R.drawable.pachiko2)

            preview.putExtra("title", "だんろっぷぱちこ")
            startActivity(preview)

        }

        albumImage3.setOnClickListener{
            preview.putExtra("image",R.drawable.pachiko3)

            preview.putExtra("title", "ウケ狙いぱちこ")
            startActivity(preview)

        }
        albumImage4.setOnClickListener{
            preview.putExtra("image",R.drawable.pachiko4)

            preview.putExtra("title", "お風呂ぱちこ")
            startActivity(preview)

        }
        albumImage5.setOnClickListener{
            preview.putExtra("image",R.drawable.pahiko5)

            preview.putExtra("title", "ぱちこロール")
            startActivity(preview)

        }
        albumImage6.setOnClickListener{
            preview.putExtra("image",R.drawable.pachiko6)

            preview.putExtra("title", "普通のぱちこ")
            startActivity(preview)

        }
    }
}
