package OOP.seminar2.task1;

public class SeniorStudent extends Pupil implements ISmoke, ILove{
    @Override
    void myName() {
        System.out.println("Я ученик старшей школы");
    }

    @Override
    public void love() {
        System.out.println("Я ищу любовь");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    @Override
    void study() {
        System.out.println("Я должен учиться");
    }
}
