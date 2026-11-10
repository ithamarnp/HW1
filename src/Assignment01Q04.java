import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int start;
        int stopped=0;
        int[] temp= new int[array.length];
        if (array.length==0){
            return array;
        }
        move = move%array.length;
        if (move<0){
            if (direction=='R'){
                direction = 'L';
                move=-move;
            } else if (direction=='L'){
                direction='R';
                move=-move;
            }
        }
        if (direction=='R'){
            start = array.length-move;
        } else if (direction=='L'){
            start = move;
        } else{
            return array;
        }
        for (int i =0;start+i<array.length;i++){
            temp[i] = array[start+i];
            stopped= i+1;
        } 
        for (int j=0;j<start;j++){
            temp[stopped+j] = array[j];
        }
        array = temp;
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}