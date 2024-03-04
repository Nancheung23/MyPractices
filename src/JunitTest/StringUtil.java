package JunitTest;

public class StringUtil{
    public static void printNumber(String name) {
        System.out.println("length: " + name.length());
    }

    public static int getMaxIndex(String data) {
        if(data == null) {
            return -1;
        }
        return data.length();
    }
}