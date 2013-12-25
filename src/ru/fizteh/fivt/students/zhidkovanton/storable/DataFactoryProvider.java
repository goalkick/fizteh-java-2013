package ru.fizteh.fivt.students.zhidkovanton.storable;

import ru.fizteh.fivt.storage.structured.TableProvider;
import ru.fizteh.fivt.storage.structured.TableProviderFactory;

import java.io.File;
import java.io.IOException;

public class DataFactoryProvider implements TableProviderFactory {

    @Override
    public TableProvider create(String dir) {
        try {
            if ((dir == null) || dir.trim().equals("")) {
                throw new IllegalArgumentException("Bad base directory");
            }
            File directoryFile = new File(dir);
            if (!directoryFile.exists()) {
                if (!directoryFile.mkdir()) {
                    throw new IOException("Can't create" + dir);
                }
            }
            if (!directoryFile.isDirectory()) {
                throw new IOException("Hmm... It isn't a directory" + dir);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return new DataFactory(dir);
    }
}
