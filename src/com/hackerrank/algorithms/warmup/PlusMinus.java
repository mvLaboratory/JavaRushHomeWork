package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by admin on 02.11.2015.
 */
public class PlusMinus {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zeroCounetr = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < n; i++){
            int num = in.nextInt();

            if (num > 0) positiveCounter++;
            else if(num < 0) negativeCounter++;
            else zeroCounetr++;
        }
        if (zeroCounetr < positiveCounter && zeroCounetr < negativeCounter) {
            float posFraction = correct((float)positiveCounter / n);
            System.out.println(posFraction);
            float negFraction = correct((float)negativeCounter / n);
            System.out.println(negFraction);
            System.out.println(correct(1f - (posFraction + negFraction)));
        }
        else if(negativeCounter < positiveCounter && negativeCounter < zeroCounetr) {
            float posFraction = correct((float)positiveCounter / n);
            System.out.println(posFraction);
            float zeroFraction = correct((float)zeroCounetr / n);
            float negFraction = correct(1f - (posFraction + zeroFraction));
            System.out.println(negFraction);
            System.out.println(zeroFraction);
        }
        else {
            float negFraction = correct((float)negativeCounter / n);
            float zeroFraction = correct((float)zeroCounetr / n);
            float posFraction = correct(1f - (negFraction + zeroFraction));
            System.out.println(posFraction);
            System.out.println(negFraction);
            System.out.println(zeroFraction);
        }
    }

    public static float correct(float num) {
        int temp = (int)(num * 1000);
        return  (float)temp / 1000;
    }
}
