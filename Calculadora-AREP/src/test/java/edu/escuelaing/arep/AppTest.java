package edu.escuelaing.arep;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import junit.framework.TestCase;
import edu.escuelaing.arep.LinkedliStstructure.LinkedList;
import edu.escuelaing.arep.Calculator;
import edu.escuelaing.arep.App;
/**
 * Unit test for simple App.
 */
public class AppTest{
        Calculator calculator;
        LinkedList<Double> data1,data2,data3,data4, data5,data6;


        @Before
        public void setup (){
            calculator = new Calculator();
            data1 = new LinkedList(new Double[]{26.7,58.2,69.1,47.6,13.2,42.8,78.2,65.1,74.3,68.7,32.4,71.6});
            data2 = new  LinkedList(new Double[]{77.2, 19.4, 10.8, 74.6, 53.4, 42.2, 34.3, 67.4, 63.7});
            data3 = new  LinkedList(new Double[]{64.7, 175.1, 118.3, 57.9, 54.6, 65.4, 123.7, 92.2, 173.0, 126.5});
            data4 = new  LinkedList(new Double[]{122.0, 89.4, 41.6, 75.2, 50.1, 52.7, 54.3});
            data5 = new  LinkedList(new Double[]{61.4, 81.9, 72.1, 58.3, 62.0, 50.7, 48.0, 82.4, 78.7});
            data6 = new LinkedList(new Double[]{15.0, 69.9, 6.5 , 22.4, 28.4, 65.9 , 19.4, 198.7, 38.8, 138.2});
        }


        @Test
        public void shouldCalculateMean() {
            Assert.assertEquals(53.9, calculator.calculateMean(data1), 0.1);
            Assert.assertEquals(49.2, calculator.calculateMean(data2), 0.1);
            Assert.assertEquals(105.1, calculator.calculateMean(data3), 0.1);
            Assert.assertEquals(69.3, calculator.calculateMean(data4), 0.1);
            Assert.assertEquals(66.1, calculator.calculateMean(data5), 0.1);
            Assert.assertEquals(60.32, calculator.calculateMean(data6), 0.1);
        }


        @Test
        public void shouldNotCalculateMean() {
            Assert.assertNotEquals(55.0, calculator.calculateMean(data1), 0.0);
            Assert.assertNotEquals(50.0, calculator.calculateMean(data2), 0.00001);
            Assert.assertNotEquals(104.8, calculator.calculateMean(data3), 0.01);
            Assert.assertNotEquals(65.2, calculator.calculateMean(data4), 0.01);
            Assert.assertNotEquals(67.2, calculator.calculateMean(data5), 0.01);
            Assert.assertNotEquals(50.3, calculator.calculateMean(data6), 0.1);
        }


        @Test
        public void shouldCalculateStandardDeviation(){
            Assert.assertEquals(21.18, calculator.calculateStandarDeviation(data1), 0.01);
            Assert.assertEquals(24.03, calculator.calculateStandarDeviation(data2), 0.01);
            Assert.assertEquals(45.51, calculator.calculateStandarDeviation(data3), 0.01);
            Assert.assertEquals(28.43, calculator.calculateStandarDeviation(data4), 0.01);
            Assert.assertEquals(13.10, calculator.calculateStandarDeviation(data5), 0.01);
            Assert.assertEquals(62.26, calculator.calculateStandarDeviation(data6), 0.01);
        }


        @Test
        public void shouldNotCalculateStandardDeviation(){
            Assert.assertNotEquals(22.0, calculator.calculateStandarDeviation(data1), 0.05);
            Assert.assertNotEquals(25.0, calculator.calculateStandarDeviation(data2), 0.03);
            Assert.assertNotEquals(45.55, calculator.calculateStandarDeviation(data3), 0.01);
            Assert.assertNotEquals(28.49, calculator.calculateStandarDeviation(data4), 0.01);
            Assert.assertNotEquals(13.2, calculator.calculateStandarDeviation(data5), 0.01);
            Assert.assertNotEquals(60.89, calculator.calculateStandarDeviation(data6), 0.01);
        }
    }
