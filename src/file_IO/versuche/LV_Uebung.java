package file_IO.versuche;

import java.io.File;

public class LV_Uebung {

    public static void main(String[] args) {

        File file = new File("//Users//selinalagler//Desktop//Campus 02//Semester 2//Programmieren 2");

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println("f.getName() + \", Length: \" + f.length() = " + f.getName() + ", Length: " + f.length());
        }
        System.out.println("-----");
        System.out.println("printAndGetFileSize(f) = " + printAndGetFileSize(file));
    }

    public static long printAndGetFileSize(File f) {
        if (f.isFile()) {
            System.out.println(f.getName()+ ", " + f.length());
            return f.length(); // Abbruchbedingung
        } else {
            File[] files = f.listFiles();
            int totalLength = 0;
            for (File e : files) {
                System.out.println(e.getName()+ ", " + e.length());
                totalLength += printAndGetFileSize(e);
            }
            return totalLength;
        }
    }
}
