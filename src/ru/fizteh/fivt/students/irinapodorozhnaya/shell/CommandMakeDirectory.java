package ru.fizteh.fivt.students.irinapodorozhnaya.shell;

import java.io.File;
import java.io.IOException;

public class CommandMakeDirectory extends AbstractCommand {
	public CommandMakeDirectory(StateShell st) {
		super(1, st);
	}
	
	public void execute(String[] args) throws IOException {
		File f = getFileByName(args[1]);
		if (!f.exists()) {
			f.mkdir();	
		} else {
			throw new IOException("mkdir: '" + args[1] +"' already exist");
		}
	}
	
	public String getName() {
		return "mkdir";
	}
}