package StrategyClient;

import java.util.Arrays;

class BubbleSort implements Sorting{
    public void sort(int[] arr){
        System.out.println("Sort - пузырьком");
        System.out.println("до:\t"+ Arrays.toString(arr));
        for (int barier=arr.length-1;barier>=0;barier--){
            for (int i=0;i<barier;i++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
        }
        System.out.println("после:\t"+Arrays.toString(arr));
    }
}
class SelectionSort implements Sorting{
    public void sort(int[] arr){
        System.out.println("Sort - выборками");
        System.out.println("до:\t"+ Arrays.toString(arr));
        for (int barier=0; barier<arr.length-1; barier++){
            for (int i=barier+1;i<arr.length;i++){
                if(arr[i]<arr[barier]){
                    int tmp=arr[i];
                    arr[i]=arr[barier];
                    arr[barier]=tmp;
                }
            }
        }
        System.out.println("после:\t"+Arrays.toString(arr));
    }
}
/*class InsertingSort implements Sorting{
    public void sort(int[] arr){
        System.out.println("Sort - вставками");
        System.out.println("до:\t"+ Arrays.toString(arr));
        for (int barier = 1;barier<arr.length; barier++){
            int index=barier;
            while (index-1>=0&&arr[index]<arr[index-1]){
                int tmp = arr[index];
                arr[index]=arr[index-1];
                arr[index-1]=tmp;
                index--;
            }
        }
}
}

 */