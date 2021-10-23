package lwparser.parser;

import java.io.IOException;

public abstract class Writer {
    public abstract void write(byte b) throws IOException;
}
