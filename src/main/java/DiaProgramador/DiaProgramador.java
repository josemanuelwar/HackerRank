package DiaProgramador;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DiaProgramador {

    public static String dayOfProgrammer(int year){
        int sumaMeses= 31 + 31 + 30 + 31 + 30 + 31 + 31;
        int dias=256;
        int DiaFebrero=28;
        String septirmbre="09";
        int diaProgramador=0;
        if(year > 1918){
            if((year%400)==0){
                DiaFebrero=DiaFebrero+1;
            }else if((year%4)==0 && (year%100)!=0){
                DiaFebrero=DiaFebrero+1;
            }
        }
        if(year == 1918){
            diaProgramador=dias-198 -32;
            return diaProgramador+"."+septirmbre+"."+year;
        }
        if(year >= 1700 &&  year <= 1917){
            if((year%4)==0){
                DiaFebrero=DiaFebrero+1;
            }
        }

        sumaMeses=sumaMeses+DiaFebrero;
        diaProgramador=dias-sumaMeses;
        return diaProgramador+"."+septirmbre+"."+year;

    }

    public static void main(String[] args) {
        System.out.println(DiaProgramador.dayOfProgrammer(2100));
    }

}
