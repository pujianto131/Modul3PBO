package com.pujianto.modul3.date;

public class DateAdapter {
    private String dataTanggalUser;
    private int day;
    private int mount;
    private int year;
    public final String[] BULAN={"jan", "feb", "mar", "apr", "mei", "jun","jul", "agu","sep", "okt", "nov", "des"};
    public final int[] MOUNTH = {1,2,3,4,5,6,7,8,9,10,11,12};

    public String getDataTanggalUser() {
        return dataTanggalUser;
    }

    public void setDataTanggalUser(String dataTanggalUser) {
        this.dataTanggalUser = dataTanggalUser;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
