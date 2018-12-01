package com.pujianto.modul3;

import com.pujianto.modul3.date.DateAdapter;
import com.pujianto.modul3.formatter.FormatDua;
import com.pujianto.modul3.formatter.FormatTiga;
import com.pujianto.modul3.formatter.FormatEmpat;
import com.pujianto.modul3.formatter.FormatSatu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MainModul3 {

    public static void main(String[] args) throws IOException {

        int opsi;
        Scanner mScanner = new Scanner(System.in);
        DateAdapter mData = new DateAdapter();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char next = 'y';

        while (next == 'y'){
            System.out.print("input data anda: ");
            mData.setDataTanggalUser(br.readLine());


            System.out.print(
                    "\n1. dd-mm-yyyy"+
                            "\n2. dd/mm/yyyy"+
                            "\n3. MMM dd, yyyy"+
                            "\n4. dd MMM yyyy"+
                            "\n5. all print");

            System.out.print("\nPilih menu: ");
            opsi = mScanner.nextInt();

            switch (opsi) {
                case 1:
                    FormatSatu formatSatu = new FormatSatu("dd-mm-yyyy");
                    formatSatu.FormatMethod(mData.getDataTanggalUser());
                    break;

                case 2:
                    FormatDua formatDua = new FormatDua();
                    formatDua.FormatMethod(mData.getDataTanggalUser());

                    break;

                case 3:
                    FormatTiga formatTiga = new FormatTiga();
                    formatTiga.FormatMethod(mData.getDataTanggalUser());
                    break;

                case 4:
                    FormatEmpat formatEmpat = new FormatEmpat();
                    formatEmpat.FormatMethod(mData.getDataTanggalUser());
                    break;

                case 5:
                    FormatSatu mFormatSatu = new FormatSatu("dd-mm-yyyy");
                    mFormatSatu.FormatMethod(mData.getDataTanggalUser());

                    FormatDua mFormatDua = new FormatDua();
                    mFormatDua.FormatMethod(mData.getDataTanggalUser());

                    FormatTiga mFormatTiga = new FormatTiga();
                    mFormatTiga.FormatMethod(mData.getDataTanggalUser());

                    FormatEmpat mFormatEmpat = new FormatEmpat();
                    mFormatEmpat.FormatMethod(mData.getDataTanggalUser());
                    break;

                default:
                    System.err.println("anda salah meng input opsi!!");
                    System.out.println("");
                    break;
            }

            System.out.print("\nNext [y/n] : ");
            next = mScanner.next().charAt(0);

//            Thread.sleep(2000);

        }


    }
}
