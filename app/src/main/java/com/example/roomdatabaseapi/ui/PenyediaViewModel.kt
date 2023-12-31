package com.example.roomdatabaseapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabaseapi.ui.home.viewmodel.HomeViewModel
import com.example.roomdatabaseapi.ui.home.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRespository)
        }

        initializer {
            InsertViewModel(aplikasiKontak().container.kontakRespository)
        }
    }
}

fun CreationExtras.aplikasiKontak(): KontakAplikasi =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikasi)