package Enums;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    public int noOfDaysInMonth;


    Months(int noOfDaysInMonth) {
        this.noOfDaysInMonth = noOfDaysInMonth;
    }


    public int getNoOfDaysInMonth() {
        return noOfDaysInMonth;
    }
}
