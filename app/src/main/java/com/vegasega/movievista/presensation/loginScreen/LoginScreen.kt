package com.vegasega.movievista.presensation.loginScreen

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.focus.focusOrder
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.vegasega.movievista.R
import com.vegasega.movievista.theme.MovieVistaTheme
import com.vegasega.movievista.theme.Shapes
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



//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
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
//                        }) {
//                    HeaderView()
//                }
//
//                Box(
////                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
////                    backgroundColor = Color.White,
//
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(top = 100.dp)
//                        .clip(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
//                        .constrainAs(loginForm) {
//                            bottom.linkTo(parent.bottom)
//                            start.linkTo(parent.start)
//                            end.linkTo(parent.end)
//                        },
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(30.dp)
//                    ) {
////
////                        val loginText = "Log in to your account."
////                        val loginWord = "Log in"
////                        val loginAnnotatedString = buildAnnotatedString {
////                            append(loginText)
////                            addStyle(
////                                style = SpanStyle(
////                                    color = Color.Red,
////                                    fontFamily = FontFamily(Font(R.font.montserrat_semibold))
////                                ),
////                                start = 0,
////                                end = loginText.length
////                            )
////                            addStyle(
////                                style = SpanStyle(
////                                    color = Color.Red,
////                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
////                                ),
////                                start = 0,
////                                end = loginWord.length
////                            )
////                        }
////
////                        androidx.compose.material.Text(
////                            modifier = Modifier
////                                .fillMaxWidth()
////                                .padding(top = 10.dp, bottom = 20.dp),
////                            text = loginAnnotatedString,
////                            textAlign = TextAlign.Center,
////                            fontSize = 22.sp,
////                        )
////                        androidx.compose.material.Text(
////                            text = "Email Address",
////                            style = MaterialTheme.typography.subtitle1.copy(color = Color.Red),
////                            modifier = Modifier.padding(bottom = 10.dp, top = 10.dp)
////                        )
////
////                        CustomStyleTextField(
////                            "Email Address",
////                            R.drawable.ic_email,
////                            KeyboardType.Email,
////                            VisualTransformation.None
////                        )
////
////                        androidx.compose.material.Text(
////                            text = "Password",
////                            style = MaterialTheme.typography.subtitle1.copy(color = Color.Red),
////                            modifier = Modifier.padding(bottom = 10.dp, top = 20.dp)
////                        )
////                        CustomStyleTextField(
////                            "Password",
////                            R.drawable.ic_password,
////                            KeyboardType.Password,
////                            PasswordVisualTransformation()
////                        )
////
////                        androidx.compose.material.Text(
////                            modifier = Modifier
////                                .fillMaxWidth()
////                                .padding(top = 10.dp),
////                            text = "Forgot Password",
////                            textAlign = TextAlign.End,
////                            style = MaterialTheme.typography.subtitle2.copy(color = Color.Red)
////                        )
////                        Button(
////                            onClick = {  },
////                            modifier = Modifier
////                                .padding(top = 30.dp, bottom = 34.dp)
////                                .align(Alignment.CenterHorizontally)
////                                .fillMaxWidth(),
////                            shape = RoundedCornerShape(16.dp)
////                        ) {
////                            androidx.compose.material.Text(
////                                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
////                                text = "Login",
////                                color = Color.White,
////                                style = MaterialTheme.typography.button
////                            )
////                        }
////
////                        val signInText = "Don't have an account? Sign In"
////                        val signInWord = "Sign In"
////                        val signInAnnotatedString = buildAnnotatedString {
////                            append(signInText)
////                            addStyle(
////                                style = SpanStyle(
////                                    color = Color.Red,
////                                    fontFamily = FontFamily(Font(R.font.montserrat_semibold))
////                                ),
////                                start = 0,
////                                end = signInText.length
////                            )
////                            addStyle(
////                                style = SpanStyle(
////                                    color = Color.Red,
////                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
////                                ),
////                                start = signInText.indexOf(signInWord),
////                                end = signInText.length
////                            )
////                        }
////
////                        androidx.compose.material.Text(
////                            modifier = Modifier.fillMaxWidth(),
////                            text = signInAnnotatedString,
////                            style = TextStyle(
////                                fontSize = 14.sp
////                            ),
////                            textAlign = TextAlign.Center
////                        )
//                    }
//                }
//            }
//        }
//    }




    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background

    ){

    Login2()
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






@Composable
fun Login(
) {
    val context = LocalContext.current
    val passwordFocusRequester = FocusRequester()
    val focusManager = LocalFocusManager.current
//    val exoPlayer = remember { context.buildExoPlayer(videoUri) }



    ProvideWindowInsets {

        Box(
            Modifier
                .navigationBarsWithImePadding()
                .fillMaxSize()
                .paint(
                    // Replace with your image id
                    painterResource(id = R.drawable.splash_bg),
                    contentScale = ContentScale.FillBounds
                ),


//            verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
//            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                Modifier
                    .navigationBarsWithImePadding()
                    .padding(24.dp)
                    .fillMaxSize(),
//                .paint(
//                    // Replace with your image id
//                    painterResource(id = R.drawable.splash_bg),
//                    contentScale = ContentScale.FillBounds
//                ),
                verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.flower_logo),
                    null,
                    Modifier.size(80.dp),
                    tint = Color.Black
                )
                TextInput(InputType.Name, keyboardActions = KeyboardActions(onNext = {
                    passwordFocusRequester.requestFocus()
                }))
                TextInput(InputType.Password, keyboardActions = KeyboardActions(onDone = {
                    focusManager.clearFocus()
                    context.doLogin()
                }), focusRequester = passwordFocusRequester)
                Button(onClick = {
                    context.doLogin()
                }, modifier = Modifier.fillMaxWidth()) {
                    Text("SIGN IN", Modifier.padding(vertical = 8.dp))
                }
                Divider(
                    color = Color.White.copy(alpha = 0.3f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = 48.dp)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Don't have an account?", color = Color.Black)
                    TextButton(onClick = {}) {
                        Text("SING UP")
                    }
                }
            }
        }



    }
}


private fun Context.doLogin() {
    Toast.makeText(
        this,
        "Something went wrong, try again later!",
        Toast.LENGTH_SHORT
    ).show()
}

sealed class InputType(
    val label: String,
    val icon: ImageVector,
    val keyboardOptions: KeyboardOptions,
    val visualTransformation: VisualTransformation
) {
    object Name : InputType(
        label = "Username",
        icon = Icons.Default.Person,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        visualTransformation = VisualTransformation.None
    )

    object Password : InputType(
        label = "Password",
        icon = Icons.Default.Lock,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = PasswordVisualTransformation()
    )
}

@Composable
fun TextInput(
    inputType: InputType,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions
) {

    var value by remember { mutableStateOf("") }

    TextField(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier
            .fillMaxWidth()
            .focusOrder(focusRequester ?: FocusRequester()),
        leadingIcon = { Icon(imageVector = inputType.icon, null) },
        label = { Text(text = inputType.label) },
        shape = Shapes.small,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        keyboardOptions = inputType.keyboardOptions,
        visualTransformation = inputType.visualTransformation,
        keyboardActions = keyboardActions
    )
}










@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Login2(
) {
    Scaffold(
        bottomBar = {},
        topBar = {}
    ){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){

        Image(painter = painterResource(id = R.drawable.splash_bg),
            contentDescription = "splash_bg",
            modifier = Modifier
                .fillMaxSize()
                .blur(6.dp),
            contentScale = ContentScale.FillBounds
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
//                .padding(16.dp)
                .alpha(0.6f)
                .clip(
                    CutCornerShape(
                        topStart = 8.dp,
                        topEnd = 16.dp,
                        bottomStart = 16.dp,
                        bottomEnd = 8.dp
                    )
                )
                .background(MaterialTheme.colors.background),

            ){

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(28.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                LoginHeader()


//                Spacer(modifier = Modifier.height(120.dp))

                LoginField(
                    username, password,
                    onUsernameChange = { username = it },
                    onPasswordChange = { password = it },
                    onForgotPasswordClick = {

                    }
                )


                LoginFooter(
                    onSignInClick = {},
                    onSignUpClick = {}
                )
            }
        }


    }
    }

}



@Composable
fun LoginHeader(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Welcome back",
            fontSize = 36.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            text = "Sign in to continue",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }

}

@Composable
fun LoginField(username : String, password : String,
               onUsernameChange : (String) -> Unit, onPasswordChange : (String) -> Unit,
               onForgotPasswordClick : () -> Unit){

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        DemoField(
            value = username,
            label = "Email",
            placeHolder = "Enter Email",
            onValueChange = onUsernameChange,
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, "Email")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next)
        )

        Spacer(modifier = Modifier.height(8.dp))

        DemoField(
            value = password,
            label = "Password",
            placeHolder = "Enter Password",
            onValueChange = onPasswordChange,
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, "null")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done)
        )


        TextButton(onClick = onForgotPasswordClick, modifier = Modifier.align(Alignment.End)) {
            Text(text = "Forgot Password?")
        }
    }

}

@Composable
fun LoginFooter(
    onSignInClick : () -> Unit,
    onSignUpClick : () -> Unit,
    ){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = onSignInClick, modifier = Modifier.fillMaxWidth().height(50.dp)){
            Text(text = "Sign in", color = Color.White)
        }

        TextButton(onClick = onSignUpClick, modifier = Modifier.fillMaxWidth()){
            Text(text = "Don't have an account, click here")
        }
    }

}


@Composable
fun DemoField(
    value : String,
    label : String,
    placeHolder: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    leadingIcon: @Composable (() -> Unit) ?= null,
    trailingIcon: @Composable (() -> Unit) ?= null,
    onValueChange : (String) -> Unit
    ){

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        placeholder = { Text(text = placeHolder) },
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        modifier = Modifier
            .fillMaxWidth()
    )
}



//@Preview(name = "NEXUS_7", device = Devices.NEXUS_7)
//@Preview(name = "NEXUS_7_2013", device = Devices.NEXUS_7_2013)
//@Preview(name = "NEXUS_5", device = Devices.NEXUS_5)
@Preview(name = "NEXUS_6", device = Devices.NEXUS_6)
////@Preview(name = "NEXUS_9", device = Devices.NEXUS_9)
////@Preview(name = "NEXUS_10", device = Devices.NEXUS_10)
//@Preview(name = "NEXUS_5X", device = Devices.NEXUS_5X)
//@Preview(name = "NEXUS_6P", device = Devices.NEXUS_6P)
////@Preview(name = "PIXEL_C", device = Devices.PIXEL_C)
//@Preview(name = "PIXEL", device = Devices.PIXEL)
//@Preview(name = "PIXEL_XL", device = Devices.PIXEL_XL)
//@Preview(name = "PIXEL_2", device = Devices.PIXEL_2)
//@Preview(name = "PIXEL_2_XL", device = Devices.PIXEL_2_XL)
//@Preview(name = "PIXEL_3", device = Devices.PIXEL_3)
//@Preview(name = "PIXEL_3_XL", device = Devices.PIXEL_3_XL)
//@Preview(name = "PIXEL_3A", device = Devices.PIXEL_3A)
//@Preview(name = "PIXEL_3A_XL", device = Devices.PIXEL_3A_XL)
//@Preview(name = "PIXEL_4", device = Devices.PIXEL_4)
//@Preview(name = "PIXEL_4_XL", device = Devices.PIXEL_4_XL)
//@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginPreview() {
//    LoginScreen(
//        onRegister = {}
//    )

    Login2()
}