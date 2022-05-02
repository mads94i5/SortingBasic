package kea.spring2022.sorting;

public class QuickSortComparableObject {
    public ComparableObject[] sort(ComparableObject[] array) {                // NOTE: Datatype[]
        quicksort(array,0, array.length-1);
        return array;
    }

    private void quicksort(ComparableObject[] a, int p, int r) { // NOTE: Datatype[]
        if( p < r ) {
            int i = p-1;
            for(int j=p; j<r; j++) {
                if(a[j].sortedBy(a[r])) {                  // NOTE: Datatype sammenligning
                    i++;
                    ComparableObject b = a[i];                   // NOTE: Datatype
                    a[i] = a[j];
                    a[j] = b;
                }
            }
            ComparableObject b = a[i+1];                         // NOTE: Datatype
            a[i+1] = a[r];
            a[r] = b;

            quicksort(a,p,i);
            quicksort(a,i+2,r);
        }
    }
}
