package Appetit;

import java.util.Arrays;
import java.util.List;

public class Appett {

    public static void bonAppetit(List<Integer> bill, int k,int b){
        int suma=0;
        if(bill.size()>=2){
            if(k<bill.size() && k>=0){
                for (int i =0; i<bill.size(); i++){
                    if(k != i){
                      suma=suma+ bill.get(i);
                    }
                }
                suma=suma/2;
            }
        }
        if(b>0){
            suma=b-suma;
        }
        if(suma>0){
            System.out.println(suma);
        }else {
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) {
        List<Integer> bill1= Arrays.asList(3,10,2,9);
        Appett.bonAppetit(bill1,1,12);
    }
}
