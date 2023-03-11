package OOP.seminar3.task1;

import java.util.ArrayList;
import java.util.List;

public class FigureCollector {
    private final List<Figure> listOfFigures;

    public FigureCollector() {
        this.listOfFigures = new ArrayList<>();
    }

    public void addFigure(Figure figure) {
        listOfFigures.add(figure);
    }

    public void removeFigure(Figure figure) {
        listOfFigures.remove(figure);
    }

    /**
     * Обновление фигуры в списке по индексу
     *
     * @param index  индекс
     * @param figure фигура с обновленными данными
     */
    public void addFigure(int index, Figure figure) {
        listOfFigures.add(index, figure);
        listOfFigures.remove(index+1);
    }

    public List<Figure> sortByArea() {
        final var areaComparator = new AreaComparator();
        listOfFigures.sort(areaComparator);
        return listOfFigures;
    }
    public void getInfo(){
        for (Figure figure:listOfFigures) {
            figure.getInfo();
        }
    }

}
