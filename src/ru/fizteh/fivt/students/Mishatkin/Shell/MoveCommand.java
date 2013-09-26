package ru.fizteh.fivt.students.mishatkin.shell;

/**
 * MoveCommand.java
 * Created by Vladimir Mishatkin on 9/25/13
 */
public class MoveCommand extends Command {
	MoveCommand(ShellReceiver _receiver) {
		super(_receiver);
		type = COMMAND_TYPE.MV;
	}

	@Override
	public void execute() throws Exception {
		receiver.moveCommand(args[0], args[1]);
	}
}
