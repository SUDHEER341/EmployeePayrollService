package com.payrollservice;
import java.io.IOException;
import java.io.File;
public class FileOperations {

    public void createDirectory() throws IOException
    {
        File file = new File("C:\\Users\\sudheer\\Desktop");
        file.mkdir();
        System.out.println(file.exists());
    }
    public void createFile() throws IOException
    {
        File file = new File("C:\\Users\\sudheer\\Desktop");
        file.createNewFile();
        System.out.println(file.exists());
    }
    public void checkFileIfExist() {
        File file = new File("C:\\Users\\sudheer\\Desktop");
        String[] FilesList = file.list();
        for (String s : FilesList) {
            System.out.println(s);
        }
    }
    public void create_N_Files() throws IOException
    {
        for (int start = 10; start < 30; start++) {
            File file = new File("C:\\Users\\sudheer\\Desktop" + start + ".pdf");
            file.createNewFile();
        }
    }
    public static void main(String[] args) throws IOException
    {
        FileOperations fileOperatonsObj = new FileOperations();
        fileOperatonsObj.createDirectory();
        fileOperatonsObj.createFile();
        fileOperatonsObj.create_N_Files();
        fileOperatonsObj.checkFileIfExist();
    }
}
