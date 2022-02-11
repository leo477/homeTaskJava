package com.itea.dimka.lection16;

import java.io.*;

public class DemoReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br=new BufferedReader(new FileReader("data" +
                    File.separator+"res.txt"));
            String tmp="";
            while ((tmp= br.readLine())!=null){
                String [] s =tmp.split("\\s");
                for(String res:s){
                    System.out.println(res);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e)  {
            e.printStackTrace();
        } finally {
            if(br!=null){
                try{
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
