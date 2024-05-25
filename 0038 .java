package Mei2024;

import java.util.HashMap;
import java.util.Map;

public class Tgl25Resistor {

    /*
Anda diminta untuk menulis sebuah fungsi yang menerima sebuah string yang berisi warna-warna pita pada resistor 
dan mengembalikan string yang menunjukkan nilai resistansi (dalam ohm) dan nilai toleransinya.

Kode Warna Resistor
Setiap resistor memiliki pita warna yang menunjukkan nilai resistansi dan toleransinya. Berikut adalah kode warna dasar resistor:

Hitam: 0
Coklat: 1
Merah: 2
Oranye: 3
Kuning: 4
Hijau: 5
Biru: 6
Ungu: 7
Abu-abu: 8
Putih: 9
Penjelasan Pita Resistor
Setiap resistor memiliki minimal tiga pita warna:

Pita pertama: Digit pertama nilai resistansi.
Pita kedua: Digit kedua nilai resistansi.
Pita ketiga: Faktor pengali (dalam bentuk 10^n).
Resistor juga bisa memiliki pita keempat yang menunjukkan toleransi:

Emas: ±5%
Perak: ±10%
Jika tidak ada pita keempat: ±20%
Contoh Konversi
Misalkan ada resistor dengan pita "kuning ungu hitam":

Kuning (4) sebagai digit pertama.
Ungu (7) sebagai digit kedua.
Hitam (0) sebagai faktor pengali (10^0 = 1).
Jadi, resistansi adalah 47 ohm dengan toleransi 20% (karena tidak ada pita keempat).
Format Hasil
Format string hasil bergantung pada besar nilai resistansi:

Kurang dari 1000 ohm: "<nilai> ohms, <toleransi>%"
1000 hingga kurang dari 1 juta ohm: "<nilai dalam k ohm>k ohms, <toleransi>%"
1 juta ohm atau lebih: "<nilai dalam M ohm>M ohms, <toleransi>%"
Contoh Hasil
"brown black black" menghasilkan "10 ohms, 20%"
"yellow violet red gold" menghasilkan "4.7k ohms, 5%"
"brown black green silver" menghasilkan "1M ohms, 10%"
Tugas Anda
Tulis fungsi bernama resistor_code yang menerima sebuah string berisi warna-warna pita resistor dan mengembalikan string yang menunjukkan nilai resistansi dan toleransinya sesuai dengan format di atas.

Spesifikasi Fungsi
Fungsi menerima satu parameter berupa string colors yang berisi warna-warna pita resistor yang dipisahkan oleh spasi.
Fungsi mengembalikan string yang menunjukkan nilai resistansi dan toleransi sesuai dengan format yang dijelaskan.
     */
    public static void main(String[] args) {
        // Program Resistor
        System.out.println(decodeResistorColors("brown black black"));
        System.out.println(decodeResistorColors("yellow violet brown silver"));
        System.out.println(decodeResistorColors("yellow violet orange gold"));
        System.out.println(decodeResistorColors("red black green gold"));
    }

    public static String decodeResistorColors(String bands) {
        // Peta kode warna untuk digit dan faktor pengali
        Map<String, Integer> colorCodes = new HashMap<>();
        colorCodes.put("black", 0);
        colorCodes.put("brown", 1);
        colorCodes.put("red", 2);
        colorCodes.put("orange", 3);
        colorCodes.put("yellow", 4);
        colorCodes.put("green", 5);
        colorCodes.put("blue", 6);
        colorCodes.put("violet", 7);
        colorCodes.put("gray", 8);
        colorCodes.put("white", 9);

        // Peta kode warna untuk toleransi
        Map<String, Integer> toleranceCodes = new HashMap<>();
        toleranceCodes.put("gold", 5);
        toleranceCodes.put("silver", 10);

        String[] bandsArray = bands.split(" ");
        int firstDigit = colorCodes.get(bandsArray[0]);
        int secondDigit = colorCodes.get(bandsArray[1]);
        int multiplier = (int) Math.pow(10, colorCodes.get(bandsArray[2]));
        int ohms = (firstDigit * 10 + secondDigit) * multiplier;

        int tolerance;
        if (bandsArray.length > 3) {
            tolerance = toleranceCodes.getOrDefault(bandsArray[3], 20);
        } else {
            tolerance = 20;
        }

        String ohmsStr;
        if (ohms >= 1_000_000) {
            ohmsStr = String.format("%.1fM", ohms / 1_000_000.0);
        } else if (ohms >= 1000) {
            ohmsStr = String.format("%.1fk", ohms / 1000.0);
        } else {
            ohmsStr = String.valueOf(ohms);
        }

        // Menghapus ".0" dari hasil jika diperlukan
        if (ohmsStr.contains(".0")) {
            ohmsStr = ohmsStr.replace(".0", "");
        }

        return String.format("%s ohms, %d%%", ohmsStr, tolerance);
    }
}
