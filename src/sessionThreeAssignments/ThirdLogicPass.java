package sessionThreeAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLogicPass {


    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {


        String askUser= " ";
        ThirdLogicPass tlp = new ThirdLogicPass();
        do{
            int arr[];
            System.out.println("\n Enter what operation you want to perform:");
            System.out.println("\n 1: to find max 2 from array \n 2: to find min 2 from array \n 3: to find substring from entered sting");
            int input = s.nextInt();
            switch (input){

                case 1:
                    arr = tlp.userInput();
                    tlp.max2FromArray(arr,arr.length);
                    break;
                case 2:
                    arr = tlp.userInput();
                    tlp.max2FromArray(arr,arr.length);
                    break;
                case 3:
                    tlp.searchSubString();
                    break;
                default:
                    System.out.println("You entered wrong number please select from: 1/2/3");
            }
            System.out.println("Do you want to perform operations: Y / N");
            askUser = s.next();
        }while(askUser.equals("Y") || askUser.equals("y") );



        }
        public int[] userInput(){
            System.out.println("Enter expected size of array:");
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " numbers to run operations on it.");
            for(int i=0; i<arr.length;i++){
                arr[i] = s.nextInt();
            }
            System.out.println("Entered array is: " + Arrays.toString(arr));
            return arr;
        }


    /*Suppose we have array of type integer and we have 10 values into array. Write a program to find out
    top 2 maximum integer value out of 10 item and print those.*/
    public void max2FromArray(int arr[], int n){

        for(int j=0; j<n;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                    arr[j]= arr[j] + arr[k];
                    arr[k]= arr[j]-arr[k];
                    arr[j]= arr[j]-arr[k];
                }
            }

        }
        System.out.println("Max 2 numbers from the given numbers are as follows:");
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);

        }
        /*Suppose we have array of type integer and we have 10 values into array. Write a program to
        find out top 2 least/smaller integer value out of 10 item and print those.*/
    public void min2FromArray(int arr[], int n){

        System.out.println("*********************************************************");
        for(int j=0; j<n;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                    arr[j]= arr[j] + arr[k];
                    arr[k]= arr[j]-arr[k];
                    arr[j]= arr[j]-arr[k];
                }
            }

        }

        System.out.println("Min 2 numbers from the given numbers are as follows:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
    /*Find out the substring of String. Example I have string “Selenium Is An Automation Tool”
    I want to find substring “Auto” and print that string.*/
    public void searchSubString(){
            String askUser =" ";
            Scanner str = new Scanner(System.in);
            System.out.println("*********************************************************");
            System.out.println("Enter String:");
            String str1= str.nextLine();
            System.out.println("Entered string is: " + str1);

            do{
                System.out.println("Enter substring you want to find from entered string:");
                String str2= str.next();
                if(str1.contains(str2)){
                    System.out.println("Entered substring is found: " + str2);
                }
                else{
                    System.out.println("Entered substring is not present in the given string");
                }
                System.out.println("Do you want to search again: Y / N");
                askUser = str.next();
            }while(askUser.equals("Y") || askUser.equals("y") );
    }
    }


