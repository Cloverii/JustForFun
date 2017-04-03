package com.mycompany.CodeChallenge;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.mycompany.CodeChallenge.GeoJSONExample.FeatureCollection;

/**
 * Hello world!
 *
 */
public class ProtobufSerialization 
{
	public static FeatureCollection parse(String json) throws InvalidProtocolBufferException {
        JsonFormat.Parser parser = JsonFormat.parser();
        FeatureCollection.Builder builder = FeatureCollection.newBuilder();
        parser.merge(json, builder);
        return builder.build();
	}
	
	public static String print(FeatureCollection fc) throws InvalidProtocolBufferException {
        JsonFormat.Printer printer = JsonFormat.printer();
        String json = printer.print(fc);
        return json;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
    }
}
