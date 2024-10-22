import java.util.Scanner;
public class days051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dadu = sc.nextInt();
        int kartu = sc.nextInt();
        switch (dadu) {
            case 1, 2:
                switch (kartu) {
                    case 1, 2, 3, 4, 5:
                        System.out.println("Fireball");
                        break;
                    case 6, 7, 8, 9, 10:
                        System.out.println("Lightning Bolt");
                        break;
                    case 11, 12, 13:
                        System.out.println("Teleportation");
                        break;
                }
                break;
            case 3, 4:
                switch (kartu) {
                    case 1, 2, 3:
                        System.out.println("Ice Shard");
                        break;
                    case 4, 5, 6, 7, 8:
                        System.out.println("Wind Blast");
                        break;
                    case 9, 10, 11, 12, 13:
                        System.out.println("Earthquake");
                        break;
                }
                break;
            case 5, 6:
                switch (kartu) {
                    case 1, 2, 3, 4, 5, 6, 7:
                        System.out.println("Water Wave");
                        break;
                    case 8, 9, 10, 11, 12, 13:
                        System.out.println("Stone Wall");
                        break;
                }
                break;
        }}}
