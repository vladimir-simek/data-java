package com.vladimirsimek.datajava;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Logic {

    public static String line = "hey";
    public static String[] lineArguments = null;
    public static String[] lineArgumentsParsed = {"gay", "lesbian", "bisexual"};
    public static ArrayList<Integer> a = new ArrayList<>();
    public static ArrayList<Integer> b = new ArrayList<>();

    static int getMissingNo(ArrayList<Integer> a, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a.get(i);
        return total;
    }
    public static int asd;

    public static void readAndWriteVF(String directoryRead, String directoryWrite) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(directoryRead));
            BufferedWriter bw = new BufferedWriter(new FileWriter(directoryWrite));
            BufferedWriter bs = new BufferedWriter(new FileWriter("data-export/nezname-spolecnosti.txt"));
            BufferedWriter bf = new BufferedWriter(new FileWriter("data-export/nezname-faktury.txt"));
            line = br.readLine();

            while (line != null) {

                lineArguments = line.split(",");
                line = br.readLine();
                String num = lineArguments[0];
                int fakturaNum = Integer.parseInt(num);

                int poradoveCisloFaktury = Integer.parseInt(lineArguments[0]);

                a.add(poradoveCisloFaktury);

                lineArgumentsParsed[0] = lineArguments[0];
                lineArgumentsParsed[2] = lineArguments[2];

                if (lineArguments[1].equals("05159822")) {
                    lineArgumentsParsed[1] = "BlueNet, s.r.o.";
                } else if (lineArguments[1].equals("06230932")) {
                    lineArgumentsParsed[1] = "Epic Internet a.s.";
                } else if (lineArguments[1].equals("18539217")) {
                    lineArgumentsParsed[1] = "Big žirafa s.r.o.";
                } else if (lineArguments[1].equals("02838109")) {
                    lineArgumentsParsed[1] = "Martin Nový";
                } else if (lineArguments[1].equals("01846359")) {
                    lineArgumentsParsed[1] = "GreenStyles, a.s.";
                } else if (lineArguments[1].equals("9831829")) {
                    lineArgumentsParsed[1] = "Valza, a.s";
                } else if (lineArguments[1].equals("33828139")) {
                    lineArgumentsParsed[1] = "ZCZ, s.r.o.";
                } else {
                    lineArgumentsParsed[1] = "Neznámá korporace";
                    bs.write(lineArguments[1]);
                    bs.newLine();
                }


                for (int i = 0; i < lineArgumentsParsed.length; i++) {
                    bw.write(lineArgumentsParsed[i]);
                    bw.write(";");
                }
                bw.newLine();

            }

            br.close();
            bw.close();
            bs.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeFaktury(ArrayList<Integer> a) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data-export/nezname-faktury.txt"));

            for (int i = 1; i < a.size(); i++) {
                int previousNumber = a.get(i-1);
                int currentNumber = a.get(i);

                if (previousNumber != (currentNumber-1)){
                    bw.write((currentNumber-1) +"");
                    bw.newLine();
                }
            }

            bw.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
