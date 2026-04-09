package practice2;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.hour = h;
            this.minute = m;
            this.second = s;
        } else {
            System.out.println("Invalid input! Time set to 00:00:00");
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    // Реализация Comparable для Problem 5
    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        }
        return Integer.compare(this.second, other.second);
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour;
        String period = (hour < 12) ? "AM" : "PM";
        if (h == 0) h = 12;
        else if (h > 12) h -= 12;
        return String.format("%02d:%02d:%02d %s", h, minute, second, period);
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += t.minute + (this.second / 60);
        this.second %= 60;
        this.hour += t.hour + (this.minute / 60);
        this.minute %= 60;
        this.hour %= 24;
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}