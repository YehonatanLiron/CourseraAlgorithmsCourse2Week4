package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private static BufferedReader reader;

    public Reader(String file_name) {
        try {
            reader = new BufferedReader(new FileReader(file_name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readLine() {
        String line;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            line = null;
        }
        return line;
    }

    public static long readLineAsInteger() {
        return Long.parseLong(readLine());
    }
}
