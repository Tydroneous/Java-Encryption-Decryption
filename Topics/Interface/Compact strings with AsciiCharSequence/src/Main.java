import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] sequence;

    public AsciiCharSequence(byte[] sequence) {
        this.sequence = new byte[sequence.length];
        System.arraycopy(sequence, 0, this.sequence, 0, sequence.length);
    }

    @Override
    public int length() {
        return this.sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] temp = new byte[end - start];
        int count = 0;
        for (int i = start; i < end; i++) {
            temp[count] = this.sequence[i];
            count++;
        }
        return new AsciiCharSequence(temp);

    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= this.sequence.length - 1; i++) {
            temp.append((char) this.sequence[i]);
        }

        return temp.toString();
    }
}