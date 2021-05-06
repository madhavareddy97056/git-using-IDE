package com.mounika;
import java.util.scanner;
public class Main {

    public static void main(String[] args) {
        scanner s = new scanner(System.in);
        int n =s.nextInt();
        boolean isPrime=true;
        for(int i=1;i<=n/2;i++)
            if(n%i==0){
                isPrime=false;
                break;
            }
        System.out.println(isPrime?"prime":"not prime");


    }
}
