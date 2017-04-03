package com.mycompany.CodeChallenge;

import junit.framework.Test;
import java.io.PrintStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.Message.Builder;
import com.google.protobuf.util.JsonFormat;
import com.mycompany.CodeChallenge.GeoJSONExample.FeatureCollection;

/**
 * Hello world!
 *
 */
public class AppTest
{
	public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String s;
        while((s = in.readLine()) != null) 
        	sb.append(s);
        in.close();
        return sb.toString();
	}
	
    public static void main( String[] args ) throws IOException
    {
        String filename = "src/test/resource/geo.json";
        String jsonFormat = read(filename);
        System.out.println(jsonFormat);
        try {
        	FeatureCollection fc = ProtobufSerialization.parse(jsonFormat);
        	System.out.println(fc.toString());
        	String json = ProtobufSerialization.print(fc);
        	System.out.println(json);
        
        } catch (InvalidProtocolBufferException ex) {
        	ex.printStackTrace();
        }
        

    }
}
