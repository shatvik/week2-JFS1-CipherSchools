import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Shatvik Pandey\\Desktop\\Downloads\\datasets");

        String[] files = f.list();

        for (String file : files) {
            System.out.println(file);
        }

        File[] files_arr = f.listFiles();

        for (File ff : files_arr) {
            ff.delete();
        }
    }
}
