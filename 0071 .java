package M1;

public class Latihan5 {

    public static void main(String[] args) {
        //menghitung berapa banyak elemen dari array sizes yang dapat ditampung 
        //dalam kapasitas hd (hard drive) sebelum melebihi batas kapasitas tersebut.
        int[] data = {4, 4, 4, 3, 3};
        int memori = 11;

        System.out.println(save(data, memori));
    }

    public static int save(int[] sizes, int hd) {
        int count = 0;
        int usedSpace = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (usedSpace + sizes[i] <= hd) {
                usedSpace += sizes[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
