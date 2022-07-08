package com.example.tempegorengenak

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.tempegorengenak.model.model

class DatabaseHelper (var context : Context)  : SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {

    companion object{
        private val DATABASE_NAME = "coba"
        private val DATABASE_VERSION = 1

        //table transaksi
        private val TABLE_TRANSAKSI = "transaksi"

        private val COLUMN_NAMA= "nama"
        private val COLUMN_NAMA_PAKET = "paket"
        private val COLUMN_JUMLAH_KG = "jumlah"
        private val COLUMN_ALAMAT = "alamat"
        private val COLUMN_CATATAN = "catatan"
    }
    private val CREATE_TRANSAKSI_TABLE = ("CREATE TABLE " + TABLE_TRANSAKSI + "(" + COLUMN_NAMA + " TEXT PRIMARY KEY AUTO INCREMENT, " + COLUMN_NAMA_PAKET + " TEXT, " + COLUMN_JUMLAH_KG + " INT ,"+ COLUMN_ALAMAT+ "TEXT ,"+ COLUMN_CATATAN+ " TEXT)")
    private val DROP_TRANSAKSI_TABLE = "DROP TABLE IF EXISTS $TABLE_TRANSAKSI"

    private val INSERT_TABLE = ("INSERT INTO TABLE "+ TABLE_TRANSAKSI + "values ('saya','WANJAY','15','disini','jangan dibuang')")
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL(CREATE_TRANSAKSI_TABLE)
        p0?.execSQL(INSERT_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL(DROP_TRANSAKSI_TABLE)
        onCreate(p0)
    }

    fun insert (transaksi : model){
        val db = writableDatabase
        val values : ContentValues


    }
}