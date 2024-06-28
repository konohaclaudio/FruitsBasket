package com.example.fruitsbasket.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.fruitsbasket.model.Produto

@Dao
interface ProdutoDao {
    @Query ("SELECT * FROM PRODUTO")
    fun buscaTodos(): List<Produto>

    @Insert
    fun salva (vararg produto: Produto)

}