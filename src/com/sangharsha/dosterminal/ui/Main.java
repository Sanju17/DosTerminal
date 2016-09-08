package com.sangharsha.dosterminal.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sangharsha.dosterminal.interfaces.DosCommand;
import com.sangharsha.dosterminal.interfaces.DosCommandFactory;

public class Main {

	public static void main(String[] args) {
		String fileName = "C:/Users/home/desktop/java/sample.txt";

		try {
			File pwd = new File(".");
			String path = pwd.getAbsolutePath();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			System.out.print(path + ">");
			while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {

				String tokens[] = line.split(" ");
				DosCommand cmd = DosCommandFactory.get(tokens[0]);
				if (cmd != null) {
					path = cmd.execute(tokens, path);
				} else {
					System.out.println("" + tokens[0] + "is not recognized as internal or external command");
				}

				System.out.print(path + ">");
			}
			reader.close();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}
