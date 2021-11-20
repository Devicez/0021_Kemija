package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String encoded = input.nextLine();

        StringBuilder decoded = new StringBuilder();

        for (int i=0;i<encoded.length();i++)
        {
            if(encoded.toLowerCase().charAt(i) == 'a' || encoded.toLowerCase().charAt(i) == 'e' || encoded.toLowerCase().charAt(i) == 'i' || encoded.toLowerCase().charAt(i) == 'o' || encoded.toLowerCase().charAt(i) == 'u')
            {
                decoded.append(encoded.charAt(i));
                i += 2;
            }
            else
            {
                decoded.append(encoded.charAt(i));
            }
        }

        System.out.println(decoded);
    }
}
