package bairesdev;

public class RepeatedElement {

public int repeatedTimes( int[] array, int elem ){
    int repeated = 0;

        for ( int i = 0 ; i < array.length ; i++ ) {
            if ( array[i] == elem ) {
                repeated++;
            }
        }
    return repeated;
}

    public static void main( String[] args ){
        int[] arr = {2,3,4,3,2,1};
        int element = 1;

        RepeatedElement re = new RepeatedElement();
        System.out.println( re.repeatedTimes(arr, element) );

    }
}