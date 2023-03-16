package oop.hw3;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate timeStart;
    private LocalDate timeDeadLine;
    private PriorityEnum priority;
    private String location;

    public Task(String name, LocalDate timeStart, LocalDate timeDeadLine, PriorityEnum priority, String location) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeDeadLine = timeDeadLine;
        this.priority = priority;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDate timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDate getTimeDeadLine() {
        return timeDeadLine;
    }

    public void setTimeDeadLine(LocalDate timeDeadLine) {
        this.timeDeadLine = timeDeadLine;
    }

    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public String getInfo(){
        return "Task{" +
                "name='" + name + '\'' +
                ", timeStart=" + timeStart +'\''+
                ", timeDeadLine=" + timeDeadLine +'\''+
                ", priority=" + priority +'\''+
                ", location='" + location + '\'' +
                '}';
    }
}
