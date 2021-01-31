package edu.escuelaing.arep;

import edu.escuelaing.arep.LinkedliStstructure.LinkedList;

/**
 * Esta clase calcula la media y la desviación estándar de un conjunto de datos
 * @author Paula Andrea Guevara Sánchez
 */
public class Calculator {
    /**
     *Método que calcula la media de un conjunto de datos
     * @param linkedList conjunto de datos
     * @return la sumatoria del conjunto de datos de la linked List
     */
    public static double calculateMean(LinkedList<Double> linkedList) {
        double sum = 0.0;
        for (Double i : linkedList) {
            sum += i;
        }
        return sum / linkedList.getSize();
    }

    /**
     * Método que calcula la desviación estándar de un conjunto de datos
     * @param linkedList conjunto de datos
     * @return desviación estándar de un conjunto de datos de la linked List
     */
    public static double calculateStandarDeviation(LinkedList<Double> linkedList) {
        double prom = calculateMean(linkedList);
        double sum = 0;
        for (Double i : linkedList) {
            sum += Math.pow(i - prom, 2);
        }
        return (float) Math.sqrt((sum) / (linkedList.getSize() - 1));
    }


}
