package com.sandra.tecuido.repository;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.sandra.tecuido.data.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class MedicamentoRepository {
    private final MedicamentosSQLHelper admin;

    public MedicamentoRepository(MedicamentosSQLHelper admin) {
        this.admin = admin;
    }

    public boolean guardar (Medicamento medicamento){
        ContentValues valorMed = new ContentValues();
        valorMed.put("name", medicamento.getName());
        valorMed.put("dosis", medicamento.getDosis());
        valorMed.put("observations", medicamento.getObservaciones());
        SQLiteDatabase writableDataBase = admin.getWritableDatabase();
        long rowId = writableDataBase.insert("medicamento", null, valorMed);
        writableDataBase.close();
        return rowId != -1;
       }

    public List <Medicamento> read (){
        List <Medicamento> listaMedicamentos = new ArrayList<>();
        SQLiteDatabase readableDatabase = admin.getReadableDatabase();
        Cursor cursor = readableDatabase.rawQuery("select name, dosis, observations from medicamento", null);
        while (cursor.moveToNext()) {
            Medicamento medicamento =  new Medicamento (cursor.getString(0), null, 0, cursor.getString(1),cursor.getString(2));
            listaMedicamentos.add(medicamento);
        }
        readableDatabase.close();
        return listaMedicamentos;
    }


}

