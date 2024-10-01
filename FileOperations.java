import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) {
        // Dummy method to demonstrate opening a file
        openFile("path/to/your/file.txt");
    }

    public static void openFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!Desktop.isDesktopSupported()) {
                System.out.println("Desktop is not supported");
                return;
            }
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}