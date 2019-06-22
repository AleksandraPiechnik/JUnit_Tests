package Exercise4;

public class Exercise4 {

    public int[]solution(float[] arr, float target)
    {
        float [] a= arr.clone();
        int[]results={-1,-1};
        heapSort(a); //tu zlozonosc n log  n
        for(int i=0;i<a.length;i++) // tu zlozonosc n logn
        {
            float complement=target-a[i];
            int index2=runBinarySearchIteratively(a,complement,i+1,a.length-1);
            if(index2!=-1)
            {
                for(int j=0;j<a.length;j++) // tu zlozonosc n
                {
                    if(arr[j]==a[index2]) results[0]=j;
                    if(arr[j]==a[i]) results[1]=j;
                }
            }
        }
        // razem zlozonosc nlog n + n log n + n = 2nlogn +n <n^2
        try {
            if (results[0] == -1 && results[1] == -1) throw  new WrongIndexException();
        }
        catch(WrongIndexException e)
        {
            System.out.println("Solution doesnt exist");
        }
        return results;
    }
    public void heapify(float arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            float swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public void heapSort(float arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            float temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public int runBinarySearchIteratively( float[] sortedArray, float key, int low, int high) {

        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
