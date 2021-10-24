package lwparser.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public abstract class DataObject {
    private final Reader requester;
    private Writer writer;

    protected class PegAdress {
        public final boolean isInput;
        public final long componentAdress;
        public final int pegIndex;

        public PegAdress() {
            isInput = getNextBool();
            componentAdress = getNextUnsignedInt();
            pegIndex = getNextInt();
        }
    }

    public DataObject(Reader r) {
        this.requester = r;
    }

    public void setWriter(Writer w){
        this.writer = w;
    }


    public byte getNextByte() {
        return requester.nextByte();
    }

    public String getStringWithLength(int byteLength) {
        byte[] bytes = new byte[byteLength];
        for (int i = 0; i < byteLength; i++) {
            bytes[i] = requester.nextByte();
        }
        return new String(bytes);
    }

    public String getNextString() {
        int length = getNextInt();
        return getStringWithLength(length);
    }

    public int getNextInt() {
        return (getNextByte() & 255) + ((getNextByte() & 255) << 8) + ((getNextByte() & 255) << 16) + ((getNextByte() & 255) << 24);
    }

    public boolean getNextBool() {
        return getNextByte() == 1;
    }

    public String getNextVersion() {
        return getNextInt() + "." + getNextInt() + "." + getNextInt() + "." + getNextInt();
    }

    public int getNextUnsignedTwoByteInt() {
        byte a = getNextByte();
        byte b = getNextByte();
        return ((b & 0xff) << 8) | (a & 0xff);
    }

    public float getNextFloat() {
        return ByteBuffer.wrap(new byte[]{getNextByte(), getNextByte(), getNextByte(), getNextByte()}).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }

    public long getNextUnsignedInt() {
        return Integer.toUnsignedLong(getNextInt());
    }

    public PegAdress getNextPegAdress() {
        return new PegAdress();
    }


    //WRITING


    public void writeNextByte(byte b) {
        writer.writeNext(b);
    }

    public void writeNextStringWithLengthByte(String string) {
        byte[] array = string.getBytes(StandardCharsets.UTF_8);
        writeNextInt(array.length);
        for (int i = 0; i < array.length; i++) {
            writeNextByte(array[i]);
        }
    }

    public void writeNextStringWithoutLengthByte(String string) {
        byte[] array = string.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < array.length; i++) {
            writeNextByte(array[i]);
        }
    }

    public void writeNextInt(int i) {
        writeNextByte((byte) (i & 255));
        writeNextByte((byte) ((i >> 8) & 255));
        writeNextByte((byte) ((i >> 16) & 255));
        writeNextByte((byte) ((i >> 24) & 255));
    }

    public void writeNextBool(boolean b) {
        writeNextByte((byte) (b ? 1 : 0));
    }

    public void writeNextVersion(String version) {
        for (String s : version.split("\\.")) {
            writeNextInt(Integer.parseInt(s));
        }
    }

    public void writeNextUnsignedTwoByteInt(int num) {
        writeNextByte((byte) (num & 0xff));
        writeNextByte((byte) ((num >> 8) & 0xff));
    }

    public void writeNextFloat(float f) {

        /*byte[] array = ByteBuffer.allocate(4).putFloat(f).array();
        for (byte b : array) {
            writeNextByte(b);
        }*/
        byte[] byteArray = new byte[4];
        int intBits = Float.floatToIntBits(f);
        for (int i = 0; i < byteArray.length; i++) {
            writeNextByte((byte) intBits);
            intBits = intBits >> 8;
        }
    }

    public void writeNextUnsignedInt(long i) {
        writeNextInt((int) i);
    }

    public void writeNextPegAdress(PegAdress a) {
        writeNextBool(a.isInput);
        writeNextUnsignedInt(a.componentAdress);
        writeNextInt(a.pegIndex);
    }
    public abstract void write();


}
