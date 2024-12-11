package com.example.project7.dependeciesinjection

import android.content.Context
import com.example.project7.data.database.KrsDatabase
import com.example.project7.repository.LocalRepositoryMhs
import com.example.project7.repository.RepositoryMhs

interface InterfaceContainerApp{
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())   //mengakses abstract classnya
    }
}