package com.example.yemektarifleri

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.jar.Manifest


class TarifFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

                }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val onClickListener = button.setOnClickListener {
            kaydet(it)
        }
        imageView.setOnClickListener{
            gorselSec(it)
        }
    }

    fun kaydet(view: View){
        //SQLite'a Kaydetme
        println("tıklandı")
    }
    fun gorselSec(view: View){
       activity.let {
        if(contextcompant.checkSelfPermission(it.applicationContext,Manifest.permission.Read_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
        requestPermissions(arrayOd(Manifest.permission.READ_EXTERNAL_STORAGE),resquestCode:1)
    }
    else{
        val galeriIntent= Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galeriIntent,targetRequestCode:2)
    }
    }
}
