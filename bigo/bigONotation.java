public class bigONotation
{
    private  int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;
    
    // constructor:
    bigONotation(int size)
    {
        System.out.println("bigONotation - constructor called: " + size);
        arraySize = size;
        theArray = new int[size];
    }

    // O(1)
    public void addItemToArray(int newItem)
    {
        theArray[itemsInArray++] = newItem;
    }

    // O(N)
    public void linearSearchForValue(int value)
    {
        boolean valueInArray = false;
        String indexWithValue = "";
        startTime = System.currentTimeMillis();
        
        for (int i = 0; i < arraySize; i++)
        {
            if (theArray[i] == value)
                {
                    valueInArray = true;
                    indexWithValue += i + " ";
                }
        }

        System.out.println("Value Found: " + indexWithValue);
        endTime = System.currentTimeMillis();
        System.out.println("Search took " + (endTime - startTime) + " ms");
        //theArray[itemsInArray++] = newItem;
    }
    
    // O(N^2) 
    public void bubbleSort()
    {
        startTime = System.currentTimeMillis();

        for (int i = arraySize - 1; i > 1; i--)
        {
            for (int j = 0; j<i; j++)
            {
                if (theArray[j] > theArray[j + 1])
                {
                    swapValues(j, j+1);
                }
            }
        }
        
        
        endTime = System.currentTimeMillis();
        System.out.println("bubbleSort took " + (endTime - startTime) + " ms");
        
    }

    //O (log N)
    public void binarySearchForValue()
    {
        startTime = System.currentTimeMillis();

        endTime = System.currentTimeMillis();
        System.out.println("binarySearch took " + (endTime - startTime) + " ms");
    }

    public void genrateRandomArray()
    {
        for (int i = 0; i < arraySize; i++)
        {
            theArray[i] = (int) (Math.random() * 1000) + 100;
        }
    }

    public void printArray()
    {
        for (int i = 0; i < arraySize; i++)
        {
            System.out.print (theArray[i] + ", ");
        }
    }

    public void swapValues(int indexOne, int indexTwo) 
    {
	    int temp = theArray[indexOne];
	    theArray[indexOne] = theArray[indexTwo];
	    theArray[indexTwo] = temp;
	}    

    public static void main (String [] args)  
    {
        System.out.println("Hello, this is Big O notation test drive!");
        bigONotation testAlgo2 = new bigONotation(10000);
        testAlgo2.genrateRandomArray();
        testAlgo2.bubbleSort();

        bigONotation testAlgo3 = new bigONotation(100000);
        testAlgo3.genrateRandomArray();
        testAlgo3.bubbleSort();

        //testAlgo2.printArray();
        //testAlgo2.printArray();
        // testAlgo2.linearSearchForValue(666);
    }

}
