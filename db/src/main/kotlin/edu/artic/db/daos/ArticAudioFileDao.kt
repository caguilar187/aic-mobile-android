package edu.artic.db.daos

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import edu.artic.db.models.ArticAudioFile

@Dao
interface ArticAudioFileDao {
    @Query("select * from ArticAudioFile limit 1")
    fun getFirstAudioFile(): ArticAudioFile

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAudioFiles(files: List<ArticAudioFile>)
}