package com.sangharsha.dosterminal.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sangharsha.dosterminal.interfaces.DosCommand;

import utils.CommonConstants;

public class CDCommand extends DosCommand{

    @Override
    public String execute(String[] params, String path) {
    	if(params.length > 1 && params.length < 3){
    		if(params[1].equals("..")){
    			List<String> myList = new ArrayList<String>(Arrays.asList(path.split(CommonConstants.REGEX_SEPERATOR)));
    			
    			if(new File(path).toPath().getNameCount() != 1) {
    				myList.remove(myList.size() - 2);
	    			String listString = "";
	
	    			for (String s : myList)
	    			{
	    				if(s.equals(myList.get(myList.size() -1))){
	    					listString += s;
	    				}else {
	    					listString += s + CommonConstants.SEPERATOR;
	    				}
	    			    
	    			}
	    			path = listString;
    			}
    		}else {
	    		String temp_path;
	    		temp_path = path.replace(".", "");
		    	temp_path = temp_path + params[1] + CommonConstants.SEPERATOR +".";
		    	File f = new File(temp_path);
		    	if(f.exists() && f.isDirectory()) { 
		    		path = path.replace(".", "");
		    	    path = temp_path;
		    	}else {
		    		System.out.println("File Not Found");
		    	}
    		}
    	}else {
    		System.out.println("The system cannot find the path specified.");
    	}
    	return path;
    }
    
}
