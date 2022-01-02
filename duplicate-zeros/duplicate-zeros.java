class Solution {
    public void duplicateZeros(int[] arr) {
        int countOfZeros = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) countOfZeros++;  
            // Counting zeros here so that we can know how many shifts we have to do
        }
        // since we are duplicating that means we have to shift the places of numbers after the 0 so that 0's can         // be filled
        // With duplicates we are going to get new array length = original array length + no of zeros 
        // but we have to fit the array by removing overflowed values that means values of indexes that are               //greater than the original array length
        // now we have to copy each value from original array to new array but copy the value twice when you hit 
        // 0
        int originalArrayIndex = arr.length-1;   
        int arrayWithDupZerosIndex = (arr.length+countOfZeros)-1;
        while(originalArrayIndex>=0 && arrayWithDupZerosIndex >=0)
        {
            if(arr[originalArrayIndex] != 0)
            {
                //value is not equal to 0 so we have to copy it only once, before that we have to check if we are
                // at correct index of new array i.e index should be less than array length right
                if(arrayWithDupZerosIndex < arr.length)
                {
                    arr[arrayWithDupZerosIndex] = arr[originalArrayIndex];
                }
            }
            else
            {
                // value is equal to zero
                // still we have to check index of new array i.e index should be less than array length right
                if(arrayWithDupZerosIndex < arr.length)
                {
                    arr[arrayWithDupZerosIndex] = arr[originalArrayIndex];
                }
                //we have to copy it twice since its a zero
                arrayWithDupZerosIndex--; // fill the same value in next index
                if(arrayWithDupZerosIndex < arr.length)
                {
                    arr[arrayWithDupZerosIndex] = arr[originalArrayIndex];
                }
            }
            originalArrayIndex--;
            arrayWithDupZerosIndex--;
        }
    }
}