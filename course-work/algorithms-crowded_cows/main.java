package com.company;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.company.cow;

// 1. Provide a command line driver for class 'cow'
// 2. Read cows.txt and run the data. Answer: 503713.

public class main {
    public static void main(String[] args) {

        // read input files. cows.txt is more than 50,000 lines!
        int[] cowgroup = new int[50010];
        String filename = args[0];

        long start = System.currentTimeMillis();

        try {
            System.out.println(System.in);
            FileReader fr = new FileReader(filename);
            BufferedReader buf = new BufferedReader(fr);

            // this script is written within IntelliJ IDEA
            // if we don't want to use command line:
            // FileReader fr1 = new FileReader("/Users/honka/crowded_cows/src/com/company/cows.txt")
            // BufferedReader buf1 = new BufferedReader(fr)

            int i =0;
            String readLine = "";
            while((readLine = buf.readLine()) != null){
                cowgroup[i] = Integer.parseInt(readLine);
                i++;
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }

        int biggestcow = com.company.cow.crowded_cows(cowgroup, 25000);
        System.out.println(biggestcow);
        System.out.println("runtime：" + (System.currentTimeMillis()-start)+"ms");  // about 50ms
    }
}
