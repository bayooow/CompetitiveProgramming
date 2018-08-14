
package PasanganTerbaik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.max;

/**
 * Created by Bayu Aji Firmansyah on 2018
 */
public class PasanganTerbaik {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input test case
        int testCase = Integer.parseInt(br.readLine());

        Integer result[] = new Integer[testCase];
        Integer[] boundry[] = new Integer[testCase][];
        Integer[] a[] = new Integer[testCase][];
        Integer[] b[] = new Integer[testCase][];
        Integer[] c[] = new Integer[testCase][];
        for (int testCounter = 0; testCounter < testCase; testCounter++) {
            // input N dan M
            Integer tempBoundry[] = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt).toArray(Integer[]::new);
            //inisialisasi array A , B , dan C
            Integer[] tempA = new Integer[tempBoundry[0]];
            Integer[] tempB = new Integer[tempBoundry[0]];
            Integer[] tempC = new Integer[tempBoundry[1]];
            tempA = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt).toArray(Integer[]::new);
            tempB = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt).toArray(Integer[]::new);
            tempC = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt).toArray(Integer[]::new);
            boundry[testCounter] = tempBoundry;
            a[testCounter] = tempA;
            b[testCounter] = tempB;
            c[testCounter] = tempC;
        }

        // calculate
        for (int testCounter = 0; testCounter < testCase; testCounter++) {
                int min = (a[testCounter][0] * b[testCounter][0]) + c[testCounter][((a[testCounter][0] * b[testCounter][0]) % boundry[testCounter][1])];
                for (int i = 0; i < boundry[testCounter][0]; i++) {
                    for (int j = 0; j < boundry[testCounter][0]; j++) {
                        int calculated = (a[testCounter][i] * b[testCounter][j]) + c[testCounter][((a[testCounter][i] * b[testCounter][j]) % boundry[testCounter][1])];
                        min = Integer.min(min, calculated);
                    }
                }
                result[testCounter] = min;
        }
        //print result
        for(Integer rest :result){
            System.out.println(rest);
        }

    }

}
