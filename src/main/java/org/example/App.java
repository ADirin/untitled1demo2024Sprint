package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int addme(int a, int b) {return a+b;}

    //added subtract method
    public static int subtractme(int a, int b) {return a-b;}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" + addme(11,5));
    }


}
