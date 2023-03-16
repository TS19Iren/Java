package oop.hw4;

public class Sorter<E> {
    public void bubble(E[] array) {
        E temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] != null && array[j] != null && array[j + 1] != null)
                    if (array[j].hashCode() > array[j + 1].hashCode()) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
            }
        }
    }

    public void selection(E[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {

                if (array[i] != null && array[minInd] != null && array[i].hashCode() < array[minInd].hashCode()) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }

    public void insertion(E[] array) {
        for (int left = 0; left < array.length; left++) {
                        E value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value != null && array[i] != null && value.hashCode() < array[i].hashCode()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    private void swap(E[] array, int ind1, int ind2) {
        E tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
