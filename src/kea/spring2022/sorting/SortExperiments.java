package kea.spring2022.sorting;

import java.util.Arrays;

public class SortExperiments {
    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
        app.sort1();
        app.sort2();
        //app.sortBalls1();
        app.sort3();
        app.sort4();
        app.sortBalls2();
        app.sortBalls3();

        app.sortPersons1();
        app.sortPersons2();

        //app.sortBalls4();
    }

    public void sort1() {
        System.out.println("Sortering af int[] med Arrays.sort();");
        int[] tal = { 6, 2, 8, 1, 9, 21, 0, 3 };

        System.out.println("Før sortering: " + Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
        System.out.println();
    }
    public void sort2() {
        System.out.println("Sortering af String[] med Arrays.sort();");
        String[] ord = {"bonde","gård","abe","kat","hund","ko","and"};

        System.out.println("Før sortering: " + Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
        System.out.println();
    }

    public void sortBalls1() {
        System.out.println("Sortering af Ball[] med Arrays.sort(); (Vil crashe)");
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        Arrays.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
        System.out.println();
    }

    public void sort3() {
        System.out.println("Sortering af int[] med QuickSort.sort();");
        int[] tal = { 6, 2, 8, 1, 9, 21, 0, 3 };

        System.out.println("Før sortering: " + Arrays.toString(tal));
        QuickSort sorter = new QuickSort();
        sorter.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
        System.out.println();
    }

    public void sort4() {
        System.out.println("Sortering af String[] med QuickSortString.sort();");
        String[] ord = {"bonde","gård","abe","kat","hund","ko","and"};

        System.out.println("Før sortering: " + Arrays.toString(ord));
        QuickSortString sorter = new QuickSortString();
        sorter.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
        System.out.println();
    }

    public void sortBalls2() {
        System.out.println("Sortering af Ball[] med QuickSortBalls.sort();");
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        QuickSortBalls sorter = new QuickSortBalls();
        sorter.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
        System.out.println();
    }

    public void sortBalls3() {
        System.out.println("Sortering af Ball[] med QuickSortComparableObject.sort();");
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        QuickSortComparableObject sorter = new QuickSortComparableObject();
        sorter.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
        System.out.println();
    }

    public void sortPersons1() {
        System.out.println("Sortering af Person[] med QuickSortComparableObject.sort();");
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSortComparableObject sorter = new QuickSortComparableObject();
        sorter.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
        System.out.println();

    }

    public void sortPersons2() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
        System.out.println();

    }

    public void sortBalls4() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        // TODO: Sorter array af balls med Arrays.sort

        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
        System.out.println();
    }
}