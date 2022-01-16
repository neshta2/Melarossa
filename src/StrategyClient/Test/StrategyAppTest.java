package StrategyClient.Test;

import StrategyClient.BabbleSort;
import StrategyClient.SelectionSort;
import StrategyClient.Sorter;
import org.junit.Test;



public class StrategyAppTest {

    @Test
    public void main() {
        Sorter sortStrategy = new Sorter();
        int[] arr0={1,3,2,1};//Сортировка выбором
        sortStrategy.sortSrategy(new SelectionSort());
        sortStrategy.execute(arr0);

        int[] arr1={3,-8,2,0,33,1,3,2}; //Сортировка пузырьком
        sortStrategy.sortSrategy(new BabbleSort());
        sortStrategy.execute(arr1);
    }
}