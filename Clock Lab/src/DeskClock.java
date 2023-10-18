public class DeskClock implements Clock {
    private int hour;
    private int minutes;
    public DeskClock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    public DeskClock() {
        this.hour = 12;
        this.minutes = 0;
    }
    public int getHour() {
        return this.hour <= 12? this.hour : this.hour-12;
    }
    public int getMinutes() {
        return this.minutes;
    }

    // Modifiers/Mutators
    // Precondition: hr and min represent valid time
    public void setHour(int hr) {
        this.hour = hr;
    }
    public void setMinutes(int min) {
        this.minutes = min;
    }

    // Override Object's methods
    public String toString() {
        String hourComp = this.hour < 10? "0"+this.hour : ""+this.hour;
        String minuteComp = this.minutes <10?"0"+this.minutes:""+this.minutes;
        return hourComp+":"+minuteComp;
    }
    public boolean equals (DeskClock obj) {
        return this.hour == obj.hour && this.minutes == obj.minutes;
    }

    // Other methods
    /**
     * "normalizes" time to proper hour & minutes values
     *  For example: 1<=hour<=12 and 0<=minutes<60
     *               AM and PM are not distinguished
     *  May be changed for each "clock style"
     */
    public void normalizeTime() {
        int totalMinutes = this.hour * 60 + this.minutes;
        this.hour = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
        if (this.hour > 12) {
            this.hour -= 12;
        }
    }

    // Adds a minute to time & calls normalizeTime()
    public void addOneMinute() {
        addMinutes(1);
    }

    // Adds some minutes to time & calls normalizeTime()
    public void addMinutes(int min) {
        minutes += min;
        normalizeTime();
    }

    // Adds some hours & minutes to time
    //  & calls normalizeTime()
    public void addTime(int hr, int min) {
        this.hour += hr;
        this.minutes += min;
        normalizeTime();
    }

    // Resets the time
    // Precondition: hr and min represent valid time
    public void resetTime(int hr, int min) {
        this.hour = hr;
        this.minutes = min;
    }
}
