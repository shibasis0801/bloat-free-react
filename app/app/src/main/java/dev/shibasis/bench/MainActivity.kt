package dev.shibasis.bench

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.facebook.react.*
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler

import com.facebook.soloader.SoLoader







class MainActivity : ReactActivity() {
    override fun getMainComponentName(): String {
        return "BenchmarkApplication"
    }

//    override fun getUseDeveloperSupport(): Boolean {
//        TODO("Not yet implemented")
//    }
//
//    override fun getPackages(): MutableList<ReactPackage> {
//        TODO("Not yet implemented")
//    }

}
