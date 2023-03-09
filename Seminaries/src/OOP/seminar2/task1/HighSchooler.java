package OOP.seminar2.task1;

public class HighSchooler extends Pupil implements IPlay, ISmoke {
    @Override
    void myName() {
        System.out.println("Я ученик средней школы");
    }

    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    @Override
    void study() {
        System.out.println("Я ненавижу учиться");
    }
}
