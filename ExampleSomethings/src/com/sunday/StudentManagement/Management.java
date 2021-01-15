package com.sunday.StudentManagement;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class Management {
    private static Student student;
    private static HashMap<String,Student> indexProp;
    private static Set<String> keyId;
    private static ArrayList<String> indexId;

    public static void loadFile(){
        try {
            File studentInfo = new File("D:\\JavaSE\\ExampleSomethings\\src\\com\\sunday\\StudentManagement\\studentInfo.properties");
            if (!studentInfo.exists()){
                studentInfo.createNewFile();
            }
            Properties prop = new Properties();
            prop.load(new FileInputStream(studentInfo));
            keyId=prop.stringPropertyNames();
            indexId.addAll(keyId);
            for (int i = 0; i < indexId.size(); i++) {
                indexProp.put(indexId.get(1),student);
            }
//            indexProp.put(index)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){

    }

    public static void enterStudentInfo(){

    }

}
