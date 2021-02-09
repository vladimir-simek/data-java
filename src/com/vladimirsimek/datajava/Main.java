package com.vladimirsimek.datajava;


import static com.vladimirsimek.datajava.Logic.*;

public class Main {

    public static void main(String[] args) {

        readAndWriteVF("data/VF_2015.dat", "data-export/VF_2015.csv");
        readAndWriteVF("data/VF_2016.dat", "data-export/VF_2016.csv");
        readAndWriteVF("data/VF_2017.dat", "data-export/VF_2017.csv");
        readAndWriteVF("data/VF_2018.dat", "data-export/VF_2018.csv");
        readAndWriteVF("data/VF_2019.dat", "data-export/VF_2019.csv");
        readAndWriteVF("data/VF_2020.dat", "data-export/VF_2020.csv");

        writeFaktury(a);

    }
}
