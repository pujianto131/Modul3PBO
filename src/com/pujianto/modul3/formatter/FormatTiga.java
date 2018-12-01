package com.pujianto.modul3.formatter;

import com.pujianto.modul3.converter.ConvertDate;
import com.pujianto.modul3.date.DateAdapter;
import com.pujianto.modul3.date.Delimiter;

public class FormatTiga extends DateAdapter implements ConvertDate {
    private static boolean isError = true;
    @Override
    public void FormatMethod(String dateUser) {
        Delimiter batas = new Delimiter();
        int index = 0;

        try {
            String[] tampung = dateUser.split("\\ ");
            setDay(Integer.parseInt(tampung[0]));
            setMount(Integer.parseInt(tampung[1]));
            setYear(Integer.parseInt(tampung[2]));
        }catch (NumberFormatException e){
            isError = false;
            System.err.println("inputan bukan angka");
        }

        if (isError){
            for (int i = 0; i < BULAN.length; i++) {
                if (getMount() == MOUNTH[i]) {
                    index=i;
                }
            }
            System.out.print(BULAN[index] + batas.BATAS_SPACE);
            if (getDay() <10) {
                System.out.print("0"+getDay() + batas.BATAS_KOMA);
            }
            else {
                System.out.print(getDay() + batas.BATAS_KOMA);
            }
            System.out.println(getYear());

        }

    }
}
