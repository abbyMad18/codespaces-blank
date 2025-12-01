/**

     * Searches the specified array of objects using a binary search

     * algorithm.

     *

     * @param data   the array to be searched

     * @param min    the index of the last possible location of the target.

     * @param max   the index of the first possible location of the target.

     * @param target the element being searched for 

     * @return       true if the desired element is found

     */

    public static <T extends Comparable<T>>  

        boolean binarySearch(T[] data, int min, int max, T target){
            //base case
            if(min == target || max == target){
                System.out.println("found");
                return true;
            }
            //greater than half
            int half = (data.length-1)/2;
            if(target > data[half]){
                min = half;
                binarySearch(T[] data, half, max, target);
            }
            //less than half
            if(target < data[half]){
                min = half;
                binarySearch(T[] data, min, half, target);
            }

    {  
