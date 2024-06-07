package eu.tutorials.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorials.unitconverter.ui.theme.UnitConverterTheme
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import kotlin.math.roundToInt
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitConverter() {

    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Meters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val iConversionFactor = remember { mutableStateOf (1.00)}
    val oConversionFactor = remember { mutableStateOf (1.00)}

    val customTextStyle = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 32.sp,
        color = Color.Red
    )


    fun convertUnits() {
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val result = (inputValueDouble * iConversionFactor.value * 100.0 / oConversionFactor.value).roundToInt() / 100.0
        outputValue = result.toString()
    }


    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        /*Text("Unit Converter", modifier = Modifier.padding(20.dp), style = MaterialTheme.typography.headlineLarge)*/
        Text("Unit Converter", modifier = Modifier.padding(20.dp), style = customTextStyle)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
        },
            label = { Text(text = "Enter")}
        )
        Row {
            val context = LocalContext.current
            // Input box
            Box {
                // Input button
                Button(onClick = { iExpanded = true }) {
                    Text(text = inputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                    DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false}) {
                        DropdownMenuItem(
                            text = { Text(text = "Centimeter") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Centimeter"
                                iConversionFactor.value = 0.01
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Meter") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Meter"
                                iConversionFactor.value = 1.0
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Feet") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Feet"
                                iConversionFactor.value = 0.3048
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Millimeters") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Millimeters"
                                iConversionFactor.value = 0.001
                                convertUnits()
                            })
                    }
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                // Output button
                Button(onClick = { oExpanded = true }) {
                    Text(text = outputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                    DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                        DropdownMenuItem(
                            text = { Text(text = "Centimeter") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Centimeter"
                                oConversionFactor.value = 0.01
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Meter") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Meter"
                                oConversionFactor.value = 1.00
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Feet") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Feet"
                                oConversionFactor.value = 0.3048
                                convertUnits()
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Millimeters") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Millimeters"
                                oConversionFactor.value = 0.001
                                convertUnits()
                            })
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        /*Text("Result: ${outputValue} Meters", modifier = Modifier.padding(20.dp))*/

        Text("Result: ${outputValue} Meters", style = MaterialTheme.typography.headlineMedium)
    }
}
@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}