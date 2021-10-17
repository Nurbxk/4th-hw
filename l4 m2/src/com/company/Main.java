package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println( name );
        String name1 = scanner.nextLine();
        System.out.println(  name1 );
        String name2 = scanner.nextLine();
        System.out.println( name2 );
        String name3 = scanner.nextLine();
        System.out.println( name3 );
        String name4 = scanner.nextLine();
        System.out.println(name4 );

        ArrayList <String> FemaleName = new ArrayList<String>();
        FemaleName.add(name);
        FemaleName.add(name1);
        FemaleName.add(name2);
        FemaleName.add(name3);
        FemaleName.add(name4);
        System.out.println(FemaleName);
        System.out.println("-------------");

        String name5 = scanner.nextLine();
        System.out.println( name5 );
        String name6 = scanner.nextLine();
        System.out.println(  name6 );
        String name7 = scanner.nextLine();
        System.out.println( name7 );
        String name8 = scanner.nextLine();
        System.out.println( name8 );
        String name9 = scanner.nextLine();
        System.out.println(name9 );




        ArrayList <String> MaleName = new ArrayList<String>();
        MaleName.add(name5);
        MaleName.add(name6);
        MaleName.add(name7);
        MaleName.add(name8);
        MaleName.add(name9);
        System.out.println(MaleName);


        ArrayList<String> Both = new ArrayList<String>();
Both.addAll(MaleName);
        Both.addAll(FemaleName);
        System.out.println(Both);

        Collections.sort(Both, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()- o2.length();
            }
            });
        System.out.println(Both);
    }
}
