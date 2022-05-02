package kea.spring2022.sorting;

public class QuickSortString {
    public String[] sort(String[] array) {                // NOTE: Datatype[]
        quicksort(array,0, array.length-1);
        return array;
    }

    private void quicksort(String[] a, int p, int r) { // NOTE: Datatype[]
        if( p < r ) {
            int i = p-1;
            for(int j=p; j<r; j++) {
                if(a[j].compareTo(a[r]) < 0) {                  // NOTE: Datatype sammenligning
                    i++;
                    String b = a[i];                   // NOTE: Datatype
                    a[i] = a[j];
                    a[j] = b;
                }
            }
            String b = a[i+1];                         // NOTE: Datatype
            a[i+1] = a[r];
            a[r] = b;

            quicksort(a,p,i);
            quicksort(a,i+2,r);
        }
    }
}
