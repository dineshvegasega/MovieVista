package com.vegasega.movievista.presensation.loginScreen

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.vegasega.movievista.R
import com.vegasega.movievista.theme.MovieVistaTheme
import com.vegasega.movievista.theme.ghost_white


@Composable
internal fun LoginRoute(
    onRegister: () -> Unit,
) {
    LoginScreen(
        onRegister = onRegister
    )
}


@Composable
fun LoginScreen(
    onRegister: () -> Unit,
) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.White)
//    )
//

//    LazyColumn(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        item {
//            ConstraintLayout {
//                val (image, loginForm) = createRefs()
//                Box(
//                    contentAlignment = Alignment.Center,
//                    modifier = Modifier
//                        .height(280.dp)
//                        .constrainAs(image) {
//                            top.linkTo(loginForm.top)
//                            bottom.linkTo(loginForm.top)
//                            start.linkTo(parent.start)
//                            end.linkTo(parent.end)
//                        }){
//                    Image(
//                        modifier = Modifier.fillMaxSize(),
//                        bitmap = ImageBitmap.imageResource(id = R.drawable.login_bg),
//                        contentScale = ContentScale.FillWidth,
//                        contentDescription = "header_view_login_bg"
//                    )
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.padding(bottom = 40.dp)
//                    ) {
//                        Image(
//                            modifier = Modifier.wrapContentWidth(),
//                            bitmap = ImageBitmap.imageResource(id = R.drawable.flower_logo),
//                            contentDescription = "header_view_flower_logo"
//                        )
//                        androidx.compose.material.Text(
//                            text = "FloraGoGo",
//                            color = Color.White,
//                            style = TextStyle(
//                                fontSize = 40.sp,
//                                fontFamily = FontFamily(Font(R.font.montserrat_semibold)),
//                                letterSpacing = 2.sp
//                            )
//                        )
//                    }
//                }
//
//
//
//                Card(
//                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
//                    backgroundColor = Color.White,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(top = 100.dp)
//                        .constrainAs(loginForm) {
//                            bottom.linkTo(parent.bottom)
//                            start.linkTo(parent.start)
//                            end.linkTo(parent.end)
//                        },
//                ){
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(30.dp)
//                    ) {
//
//                    }
//                }
//            }
//        }
//
//    }



    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ConstraintLayout {
                val (image, loginForm) = createRefs()
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(280.dp)
                        .constrainAs(image) {
                            top.linkTo(loginForm.top)
                            bottom.linkTo(loginForm.top)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }) {
                    HeaderView()
                }
                Card(
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
                    backgroundColor = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 100.dp)
                        .constrainAs(loginForm) {
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        },
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(30.dp)
                    ) {

                        val loginText = "Log in to your account."
                        val loginWord = "Log in"
                        val loginAnnotatedString = buildAnnotatedString {
                            append(loginText)
                            addStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontFamily = FontFamily(Font(R.font.montserrat_semibold))
                                ),
                                start = 0,
                                end = loginText.length
                            )
                            addStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                                ),
                                start = 0,
                                end = loginWord.length
                            )
                        }

                        androidx.compose.material.Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, bottom = 20.dp),
                            text = loginAnnotatedString,
                            textAlign = TextAlign.Center,
                            fontSize = 22.sp,
                        )
                        androidx.compose.material.Text(
                            text = "Email Address",
                            style = MaterialTheme.typography.subtitle1.copy(color = Color.Red),
                            modifier = Modifier.padding(bottom = 10.dp, top = 10.dp)
                        )

                        CustomStyleTextField(
                            "Email Address",
                            R.drawable.ic_email,
                            KeyboardType.Email,
                            VisualTransformation.None
                        )

                        androidx.compose.material.Text(
                            text = "Password",
                            style = MaterialTheme.typography.subtitle1.copy(color = Color.Red),
                            modifier = Modifier.padding(bottom = 10.dp, top = 20.dp)
                        )
                        CustomStyleTextField(
                            "Password",
                            R.drawable.ic_password,
                            KeyboardType.Password,
                            PasswordVisualTransformation()
                        )

                        androidx.compose.material.Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp),
                            text = "Forgot Password",
                            textAlign = TextAlign.End,
                            style = MaterialTheme.typography.subtitle2.copy(color = Color.Red)
                        )
                        Button(
                            onClick = {  },
                            modifier = Modifier
                                .padding(top = 30.dp, bottom = 34.dp)
                                .align(Alignment.CenterHorizontally)
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            androidx.compose.material.Text(
                                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                                text = "Login",
                                color = Color.White,
                                style = MaterialTheme.typography.button
                            )
                        }

                        val signInText = "Don't have an account? Sign In"
                        val signInWord = "Sign In"
                        val signInAnnotatedString = buildAnnotatedString {
                            append(signInText)
                            addStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontFamily = FontFamily(Font(R.font.montserrat_semibold))
                                ),
                                start = 0,
                                end = signInText.length
                            )
                            addStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                                ),
                                start = signInText.indexOf(signInWord),
                                end = signInText.length
                            )
                        }

                        androidx.compose.material.Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = signInAnnotatedString,
                            style = TextStyle(
                                fontSize = 14.sp
                            ),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}



@Composable
fun CustomStyleTextField(
    placeHolder: String,
    leadingIconId: Int,
    keyboardType: KeyboardType,
    visualTransformation: VisualTransformation
) {
    val textState = remember { mutableStateOf(TextFieldValue()) }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        value = textState.value,
        onValueChange = { valueChanged ->
            textState.value = valueChanged
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        placeholder = { androidx.compose.material.Text(text = placeHolder) },
        leadingIcon = {
            Row(
                modifier = Modifier.wrapContentWidth(),
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Image(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .size(18.dp),
                        bitmap = ImageBitmap.imageResource(id = leadingIconId),  // material icon
                        colorFilter = ColorFilter.tint(Color.Red),
                        contentDescription = "custom_text_field"
                    )
                    Canvas(
                        modifier = Modifier.height(24.dp)
                    ) {
                        // Allows you to draw a line between two points (p1 & p2) on the canvas.
                        drawLine(
                            color = Color.LightGray,
                            start = Offset(0f, 0f),
                            end = Offset(0f, size.height),
                            strokeWidth = 2.0F
                        )
                    }
                }
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Red,
            unfocusedBorderColor = Color.Transparent,
            focusedLabelColor = Color.White,
            trailingIconColor = Color.White,
//            disabledTextColor = NaviBlue
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        visualTransformation = visualTransformation
    )

    /*OutlinedTextField(
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        value = textState.value,
        onValueChange = { valueChanged ->
            textState.value = valueChanged
        },
        placeholder = { Text(text = placeHolder) },
        leadingIcon = {
            Row(
                modifier = Modifier.wrapContentWidth(),
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Image(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .size(18.dp),
                        bitmap = ImageBitmap.imageResource(id = leadingIconId),  // material icon
                        colorFilter = ColorFilter.tint(colorPrimary),
                        contentDescription = "custom_text_field"
                    )
                    Canvas(
                        modifier = Modifier.height(24.dp)
                    ) {
                        // Allows you to draw a line between two points (p1 & p2) on the canvas.
                        drawLine(
                            color = Color.LightGray,
                            start = Offset(0f, 0f),
                            end = Offset(0f, size.height),
                            strokeWidth = 2.0F
                        )
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize(),
        activeColor = colorPrimary,
        inactiveColor = Color.Transparent,
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.White,
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        visualTransformation = visualTransformation
    )*/
    /* TextField(
         value = textState.value,
         onValueChange = { valueChanged ->
             textState.value = valueChanged
         },
         modifier = Modifier.fillMaxSize(),
         placeholder = Text(text = placeHolder, style = TextStyle(color = text_hint_color)),
         leadingIcon = Row(
             modifier = Modifier.fillMaxSize(),
             verticalAlignment = Alignment.CenterVertically,
             content = {
                 Image(
                     modifier = Modifier.padding(start = 10.dp, end = 10.dp).size(18.dp),
                     bitmap = imageResource(id = leadingIconId),  // material icon
                     colorFilter = ColorFilter.tint(colorPrimary),
                 )
                 Canvas(
                     modifier = Modifier.preferredHeight(24.dp)
                 ) {
                     // Allows you to draw a line between two points (p1 & p2) on the canvas.
                     drawLine(
                         color = Color.LightGray,
                         start = Offset(0f, 0f),
                         end = Offset(0f, size.height),
                         strokeWidth = 2.0F
                     )
                 }
             }
         ),
         activeColor = colorPrimary,
         inactiveColor = Color.Transparent,
         shape = RoundedCornerShape(10.dp),
         backgroundColor = Color.White,
         textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
         keyboardType = keyboardType,
         visualTransformation = visualTransformation
     )*/
}


@Composable
fun HeaderView() {
    Image(
        modifier = Modifier.fillMaxSize(),
        bitmap = ImageBitmap.imageResource(id = R.drawable.login_bg),
        contentScale = ContentScale.FillWidth,
        contentDescription = "header_view_login_bg"
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 40.dp)
    ) {
        Image(
            modifier = Modifier.wrapContentWidth(),
            bitmap = ImageBitmap.imageResource(id = R.drawable.flower_logo),
            contentDescription = "header_view_flower_logo"
        )
        androidx.compose.material.Text(
            text = "FloraGoGo",
            color = Color.White,
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                letterSpacing = 2.sp
            )
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginPreview() {
    LoginScreen(
        onRegister = {}
    )
}