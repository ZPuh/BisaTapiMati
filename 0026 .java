package Mei2024;
/*
Jika harga pizza kurang dari €5, Michael membayar seluruhnya. Contoh: untuk pizza seharga €4, Michael membayar €4.
Jika harga pizza €5 atau lebih, Kate berkontribusi 1/3 dari harga pizza, tetapi maksimal €10. Michael membayar sisanya.

Contoh:

Harga pizza €9: Kate membayar €3, Michael membayar €6.
Harga pizza €30: Kate membayar maksimal €10, Michael membayar €20.
Dengan informasi ini, kita bisa menghitung berapa yang akan dibayar oleh Michael berdasarkan harga pizza yang diberikan.
*/

public class Tgl16PizzaPayments {

    public static void main(String[] args) {
        System.out.println(michaelPays(15));
        System.out.println(michaelPays(4));
        System.out.println(michaelPays(30));
        System.out.println(michaelPays(80));
        System.out.println(michaelPays(22));
        System.out.println(michaelPays(5.9181));
        System.out.println(michaelPays(28.783));
        System.out.println(michaelPays(4.325));
    }

    public static double michaelPays(double cost) {
        if (cost <= 5) { // Jika Harga dibawah 5 
            return Math.round(cost * 100.0) / 100.0;
        } else { // Jika Harga Diatas 5
            double kate = cost / 3.0;
            if (kate > 10) { // Jika > 10 
                kate = 10;
            }
            return Math.round((cost - kate) * 100.0) / 100.0;
        }
    }
}
