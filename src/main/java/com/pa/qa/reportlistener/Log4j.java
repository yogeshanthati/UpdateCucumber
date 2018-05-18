package com.pa.qa.reportlistener;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import com.pa.qa.util.Constants;

public class Log4j extends Constants{
	public static void createLog() throws Exception {
		
		String propsFileName = "./src/main/resources/log4j.properties";
		Properties props = new Properties();
		java.io.FileInputStream configStream = new java.io.FileInputStream(propsFileName);
		props.load(configStream);
		String TestResult_Path_temp=  getTheCurrentDate();
		TestResult_Path=TestResult_Path_temp;
		String myStr = "./TestResults/"+ TestResult_Path  + "/LogReport/LogFile.log";
		System.out.println(TestResult_Path);
		props.setProperty("log4j.appender.FA.File", myStr);
		java.io.FileOutputStream output = new java.io.FileOutputStream(propsFileName);
		props.store(output, "Output Directory updated : ");
		System.out.println("output directory created");
		output.close();
		configStream.close();

	}
	
	public static String getTheCurrentDate(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String time = dateFormat.format(date);
		return time;
	}
	

}
