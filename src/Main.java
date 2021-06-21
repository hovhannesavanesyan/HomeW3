import java.io.File;

public class Main {
    private long size;


    public static void main(String[] args) {
        Main main = new Main();
        File f = new File("C:\\Users\\Hovo\\Documents");
        System.out.println(main.getFolderSize(f));
    }

    private Long getFolderSize(File f) {
        try {
            if (f.isDirectory()) {
                for (File x : f.listFiles()) {
                    size += getFolderSize(x);
                    System.out.println(size);
                }
            } else {
                size = f.length();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return size;
    }
}
