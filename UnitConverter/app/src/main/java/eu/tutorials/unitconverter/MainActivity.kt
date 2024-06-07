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
    var inputUnit by remember { mutableStateOf("Centimeters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val conversionFactor = remember { mutableStateOf (0.01)}

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text("Unit Converter", modifier = Modifier.padding(20.dp))
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
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                    DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false}) {
                        DropdownMenuItem(
                            text = { Text(text = "Centimeter") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Centimeter"
                                conversionFactor.value = 0.01
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Meter") },
                            onClick = {
                                iExpanded = false
                                inputUnit = "Meter"
                                conversionFactor.value = 1.0
                            })
                        DropdownMenuItem(
                            text = { Text(text = "Feet") },
                            onClick = { /*TODO*/ })
                        DropdownMenuItem(
                            text = { Text(text = "Millimeters") },
                            onClick = { /*TODO*/ })
                    }
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                // Output button
                Button(onClick = { oExpanded = true }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                    DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                        DropdownMenuItem(
                            text = { Text(text = "Centimeter") },
                            onClick = { /*TODO*/ })
                        DropdownMenuItem(
                            text = { Text(text = "Meter") },
                            onClick = { /*TODO*/ })
                        DropdownMenuItem(
                            text = { Text(text = "Feet") },
                            onClick = { /*TODO*/ })
                        DropdownMenuItem(
                            text = { Text(text = "Millimeters") },
                            onClick = { /*TODO*/ })
                    }
                }
            }
        }
        /*Spacer(modifier = Modifier.height(16.dp))*/
        Text("Result:", modifier = Modifier.padding(20.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}