package edu.escuelaing.arep;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import edu.escuelaing.arep.LinkedliStstructure.LinkedList;

public class App {
    private static Calculator calculator = new Calculator();

    public static void main( String[] args ) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scaner = new Scanner(file);
        while (scaner.hasNextLine()) {
            String line =scaner.nextLine();
            calculateData(line);
        }
        scaner.close();

    }

    private static void calculateData(String data) {
        LinkedList<Double> linkedList = new LinkedList<>();
        String[] dataSet = data.split(",");
        for (String i : dataSet){
            double value = Double.parseDouble(i);
            linkedList.insertLast(value);
        }
        System.out.println("La media es: "+ calculator.calculateMean(linkedList));
        System.out.println("La desviación estándar es: "+ calculator.calculateStandarDeviation(linkedList));
    }
}


