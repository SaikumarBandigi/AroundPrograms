package org.example;

import static java.lang.System.out;

public class BinarySearch {
    public static void main(String[] args) {


        int a[] = {2, 5, 8, 11, 30, 70, 50};
        int target = 30;

        int output = binarysearch(a, target);
        out.println(output);

    }

    static int binarysearch(int a[], int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < a[mid]) end = mid - 1;

            else if (target > a[mid]) start = mid + 1;
            else return mid;
        }


        return -1;
    }


}


