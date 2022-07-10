package Array;

public class Arrayclass {

    public static void main(String[] args) {
        int arrayOne[] = new int[10];
        arrayOne[1] = 120;
        arrayOne[2] = 12;
        arrayOne[3] = 122;
        arrayOne[4] = 123;
        arrayOne[5] = 125;
        arrayOne[6] = 121;
        arrayOne[7] = 128;
        System.out.println(arrayOne[5]);

        for(int i=0;i< arrayOne.length;i++){
            System.out.println(arrayOne[i]);
        }
  int arrayTwo[] = {10,20,30,40,50};
        System.out.println("Size of array "+arrayTwo.length);


    }


    
}
