package com.tal;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEARS=12;
        final byte PERCENT=100;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Principal: ");
        int principal=scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest= scanner.nextFloat();
        double monthlyInterest=(annualInterest/PERCENT)/MONTH_IN_YEARS;

        System.out.println("Period (Years): ");
        byte years=scanner.nextByte();
        int numberOfPayments= years*MONTH_IN_YEARS;

        double mortgage= principal
                            *(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
                            /(Math.pow(1+monthlyInterest,numberOfPayments)-1);


        NumberFormat mortgageFormatted= NumberFormat.getCurrencyInstance();
        String result= mortgageFormatted.format(mortgage);
        System.out.println("Mortgage: "+result);

    }
}
