package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SortingClass {
    private List<Notebook> notebookList;

    public SortingClass(List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    public List<Notebook> sort(Map<CriteriaName, Object> param) {
        List<Notebook> sortedNotebookList = new ArrayList<>(notebookList);
        for (Map.Entry<CriteriaName, Object> criteriaNameObjectEntry : param.entrySet()) {
            switch (criteriaNameObjectEntry.getKey()) {
                case COLOR:
                    sortByColor(criteriaNameObjectEntry.getValue(),sortedNotebookList);
                    break;
                case BRAND:
                    sortByBrand(criteriaNameObjectEntry.getValue(),sortedNotebookList);
                    break;
                case RAM:
                    sortByRam(criteriaNameObjectEntry.getValue(), sortedNotebookList);
                    break;
                case MONITOR_SIZE:
                    sortByMonitorSize(criteriaNameObjectEntry.getValue(),sortedNotebookList);
                    break;
                case PRICE:
                    sortByPrice(criteriaNameObjectEntry.getValue(),sortedNotebookList);
                    break;
                case VIDEO_CARD:
                    sortByVideoCard(criteriaNameObjectEntry.getValue(),sortedNotebookList);
                    break;
            }
        }
        return sortedNotebookList;
    }
    private void sortByRam(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (item.getRam() < (int)param) {
                list.remove(item);
            }
        }
    }
    private void sortByColor(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (!item.getColor().equalsIgnoreCase((String)param)) {
                list.remove(item);
            }
        }
    }

    private void sortByBrand(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (!item.getBrand().equalsIgnoreCase((String)param)) {
                list.remove(item);
            }
        }
    }
    private void sortByMonitorSize(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (item.getMonitorSize()<(int)param) {
                list.remove(item);
            }
        }
    }
    private void sortByPrice(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (item.getPrice()<(int)(param)) {
                list.remove(item);
            }
        }
    }
    private void sortByVideoCard(Object param, List<Notebook> list){
        for (Notebook item : notebookList) {
            if (!item.getVideoCard().equalsIgnoreCase((String)param)) {
                list.remove(item);
            }
        }
    }
}
