public class Basic13 {

    public void PrintAllInts1to255(){
        // TODO: Print all the integers from 1 to 255.
    }

    public void PrintInts0to255AndSum(){
        // TODO: Print integers from 0 to 255, and with each integer print the sum so far.
    }

    public void FindAndPrintLargest(int[] intArray){
        // TODO: Given an array, find and print its largest element.
    }

//    public int[] CreateArrayOfOdds1to255(){
//        // TODO: Create an array with all the odd integers between 1 and 255 (inclusive).
//    }

    public void PrintCountGreaterThanY(int[] intArray, int y){
        // TODO: Given an array and a value Y, count and print the number of array values greater than Y.
    }

    public void PrintMaxMinAvg(int[] intArray){
        // TODO: Given an array, print the max, min and average values for that array.
    }

    public Object[] ReplaceWithDojo(Object[] objArray){
        // TODO: Replace any negative array values with 'Dojo'.
        for(int i = 0; i < objArray.length; i++){
            if((int) objArray[i] < 0){
                objArray[i] = "Dojo";
            }
        }
        return objArray;
    }

// TODO: Print all odd integers from 1 to 255.
// TODO: Iterate through a given array, printing each value.
// TODO: Analyze an array’s values and print the average
// TODO: Square each value in a given array, returning that same array with changed values
// TODO: Return the given array, after setting any negative values to zero.
// TODO: Given an array, move all values forward by one index, dropping the first and leaving a '0' value at the end.

}