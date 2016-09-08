package com.sangharsha.dosterminal.commands;

import java.io.File;

import com.sangharsha.dosterminal.interfaces.DosCommand;

public class CDCommand extends DosCommand{

    @Override
    public String execute(String[] params, String path) {
    	if(params.length < 3){
    		String temp_path;
    		temp_path = path.replace(".", "");
	    	temp_path = temp_path + params[1] + "/.";
	    	File f = new File(path);
	    	if(f.exists() && f.isDirectory()) { 
	    		path = path.replace(".", "");
	    	    path = temp_path;
	    	}else {
	    		System.out.println("File Not Found");
	    	}_
	    	
    	}else {
    		System.out.println("The system cannot find the path specified.");
    	}
    	return path;
    }
    
}
