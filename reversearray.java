public class reversearray {
     public static void main (String[] args){
        int[] arr={14,34,25,12,22,90,11};
    int left = 0,
    right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    for(int num:arr){
        System.out.print(num+" ");
    }
}}