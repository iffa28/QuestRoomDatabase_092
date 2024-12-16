package com.example.project7.ui.viewmodel

import com.example.project7.data.entity.Mahasiswa

fun Mahasiswa.toUiStateMhs() : MhsUIState = MhsUIState (
    mahasiswaEvent = this.toDetailUiEvent(),
)