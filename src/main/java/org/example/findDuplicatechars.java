package org.example;

public class findDuplicatechars {
    public static void main(String[] args) {
    String a="cbs";
    int duplicate=0;
    //to find dup chars in string
        for(int i=0;i<a.length()-1;i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    duplicate++;
                    break;
                }
            }
        }
        if(duplicate==0){
            System.out.println("does not contains duplicate");
        }
        else {
            System.out.println("contains duplicate");
        }
    }
}
