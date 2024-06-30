package kata;

public class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    public AsciiCharSequence(byte[] bts) {
        this.bytes = bts;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] sb = new byte[end - start];
        for (int i = 0, j = start; i < sb.length; i++, j++) {
            sb[i] = bytes[j];
        }
        return new AsciiCharSequence(sb);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}
