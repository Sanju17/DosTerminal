package com.sangharsha.dosterminal.commands;

import java.io.File;

import com.sangharsha.dosterminal.interfaces.DosCommand;

public class MDCommand extends DosCommand {

	@Override
	public String execute(String[] params, String path) {
		if (params.length > 1) {
			File file = new File(params[1]);
			file.mkdir();
		} else {
			System.out.println("The syntax of the command is incorrect");

		}
		return path;
	}
}
