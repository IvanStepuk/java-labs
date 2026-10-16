package org.example;
import java.io.File;

public class FileInspector {
    public static void printFileInfo(File fileobj) {
        System.out.println("Name of file: " + fileobj.getName());
        System.out.println("Size of file: " + fileobj.length() + " Bytes");
        System.out.println("Last modified: " + fileobj.lastModified());
        System.out.println("Parent: " + fileobj.getParent());
        System.out.println("Path: " + fileobj.getPath());
        System.out.println("Abs Path: " + fileobj.getAbsolutePath());
        System.out.println("File " + (fileobj.exists() ? "exists" : "not exist"));
        System.out.println(fileobj.canRead() ? "can read" : "can't read");
        System.out.println(fileobj.canWrite() ? "can write" : "can't write");
        System.out.println("This is " + (fileobj.isDirectory() ? "" : "not ") + "directory");
        System.out.println("This is " + (fileobj.isAbsolute() ? "absolute" : "not absolute") +
                (fileobj.isFile() ? " normal file" : " a named pipe"));
    }
}
