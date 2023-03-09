package OOP.seminar2.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrimarySchoolPupil primarySchoolPupil = new PrimarySchoolPupil();
        HighSchooler highSchooler = new HighSchooler();
        SeniorStudent seniorStudent = new SeniorStudent();
        List<Pupil> arrayPupils = new ArrayList<>();
        arrayPupils.add(primarySchoolPupil);
        arrayPupils.add(highSchooler);
        arrayPupils.add(seniorStudent);

        for (Pupil pupil:arrayPupils) {
            pupilMethods(pupil);
            System.out.println('\n');
        }

    }
    static void pupilMethods(Pupil pupil){
        pupil.myName();
        pupil.study();
        if(pupil instanceof IGoToDops){
            ((IGoToDops) pupil).goToDops();
        }
        if(pupil instanceof ILove){
            ((ILove) pupil).love();
        }
        if(pupil instanceof IPlay){
            ((IPlay) pupil).play();
        }
        if(pupil instanceof ISmoke){
            ((ISmoke) pupil).smoke();
        }
    }
}
