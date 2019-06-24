package ArrayExample;
import java.util.ArrayList;
import java.util.List;


public class QuickSortImproved {
    public static int[] sort(int[] array,int lower, int higher, int pivotValue, List<Integer>pivots){
        int[] hold=new int[array.length];
        for (int i=0;i<array.length;i++){
            hold[i]=array[i];
        }
        int fromEnd=1;
        int fromBeginning=0;

        for (int index=lower;index<=higher;index++){

            if (array[index] < pivotValue) {
                hold[fromBeginning+lower] = array[index];
                fromBeginning++;
            } else {
                hold[higher+1 - fromEnd] = array[index];
                fromEnd++;
            }
        }
        print(hold,fromBeginning+lower,pivots);
        if (fromBeginning+lower<array.length){
            pivots.add(fromBeginning+lower);
        }
        else {
            pivots.add(array.length-1);
        }

        return hold;
    }


    public static void print(int[] array, int pivotPosition, List<Integer>pivots){
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        for (int index = 0; index < array.length; index++) {
            boolean ispiv=false;
            if (index == pivotPosition) {
                System.out.print("| ");
                ispiv=true;
            } else{
                int oldi=-1;
                for (int i:pivots){
                    if (index==i&&i!=oldi) {
                        System.out.print("o ");
                        ispiv=true;
                        oldi=i;
                    }
                }
            }
            if (ispiv==false){
                System.out.print("- ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] array={7,5,3,8,1,5,3,8,0,2,6,4,8,2,8,5,3,9,0,5,7,4,8,2,8,0,5,3,6,3,1,5,9,2,5,1,8,0,5,6,3,5,9,8,5,0,1,4,2,8,5,3,8,5,3,9,0,7,2,3,5};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println();
        int[] pivotarray={-1,array.length};
        List<Integer> pivotPositionsUnordered = new ArrayList<>();
        pivotPositionsUnordered.add(-1);
        pivotPositionsUnordered.add(array.length);

        for (int iteration=0;iteration<8;iteration++) {
            int exponent=(int)Math.round(Math.pow(2,iteration));

            for (int segment = 0; segment < pivotarray.length - 1; segment++) {
                if (pivotarray[segment+1]>0) {
                    array = sort(array, pivotarray[segment] + 1, pivotarray[segment + 1] - 1, array[pivotarray[segment + 1] - 1], pivotPositionsUnordered);
                }
                else {
                    pivotPositionsUnordered.add(0);
                }
            }
            pivotarray=new int[pivotPositionsUnordered.size()];
            for (int pivno=0;pivno<=exponent;pivno++){
                pivotarray[pivno*2]=pivotPositionsUnordered.get(pivno);
            }
            for (int pivno=exponent+1;pivno<=exponent*2;pivno++) {
                pivotarray[2*(pivno-exponent)-1] = pivotPositionsUnordered.get(pivno);
            }
            for (int pivno=0;pivno<pivotarray.length;pivno++){
                pivotPositionsUnordered.set(pivno,pivotarray[pivno]);
            }
            System.out.println();
        }

    }
}
