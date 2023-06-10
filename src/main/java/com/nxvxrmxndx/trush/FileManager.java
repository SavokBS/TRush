package com.nxvxrmxndx.trush;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {
	
	public static String readFile(String filename) {
		try {
			List<String> list = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
			StringBuilder builder = new StringBuilder();
			for (String s: list) builder.append(s + "\n");
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
