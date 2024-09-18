package lab12.ex1;

import java.util.ArrayList;

public class QuickSort implements SortInterface {
    
    @Override
    public void sort(ArrayList<Phone> phoneList) {
        quickSort(phoneList, 0, phoneList.size() - 1);
    }

    private void quickSort(ArrayList<Phone> phoneList, int low, int high) {
        if (low < high) {
            int pi = partition(phoneList, low, high);
            quickSort(phoneList, low, pi - 1);
            quickSort(phoneList, pi + 1, high);
        }
    }

    private int partition(ArrayList<Phone> phoneList, int low, int high) {
        double pivot = phoneList.get(high).getPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (phoneList.get(j).getPrice() < pivot) {
                i++;
                Phone temp = phoneList.get(i);
                phoneList.set(i, phoneList.get(j));
                phoneList.set(j, temp);
            }
        }
        Phone temp = phoneList.get(i + 1);
        phoneList.set(i + 1, phoneList.get(high));
        phoneList.set(high, temp);
        return i + 1;
    }
}
