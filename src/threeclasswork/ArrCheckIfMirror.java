package threeclasswork;

public class ArrCheckIfMirror {

    public static void main(String[] args) {
        int[] arr1 = {12,12};
		int[] arr2 = {5};
		int[] arr3 = {7,4,2,4,7};
		int[] arr4 = {-1,2,3,4,5,6};

        System.out.println("arr1 is mirror ? " + isMirror(arr1));
        System.out.println("arr2 is mirror ? " + isMirror(arr2));
        System.out.println("arr3 is mirror ? " + isMirror(arr3));
        System.out.println("arr4 is mirror ? " + isMirror(arr4));
    }

    public static boolean isMirror(int[] arrMirror) {
        int lastIndex = arrMirror.length-1;
        for (int i = 0; i < arrMirror.length; i++) {
            if (arrMirror[i] != arrMirror[lastIndex-i]) {
                return false;
            }
        }
        return true;
    }
}
