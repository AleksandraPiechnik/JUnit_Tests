package Exercise5;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import java.util.Random;


public class Exercise5Test {

    Random rand = new Random();
    Exercise5 example=new Exercise5();

    @Test
    public void BubbleSortTimeOut() {
        int[] realisticArray = new int[10000];
        for(int i = 0;i< 10000;i++)realisticArray[i]=rand.nextInt(10000);
        Assertions.assertTimeout(Duration.ofMillis(500), () -> {example.bubbleSort(realisticArray);});
    }

    @Test
    public void CombSortTimeOut()
    {
        int[] realisticArray = new int[10000];
        for(int i = 0;i< 10000;i++)realisticArray[i]=rand.nextInt(10000);
        Assertions.assertTimeout(Duration.ofMillis(500), () -> {example.combSort(realisticArray);});
    }

    @Test
    public void HeapSortTimeOut()
    {
        int[] realisticArray = new int[10000];
        for(int i = 0;i< 10000;i++)realisticArray[i]=rand.nextInt(10000);
        Assertions.assertTimeout(Duration.ofMillis(500), () -> {example.heapSort(realisticArray);});
    }
    @Test
    public void MergeSortTimeOut()
    {
        int[] realisticArray = new int[10000];
        for(int i = 0;i< 10000;i++)realisticArray[i]=rand.nextInt(10000);
        Assertions.assertTimeout(Duration.ofMillis(500), () -> {example.mergeSort(realisticArray,0,9999);});
    }
    @Test
    public void QuickSortTimeOut()
    {
        int[] realisticArray = new int[10000];
        for(int i = 0;i< 10000;i++)realisticArray[i]=rand.nextInt(10000);
        Assertions.assertTimeout(Duration.ofMillis(500), () -> {example.quickSort(realisticArray,0,9999);});
    }

}