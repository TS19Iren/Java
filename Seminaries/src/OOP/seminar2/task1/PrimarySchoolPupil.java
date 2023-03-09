package OOP.seminar2.task1;

public class PrimarySchoolPupil extends Pupil implements IGoToDops, IPlay{
    @Override
    void myName() {
        System.out.println("Я ученик младшей школы");
    }

    @Override
    void study() {
        System.out.println("Я люблю учиться!");
    }

    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void goToDops() {
        System.out.println("Я хожу на продленку!");
    }
}
