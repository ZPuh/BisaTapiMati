public class SantasNaughtyList {

    public static void main(String[] args) {
        List<String> santasList = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> children = Arrays.asList("Alice", "bob", "Alice", "Charlie", "bob", "alice", "David");

        List<String> result = findChildren(santasList, children);
        System.out.println(result);
    }

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        // Set untuk menyimpan nama yang unik yang ada di SantaList
        Set<String> set = new HashSet<>();
        // Iterasi setiap element Children
        for (String s : children) {
            // Jika Children ada di santasList, tambahkan ke Set
            if (santasList.contains(s)) {
                set.add(s);
            }
        }
        // Konversi Set ke List untuk pengurutan
        List<String> list = new ArrayList<>(set);
        // Urutkan list secara alfabet
        Collections.sort(list);
        // Kembalikan list yang telah diurutkan
        return list;
    }

}
