package Hash;

public class HashMap_Client {
    public static void main(String[] args) {
        HashMap_Implementation map =new HashMap_Implementation();
        map.put("Raja", 77);
        map.put("punit", 85);
        map.put("Shivani", 59);
        map.put("Shivan", 55);
        map.put("Saytam", 89);
        map.put("Shiva", 79);
        map.put("Shivam", 99);

        System.out.println(map.containsKey("Shivam"));
        System.out.println(map.containsKey("raj"));
        System.out.println(map.get("Raja"));
        System.out.println(map);
        System.out.println(map.remove("punit"));
        System.out.println(map);

    }
}
