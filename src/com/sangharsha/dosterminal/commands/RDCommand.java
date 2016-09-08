package com.sangharsha.dosterminal.commands;

import java.io.File;

import com.sangharsha.dosterminal.interfaces.DosCommand;

public class RDCommand extends DosCommand {

	@Override
	public String execute(String[] params, String path) {
		if (params.length > 1 && params.length < 3) {
			File file = new File(params[1]);
			file.delete();
		} else {
			System.out.println("The syntax of the command is incorrect");

		}
		return path;
	}
}
