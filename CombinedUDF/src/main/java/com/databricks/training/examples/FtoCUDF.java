package com.databricks.training.examples;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.*;
// Description of the UDF
@Description(
             name="FtoCUDF",
             value="Converts a given fahrenheit value to celcius.",
    extended="select ExampleUDF(deviceplatform) from hivesampletable limit 10;"
             )
    public class FtoCUDF extends UDF {
        // Accept a string input
    public Float evaluate(String unit, Float temp) {
    // If the value is null, return a null
    if (unit == null || temp == null)
        return null;
    if (unit == "F") {
        return (temp - 32) * (5.0f/9.0f);
    } else {
        return temp;
    }
    }
    }
