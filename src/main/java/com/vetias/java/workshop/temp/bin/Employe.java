package com.vetias.java.workshop.temp.bin;

import java.util.Arrays;

public class Employe {
    public static void main(String[] args){
    String[][] emp= new String[5][3];
    emp[0][0]="krishna Reddy";
    emp[0][1]="10000";
    emp[0][2]="Software Engineer";

    emp[1][0]="Ravi";
    emp[1][1]="20000";
    emp[1][2]="Senior Software Engineer";

    emp[2][0]="Suresh";
    emp[2][1]="30000";
    emp[2][2]="Project Manager";

    emp[3][0]="Ramesh";
    emp[3][1]="40000";
    emp[3][2]="Senior Project Manager";

    emp[4][0]="Mahesh";
    emp[4][1]="50000"; 
    emp[4][2]="Director"; 
    
    for(String[] Employee : emp){
        System.out.println(Arrays.toString(Employee));
    }
    }
}
