

public class Main {

    public static void main(String[] args) {
        final String FILE_PATH = "C:\\Coursera\\Algorithms2\\Week4\\src\\2sum.txt";
        long input;

        Utils.Reader data = new Utils.Reader(FILE_PATH);

        input = data.readLineAsInteger();
        System.out.println(input);
        input = data.readLineAsInteger();
        System.out.println(input);
    }
}
