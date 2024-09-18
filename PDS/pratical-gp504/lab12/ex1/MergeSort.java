package lab12.ex1;

import java.util.ArrayList;

public class MergeSort implements SortInterface {
    
    @Override
    public void sort(ArrayList<Phone> phoneList) {
        mergeSort(phoneList, 0, phoneList.size() - 1);
    }

    private void mergeSort(ArrayList<Phone> phoneList, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(phoneList, left, middle);
            mergeSort(phoneList, middle + 1, right);
            merge(phoneList, left, middle, right);
        }
    }

    private void merge(ArrayList<Phone> phoneList, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        ArrayList<Phone> leftList = new ArrayList<>();
        ArrayList<Phone> rightList = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftList.add(phoneList.get(left + i));
        }
        for (int i = 0; i < n2; i++) {
            rightList.add(phoneList.get(middle + 1 + i));
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftList.get(i).getPrice() <= rightList.get(j).getPrice()) {
                phoneList.set(k, leftList.get(i));
                i++;
            } else {
                phoneList.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            phoneList.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            phoneList.set(k, rightList.get(j));
            j++;
            k++;
        }
    }

}
