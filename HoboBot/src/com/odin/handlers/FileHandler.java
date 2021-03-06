/**
 * 
 */
package com.odin.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

/**
 * @author Brian
 *
 */
public class FileHandler {
	
	public ArrayList<File> files = new ArrayList<File>();
	
	
	public ArrayList<File> getDirectoryFiles(String dir)
	{
		return files;
	}
	
	@SuppressWarnings("deprecation")
	public boolean writeToTriggerFile(String url, String directory)
	{
	
		
		try {
			String filename= "triggers.txt";
			final String newLine = System.getProperty("line.separator");
			File file = new File(filename);
			FileUtils.writeStringToFile(file, url, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public boolean writeToMentorFile(String name, String level, String job, String ilvl)
	{
		try {
			String filename= "mentors.txt";
			final String newLine = System.getProperty("line.separator");
			File file = new File(filename);
			FileUtils.writeStringToFile(file,"Name: " + name + " Job: " + job + " Level: " + level + " iLvl: " + ilvl + newLine, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
