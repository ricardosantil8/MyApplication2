package ipvc.estg.myapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ipvc.estg.myapplication.entities.aluno

@Dao
interface AlunoDao {

    @Query("SELECT * from aluno_table ORDER BY aluno ASC")
    fun getAllCities(): LiveData<List<AlunoDao>>

    @Query("SELECT * FROM aluno_table WHERE aluno == :aluno")
    fun getCitiesByCountry(country: String): LiveData<List<AlunoDao>>

    @Query("SELECT * FROM aluno_table WHERE escola == :escola")
    fun getCountryFromCity(city: String): LiveData<AlunoDao>

    @Query("SELECT * FROM aluno_table WHERE numero == :numero")
    fun getCountryFromCity(city: Int): LiveData<AlunoDao>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(city: )

    @Update
    suspend fun updateCity(city: City)

    @Query("DELETE FROM city_table")
    suspend fun deleteAll()

    @Query("DELETE FROM city_table where city == :city")
    suspend fun deleteByCity(city: String)

    @Query("UPDATE city_table SET country=:country WHERE city == :city")
    suspend fun updateCountryFromCity(city: String, country: String)
}