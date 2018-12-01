package com.pujianto.modul3.formatter;


import com.pujianto.modul3.date.DateAdapter;
import com.pujianto.modul3.date.Delimiter;
import com.pujianto.modul3.converter.ConvertDate;

public class FormatSatu extends DateAdapter implements ConvertDate {
    private static boolean time = false;
    private static boolean isError = true;
    private String formatMe = "dd-mm-yyyy";

    public FormatSatu(String paten) {
        if (paten.equals(formatMe)) {
            time = true;
        }
    }

    @Override
    public void FormatMethod(String dataUser){

        if (time) {

            Delimiter batas = new Delimiter();
            try {
                String[] tampung = dataUser.split("\\ ");
                setDay(Integer.parseInt(tampung[0]));
                setMount(Integer.parseInt(tampung[1]));
                setYear(Integer.parseInt(tampung[2]));
            }catch (NumberFormatException e) {
                isError = false;
                System.err.print("salah input\n");
//                System.out.printf("");

            }

            if (isError) {
                if ( getDay()<10) {
                    System.out.print("0"+getDay() + batas.BATAS_STRIP);
                }
                else {
                    System.out.print(getDay() + batas.BATAS_STRIP);
                }

                if (getMount() <10) {
                    System.out.print("0"+getMount() + batas.BATAS_STRIP);
                }
                else {
                    System.out.print(getMount() + batas.BATAS_STRIP);
                }
                System.out.println(getYear());
            }

        }
        else {
            System.out.println("parameter construktor anda salah");
        }
    }
}
