package com.vladimirsimek.datajava;

import java.io.*;

public class Logic {

    public static String line = "hey";
    public static String[] lineArguments = null;
    public static String[] lineArgumentsParsed = {"gay", "lesbian", "bisexual"};

    public static void readAndWriteVF(String directoryRead, String directoryWrite) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(directoryRead));
            BufferedWriter bw = new BufferedWriter(new FileWriter(directoryWrite));
            line = br.readLine();

            while (line != null) {
                lineArguments = line.split(",");
                line = br.readLine();
                for (int i = 0; i < lineArguments.length; i++) {

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
                    } else lineArgumentsParsed[1] = "Neznámá korporace";


                }
                for (int i = 0; i < lineArgumentsParsed.length; i++) {
                    bw.write(lineArgumentsParsed[i]);
                    bw.write(";");
                }
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
