package training.taylor.timetracker.core.dao;

public class TimeEntry {
    private String description;
    private double rate;
    private int time;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int value) {
        this.time = value;
    }

    @Override
    public String toString() {
        return "TimeEntry{"
               + "description='" + description + '\''
               + ", rate=" + rate
               + ", time=" + time
               + '}';
    }
}
