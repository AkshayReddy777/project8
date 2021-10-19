package com.company;

import java.awt.*;
import java.net.URI;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class FunctionsPractice {
    static void Printstatement() {
        System.out.println("this is a statement to be printed");
    }
    static void Largernumber() {
        int i = 7;
        int j = 5;
        if(i>j) {
            System.out.println("i is larger number " +i);
        } else {
            System.out.println("j is larger number " +j);
        }
    }
    static int Addition(int x , int y) {
        return y + x;

    }
    static int Multiplication(int x, int y) {
        return x*y;
    }
    static Object Calculator(int x, int y , Object operator) {
        if (operator == "+") return x + y;
        else if (operator == "-") return x-y;
        else if (operator == "*") return x*y;
        else if (operator == "/") return x/y;
        else if (operator == "%") return x%y;

        else return "enter the right options";
    }
    static int Website() throws Exception {
        System.out.println("Press 1 for Google" + '\n' + "Press 2 for Facebook" + '\n' + "Press 3 for YouTube ");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x == 0) {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://google.com"));
        } else  if (x == 1) {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://facebook.com"));
        } else  if (x == 2) {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://youtube.com"));
        }

        return x;
    }
    static String Uppercase (String x) {
        return x = x.toUpperCase(Locale.ROOT);
    }
    static String Lowercase (String x) {
        return x = x.toLowerCase(Locale.ROOT);
    }
//    static CharSequence Chararray (String x) {
//        return x = String.valueOf(x.toCharArray());
//    }
    static Object Datetoday () {
        Calendar calendar = Calendar.getInstance();

        return  calendar.getTime();

    }

    public static void main(String[] args) throws Exception {
        Printstatement();
        Printstatement();
        Largernumber();
        System.out.println(Addition(6,16));
        System.out.println(Multiplication(5,25));
        System.out.println(Calculator(5, 6, "%"));
        System.out.println(Website());
        System.out.println(Uppercase("AkshaY123"));
        System.out.println(Lowercase("AKSHAy"));
//        System.out.println(Chararray("Akshay"));
        System.out.println(Datetoday());


    }
    static class GFG
    {
        // Function that print all combinations of
        // balanced parentheses
        // open store the count of opening parenthesis
        // close store the count of closing parenthesis
        static void _printParenthesis(char str[], int pos, int n, int open, int close)
        {
            if(close == n)
            {
                // print the possible combinations
                for(int i=0;i<str.length;i++)
                    System.out.print(str[i]);
                System.out.println();
                return;
            }
            else
            {
                if(open > close) {
                    str[pos] = '}';
                    _printParenthesis(str, pos+1, n, open, close+1);
                }
                if(open < n) {
                    str[pos] = '{';
                    _printParenthesis(str, pos+1, n, open+1, close);
                }
            }
        }

        // Wrapper over _printParenthesis()
        static void printParenthesis(char str[], int n)
        {
            if(n > 0)
                _printParenthesis(str, 0, n, 0, 0);
            return;
        }

        // driver program
        public static void main (String[] args)
        {
            int n = 5;
            char[] str = new char[2 * n];
            printParenthesis(str, n);
        }
    }


}
