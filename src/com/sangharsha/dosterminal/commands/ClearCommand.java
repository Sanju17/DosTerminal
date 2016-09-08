package com.sangharsha.dosterminal.commands;

import java.io.IOException;

import com.sangharsha.dosterminal.interfaces.DosCommand;

public class ClearCommand extends DosCommand{

	@Override
	public String execute(String[] params, String path) {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

}
