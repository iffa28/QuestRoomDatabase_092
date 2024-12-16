package com.example.project7.ui.viewmodel

import com.example.project7.data.entity.Mahasiswa


data class HomeUiState (
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)
