package org.example;

public class who {
    public static void main(String[] args) {
        String s="Manojt2409@gmail.com";
        me(s);
    }
    public static void me(String a){
        StringBuilder small=new StringBuilder();
        StringBuilder capital=new StringBuilder();
        StringBuilder numbers=new StringBuilder();
        StringBuilder specialCharacters=new StringBuilder();
        //s -> capital letters, small letters,numbers and special characters in 4 different string
        //iterate the string and use several if conditions and use string buffer to manipulate the strings
        for(int i=0;i<a.length();i++){

            if(a.charAt(i)>='a' && a.charAt(i)<='z' ){
                small.append(a.charAt(i));
            }
            else if(a.charAt(i)>='A' && a.charAt(i)<='Z' ){
                capital.append(a.charAt(i));
            }
            else if(a.charAt(i)>='0' && a.charAt(i)<='9' ){
                numbers.append(a.charAt(i));
            }
            else {
                specialCharacters.append(a.charAt(i));
            }
        }
        System.out.println(small);
        System.out.println(capital);
        System.out.println(numbers);
        System.out.println(specialCharacters);
    }
}
