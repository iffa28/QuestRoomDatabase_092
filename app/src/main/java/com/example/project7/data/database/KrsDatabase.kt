package com.example.project7.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.project7.data.dao.MahasiswaDao
import com.example.project7.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version= 1, exportSchema = false)
abstract class KrsDatabase: RoomDatabase() {
    //mendefinisikan fungsi utk mengakses data mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile   //memastikan bahwa nilai variabel Instance selalu sama di semua thread
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this)
            {
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java,         //Class database
                    "KrsDatabase"              //Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}