package com.tcs.excercise.tryout;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int num =10;// Integer.parseInt(args[0]);
        int even[] = new int[20];
        int sum = 0,j = 0;
        String evennums = "";
        List list=new ArrayList();
        //Insert your code here
       for(int i = 2; i <= num; i++){
			if(i % 2 == 0) {	// Checks if i is even
        sum += i; // The same as sum = sum + i

        if(evennums.length()==0){
          evennums=Integer.toString(i);
          //even[i];

        }else{
           evennums=evennums+","+Integer.toString(i);
        }
			}
		}

        System.out.println(evennums);
        System.out.println(sum);
    }
}