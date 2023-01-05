public class OrdemInversa {
    public static void main(String[] args){

        int[] meuArray = {-5, -6, 15, 50, 8, 4};

        System.out.print("Array: ");
        int count = 0;

        while(count < meuArray.length){
            System.out.print(meuArray[count] + " ");
            count++;
        }

        System.out.print("\nMeuArray: ");
        for(int i = (meuArray.length -1); i >= 0; i--){
            System.out.print(meuArray[i] + " ");
        }
    }
    
}
