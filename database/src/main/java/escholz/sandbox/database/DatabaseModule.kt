package escholz.sandbox.database

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesSandboxDatabase(application: Application): SandboxDatabase =
        Room.databaseBuilder(application, SandboxDatabase::class.java, "sandbox-database").build()
}
