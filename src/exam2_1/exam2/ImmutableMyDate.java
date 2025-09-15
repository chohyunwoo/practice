package exam2_1.exam2;

public class ImmutableMyDate {

    private int year;
    private int month;
    private int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDate setYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate setMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate setDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
