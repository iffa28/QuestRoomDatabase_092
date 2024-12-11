package com.example.project7.repository

import com.example.project7.data.dao.MahasiswaDao
import com.example.project7.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
): RepositoryMhs {    //implementasi dari RepositoryMhs
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}