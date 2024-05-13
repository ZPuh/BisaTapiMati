package Mei2024;

public class menanamTanaman {

    /*
Diberikan tiga parameter: upSpeed, downSpeed, dan desiredHeight.

- upSpeed adalah jumlah kenaikan tinggi tanaman setiap hari.
- downSpeed adalah jumlah penurunan tinggi tanaman setiap malam.
- desiredHeight adalah tinggi yang diinginkan untuk tanaman tersebut.
    
Kita diminta untuk menghitung berapa hari yang dibutuhkan agar tinggi tanaman mencapai atau melebihi desiredHeight.

Contoh, jika upSpeed = 100, downSpeed = 10, dan desiredHeight = 910, 
maka pada hari pertama tanaman tumbuh 100 meter menjadi 100 meter, 
kemudian pada malam harinya turun 10 meter menjadi 90 meter. 
Begitu seterusnya sampai pada hari ke-10, tinggi tanaman mencapai atau melebihi 910 meter.

Jadi, tugas kita adalah menemukan hari keberapa tanaman mencapai atau melebihi desiredHeight berdasarkan pertumbuhan harian dan penurunan malamnya.

     */
    public static void main(String[] args) {
        //coding and coding..
        System.out.println(growingPlant(100, 10, 910)); // 10
        System.out.println(growingPlant(10, 9, 4)); // 1
    }

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int day = 0;
        int meters = 0;
        while (meters < desiredHeight) {
            meters += upSpeed;
            day++;
            if (meters >= desiredHeight) {
                break;
            }
            meters -= downSpeed;
        }
        return day;
    }

}
