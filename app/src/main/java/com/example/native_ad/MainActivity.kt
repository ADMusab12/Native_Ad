package com.example.native_ad


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.native_ad.databinding.ActivityMainBinding
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {
private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MobileAds.initialize(this)

        binding.btnLoadNative.setOnClickListener {
            loadNativeAdmob(
                findViewById(R.id.nativeLayout),
                Constant.NativeId,R.layout.custom_ad_large,
                {

                }, {

                })
        }
    }
}

