package com.vegasega.movievista

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.vegasega.movievista.presensation.loginScreen.Login
import com.vegasega.movievista.presensation.loginScreen.Login2
import com.vegasega.movievista.presensation.loginScreen.LoginScreen
import com.vegasega.movievista.theme.MovieVistaTheme
import com.vegasega.movievista.ui.MovieVistaApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieVistaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
//            val navController = rememberNavController()

//            MovieVistaApp()
            MovieVistaTheme {
                Login2()
            }

        }
    }
}






////@Preview(name = "NEXUS_7", device = Devices.NEXUS_7)
////@Preview(name = "NEXUS_7_2013", device = Devices.NEXUS_7_2013)
////@Preview(name = "NEXUS_5", device = Devices.NEXUS_5)
//@Preview(name = "NEXUS_6", device = Devices.NEXUS_6)
//////@Preview(name = "NEXUS_9", device = Devices.NEXUS_9)
//////@Preview(name = "NEXUS_10", device = Devices.NEXUS_10)
////@Preview(name = "NEXUS_5X", device = Devices.NEXUS_5X)
////@Preview(name = "NEXUS_6P", device = Devices.NEXUS_6P)
//////@Preview(name = "PIXEL_C", device = Devices.PIXEL_C)
////@Preview(name = "PIXEL", device = Devices.PIXEL)
////@Preview(name = "PIXEL_XL", device = Devices.PIXEL_XL)
////@Preview(name = "PIXEL_2", device = Devices.PIXEL_2)
////@Preview(name = "PIXEL_2_XL", device = Devices.PIXEL_2_XL)
////@Preview(name = "PIXEL_3", device = Devices.PIXEL_3)
////@Preview(name = "PIXEL_3_XL", device = Devices.PIXEL_3_XL)
////@Preview(name = "PIXEL_3A", device = Devices.PIXEL_3A)
////@Preview(name = "PIXEL_3A_XL", device = Devices.PIXEL_3A_XL)
////@Preview(name = "PIXEL_4", device = Devices.PIXEL_4)
////@Preview(name = "PIXEL_4_XL", device = Devices.PIXEL_4_XL)
////@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun LoginPreview() {
//    Login(
//
//    )
//}
