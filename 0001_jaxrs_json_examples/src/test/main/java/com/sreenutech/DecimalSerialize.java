package com.sreenutech;

import java.io.IOException;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DecimalSerialize extends JsonSerializer<Double> {

	@Override
	public void serialize(Double d, JsonGenerator jsongen, SerializerProvider sp) throws IOException {

     DecimalFormat dformate = new DecimalFormat("#0.0000");
     jsongen.writeString(dformate.format(d));
		
	}

	
	
	

}
