package escholz.sandbox.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class Character(
    @PrimaryKey val id: Int,
    val name: String?,
    val description: String?,
    val modified: Long?,
    @ColumnInfo(name = "resource_uri") val resourceUri: String?,
    @ColumnInfo(name = "thumbnail_path") val thumbnailPath: String?,
    @ColumnInfo(name = "thumbnail_ext") val thumbnailExt: String?
) {}