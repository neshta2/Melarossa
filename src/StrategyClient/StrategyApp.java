package StrategyClient;

public class StrategyApp {
    public static void main(String[] args) {
        Sorter sortStrategy = new Sorter();

        int[] arr0={1,3,2,1};//Сортировка выбором
        sortStrategy.sortSrategy(new SelectionSort());
        sortStrategy.execute(arr0);

        int[] arr1={3,-8,2,0,33,1,3,2}; //Сортировка пузырьком
        sortStrategy.sortSrategy(new BabbleSort());
        sortStrategy.execute(arr1);

        /*int[] arr2={11,4,2,7,8,54};
        sortStrategy.setSrategy(new InsertingSort());
        sortStrategy.executeStrategy(arr2);
        */
    }

}

interface Sorting {
    void sort(int[] arr);
}

