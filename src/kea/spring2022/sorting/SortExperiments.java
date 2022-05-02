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
        //app.sortBalls2();
        //app.sortBalls3();

        //app.sortPersons1();
        //app.sortPersons2();

        //app.sortBalls4();
    }

    public void sort1() {
        int[] tal = { 6, 2, 8, 1, 9, 21, 0, 3 };

        System.out.println("Før sortering: " + Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
    }
    public void sort2() {
        String[] ord = {"bonde","gård","abe","kat","hund","ko","and"};

        System.out.println("Før sortering: " + Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
    }

    public void sortBalls1() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        Arrays.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
    }

    public void sort3() {
        int[] tal = { 6, 2, 8, 1, 9, 21, 0, 3 };

        System.out.println("Før sortering: " + Arrays.toString(tal));
        QuickSort sorter = new QuickSort();
        sorter.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
    }

    public void sort4() {
        String[] ord = {"bonde","gård","abe","kat","hund","ko","and"};

        System.out.println("Før sortering: " + Arrays.toString(ord));
        QuickSortString sorter = new QuickSortString();
        sorter.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
    }

    public void sortBalls2() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        QuickSortBalls sorter = new QuickSortBalls();
        sorter.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));
    }

    public void sortBalls3() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        // TODO: Skriv koden til sorteringsøvelse ball-sorter3 (med quicksort-sammenlignbar) her:

    }

    public void sortPersons1() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        // TODO: Sorter array af personer med quickSort

        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortPersons2() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        // TODO: Sorter array af personer med Arrays.sort

        System.out.println("Efter sortering: " + Arrays.toString(arr));

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

    }


}
