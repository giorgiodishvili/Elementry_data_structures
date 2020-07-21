package ge.george.designpattern;

import java.io.FileOutputStream;
import java.io.IOException;

public enum SingletonEnum {
    INSTANCE;

    private FileOutputStream fos;

    SingletonEnum() {
        try {
            fos = new FileOutputStream("D:\\A.txt");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void write(byte[] b) {
        try {
            fos.write(b);
            fos.flush();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void close() {
        try {
            fos.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
