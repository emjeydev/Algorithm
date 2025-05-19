
public class Person {

    private final String id;
    private final String name;
    private final int age;
    private final String city;

    private Person(String id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static Person fromCsv(String csv) {
        return new  Person(csv.split(",")[0].trim(),
                csv.split(",")[1].trim(), Integer.parseInt(csv.split(",")[3].trim()),
                csv.split(",")[2].trim());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
