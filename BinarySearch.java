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
public class BinarySearch {

    public static <T extends Comparable<T>>

        boolean binarySearch(T[] data, int min, int max, T target) {

            if (data == null) { 
                return false;
            }
            if (min > max) {
                return false;
            }
            int mid = (min + max) / 2;
            if (data[mid].compareTo(target)== 0) return true;
            if (data[mid].compareTo(target) > 0) {
                return binarySearch(data, min, mid - 1, target);
            } else {
                return binarySearch(data, mid + 1, max, target);
            }

        }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Expect true  : " + binarySearch(vals, 0, vals.length-1, 5));
        System.out.println("Expect false : " + binarySearch(vals, 0, vals.length-1, 11));
        System.out.println("Expect true  : " + binarySearch(vals, 0, vals.length-1, 1));
        System.out.println("Expect true  : " + binarySearch(vals, 0, vals.length-1, 10));
    }

}
    


