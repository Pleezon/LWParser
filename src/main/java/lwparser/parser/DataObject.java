package lwparser.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;

public abstract class DataObject {
    private Requester requester;

    protected class PegAdress{
        public final boolean isInput;
        public final long componentAdress;
        public final int pegIndex;
        public PegAdress(){
            isInput = getNextBool();
            componentAdress = getNextUnsignedInt();
            pegIndex = getNextInt();
        }

    }
    public DataObject(Requester r) {
        this.requester = r;
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
        return (getNextByte()&255)+((getNextByte()&255)<<8)+((getNextByte()&255)<<16)+((getNextByte()&255)<<24);
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
    public long getNextUnsignedInt(){
        return Integer.toUnsignedLong(getNextInt());
    }
    public PegAdress getNextPegAdress(){
        return new PegAdress();
    }

}
