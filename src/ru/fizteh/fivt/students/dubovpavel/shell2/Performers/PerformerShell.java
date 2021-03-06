package ru.fizteh.fivt.students.dubovpavel.shell2.Performers;

import ru.fizteh.fivt.students.dubovpavel.executor.Performer;
import ru.fizteh.fivt.students.dubovpavel.executor.Dispatcher;

import java.io.File;
import java.io.IOException;

public abstract class PerformerShell extends Performer<Dispatcher> {
    protected File getCanonicalFile(String path) {
        try {
            return new File(path).getCanonicalFile();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage()); // This is very unlikely situation as far as I understand
        }
    }
}
