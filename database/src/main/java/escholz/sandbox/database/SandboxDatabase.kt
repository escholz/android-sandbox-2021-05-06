package escholz.sandbox.database

import androidx.room.Database
import androidx.room.RoomDatabase
import escholz.sandbox.database.dao.CharacterDao
import escholz.sandbox.database.entity.Character

@Database(entities = [ Character::class ], version = 1, exportSchema = false)
abstract class SandboxDatabase: RoomDatabase() {
    abstract fun characterDao(): CharacterDao
}