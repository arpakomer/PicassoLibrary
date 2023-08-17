package com.arpak.picassoofuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arpak.picassoofuse.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonShowPhoto.setOnClickListener {

            val url: String = "https://picsum.photos/200"

// risize method'umuzun kullanımı oldukca onemlidir cunku gorsellerinizi dogru kullanılmaması sizi Out of memory goturebilir.
            Picasso.get()
                .load(url)
//                .resize(200, 500)
                .fit()
                .rotate(90f)
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_error)
                .into(binding.imageView)


        }
    }
}