package org.example;

import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class Final {

    public static boolean containsDuplicates(Integer[] numbers) {
        Set<Integer> numbersSet = new HashSet<>(Arrays.asList(numbers));
        return numbersSet.size() != numbers.length;
    }

    public static void main(String[] args) {
        Integer [] duplicates = {1, 2, 3, 2};
        Integer [] uniques = {1, 2, 3};
        System.out.println(containsDuplicates(duplicates)); // true
        System.out.println(containsDuplicates(uniques)); // false
    }}