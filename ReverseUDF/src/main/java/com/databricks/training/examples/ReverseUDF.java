package com.databricks.training.examples;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.*;

// Description of the UDF
@Description(
             name="ExampleUDF",
             value="returns a lower case version of the input string.",
    extended="select ExampleUDF(deviceplatform) from hivesampletable limit 10;"
             )
    public class ReverseUDF extends UDF {
        // Accept a string input
        public String evaluate(String input) {
            // If the value is null, return a null
            if(input == null)
                return null;

	    String output = "";
 
	    for (int i = input.length() - 1; i >= 0; i--) {
		output = output + input.charAt(i);
	    }
 
	    return output;


        }
    }