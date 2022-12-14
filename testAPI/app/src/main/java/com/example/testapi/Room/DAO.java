package com.example.testapi.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import io.reactivex.rxjava3.core.Observable;

@Dao
public interface DAO {
    @Insert
    void insert(Stop stop);

    @Update
    void update(Stop stop);

    @Delete
    void delete(Stop stop);

    @Query("DELETE FROM Stop")
    void deleteAllStops();

    @Query("SELECT * FROM Stop WHERE id LIKE :rand_id")
    Stop getStop(int rand_id);
}


    /*
    @Query("SELECT * FROM Stop WHERE id=0")
    Stop getStop();
    */

    /*
    @Query("SELECT * FROM Stop ORDER BY id")
    List<Station> getAllTable();
    */

