import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Sorts {//implements Comparable<Integer> {
    
    //public int compareTo(Integer i){
        
    //}
    public static Integer[] gnomeSort(Integer num[]){
        int c = 0;
        Integer temp = 0;
        while (c < num.length){
            if (c == 0){
                c = c +1;
            }
            if (num[c].compareTo(num[c-1]) >= 0){
                c = c +1;
            } else
            {
              temp = num[c];
              num[c] = num[c-1];
              num[c-1] = temp;
              c = c -1;
            }
        }
        return num;
    }
    
public static void merge(Integer num[], int iz, int me, int de){
        int t1 = me - iz + 1;
        int t2 = de - me;
        Integer L[] = new Integer [t1];
        Integer R[] = new Integer [t2];

        for (int i=0; i<t1; ++i)
            L[i] = num[iz + i];
        for (int j=0; j<t2; ++j)
            R[j] = num[me + 1+ j];

        int i = 0, j = 0;
 
        int k = iz;
        while (i < t1 && j < t2)
        {
            if (L[i].compareTo(R[j])<=0)
            {
                num[k] = L[i];
                i++;
            }
            else
            {
                num[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < t1)
        {
            num[k] = L[i];
            i++;
            k++;
        }
 
        while (j < t2)
        {
            num[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void mergeSort(Integer[] num, int iz, int de){
        if (iz < de){
            int m = (iz+de)/2;
            mergeSort(num, iz, m);
            mergeSort(num, m+1, de);
            merge(num, iz, m, de);
        }
    }
 
    public int partition(Integer arr[], int left, int right)
    {
          int i = left, j = right;
          int tmp;
          int pivot = arr[(left + right) / 2];
         
          while (i <= j) {
                while (arr[i].compareTo(pivot) < 0)
                      i++;
                while (arr[j].compareTo(pivot) < 0)
                      j--;
                if (i <= j) {
                      tmp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
                      i++;
                      j--;
                }
          };
         
          return i;
    }
    
    public void quickSort(Integer arr[], int left, int right) 
    {
        int index = partition(arr, left, right);
        if (left < index - 1)
              quickSort(arr, left, index - 1);
        if (index < right)
              quickSort(arr, index, right);
  }
    
    public static void main(String[] args){
        
        Integer arr[] = {34,2,10,10,-9};
        Integer ar[] = new Integer[arr.length];
        ar = gnomeSort(arr);
        System.out.println(Arrays.toString(ar));
    }
}
