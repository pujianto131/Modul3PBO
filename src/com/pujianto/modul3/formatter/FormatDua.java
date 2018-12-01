package com.pujianto.modul3.formatter;

import com.pujianto.modul3.date.DateAdapter;
import com.pujianto.modul3.date.Delimiter;
import com.pujianto.modul3.converter.ConvertDate;

public class FormatDua extends DateAdapter implements ConvertDate {
    private static boolean isError = true;
    
    @Override
    public void FormatMethod(String dateUser) {
        Delimiter batas = new Delimiter();
        try {
            String[] tampung = dateUser.split("\\ ");
            setDay(Integer.parseInt(tampung[0]));
            setMount(Integer.parseInt(tampung[1]));
            setYear(Integer.parseInt(tampung[2]));
        }catch (NumberFormatException e) {
            isError = false;
            System.out.println("salah input");

        }
        if (isError){
            if (getDay() <10) {
                System.out.print("0"+getDay() + batas.BATAS_SLASH);
            }
            else {
                System.out.print(getDay() + batas.BATAS_SLASH);
            }

            if (getMount() <10) {
                System.out.print("0"+getMount() + batas.BATAS_SLASH);
            }
            else {
                System.out.print(getMount() + batas.BATAS_SLASH);
            }
            System.out.println(getYear());
        }



    }
}
