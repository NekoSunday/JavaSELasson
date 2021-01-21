package com.sunday.Jsoup;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class test {
    @Test
    public void fosTest() throws Exception {
        File file = new File("d:/aaa/test.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        byte[] bytes = {20,30,40,50,60,70,80,90,100};
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    @Test
    public void fisTest()throws Exception{
        File file = new File("d:/aaa/test.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len;
        if ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }

    @Test
    public void brbwTest()throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("d:/aaa/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/aaa/a.txt",true));
        String readLine =null;
        while ((readLine=br.readLine())!=null){
            System.out.println(readLine);
        }

        bw.newLine();
        bw.write("你猜猜我猜猜");
        bw.flush();
        br.close();
        bw.close();
    }

    @Test
    public void isrTest()throws Exception{
        //charsetName是规范ISR编码输入
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/aaa/a.txt"),"UTF-8");
        int len;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();
    }

    @Test
    public void oswTest()throws Exception{
        //charsetName是规范OSW编码输出
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/aaa/a.txt"),"UTF-8");
        osw.write("您好");
        osw.close();
    }

    //Error
    @Test
    public void setTest()throws Exception{
        Student s1 = new Student("lucy", 20);
        Student s2 = new Student("amy", 19);
        Student s3 = new Student("jame", 23);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

//        serializ(list);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/aaa/serial.txt"));
        ArrayList<Student> arrayList= (ArrayList<Student>) ois.readObject();
        for (int i = 0; i < arrayList.size(); i++) {
            Student index=arrayList.get(i);
            System.out.println(index.getName()+"--"+index.getAge());
        }
        ois.close();
    }

    private static void serializ(ArrayList<Student> arrayList)throws Exception{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/aaa/serial.txt"));
        oos.writeObject(arrayList);
        oos.close();
    }

    @Test
    public void PrintTest() throws FileNotFoundException {
        System.out.println(97);
        PrintStream ps = new PrintStream("d:/aaa/b.txt");
        System.setOut(ps);
        System.out.println(97);
    }
}
