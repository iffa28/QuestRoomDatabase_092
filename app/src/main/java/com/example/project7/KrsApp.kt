package com.example.project7

import android.app.Application
import com.example.project7.dependeciesinjection.ContainerApp

class KrsApp: Application() {
    //fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp     //kenapa di panggil ini karena utk mengakses db itu menggunakan repositori sementara repositori berada di containerApp

    override fun onCreate() {
        super.onCreate()
        //Membuat instance ContainerApp

        containerApp = ContainerApp(this)
        //instance adalah object yang dibuat dari class
    }
}