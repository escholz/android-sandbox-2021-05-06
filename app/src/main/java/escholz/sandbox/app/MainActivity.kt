package escholz.sandbox.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import dagger.Lazy
import dagger.hilt.android.AndroidEntryPoint
import escholz.sandbox.R
import escholz.sandbox.database.SandboxDatabase
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: MainActivity will have a ViewPager2 that reads from injected Set<Fragment>

    }

    @Preview
    @Composable
    fun composeFunc() {
        Column(Modifier.width(Dp(100.0f))) {
            Text(text = "YoMama")
            Text(text = "YoDaddy")
        }
    }
}