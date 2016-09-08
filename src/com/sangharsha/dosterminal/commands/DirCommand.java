package com.sangharsha.dosterminal.commands;

import java.io.File;

import com.sangharsha.dosterminal.interfaces.DosCommand;

public class DirCommand extends DosCommand {

	@Override
	public String execute(String[] params, String path) {
		if (params.length == 1) {
			File f = null;
			String[] paths;

			try {
				// create new file
				f = new File(path);

				// array of files and directory
				paths = f.list();

				// for each name in the path array
				for (String path1 : paths) {
					// prints filename and directory name
					System.out.println(path1);
				}
			} catch (Exception e) {
				// if any error occurs
				e.printStackTrace();
				System.out.println("Some thing is wrong");
			}
		} else {
			System.out.println("File Not Found.");
		}
		return path;
	}
}
