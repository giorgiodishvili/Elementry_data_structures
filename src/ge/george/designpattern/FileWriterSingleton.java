package ge.george.designpattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;
    private FileOutputStream fos;

    private FileWriterSingleton() {
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


    public static FileWriterSingleton getInstance() {
        if (instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

}
