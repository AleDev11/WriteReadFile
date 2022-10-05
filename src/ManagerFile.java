import java.io.File;
import java.io.IOException;


public class ManagerFile {

    public void checkFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    public static void checkFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean checkText(String data) {
        boolean isString = true;
        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i))) {
                isString = false;
            }
        }
        return isString;
    }

    public static boolean checkNumber(String data) {
        boolean isNumber = true;
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                isNumber = false;
            }
        }
        return isNumber;
    }
}
