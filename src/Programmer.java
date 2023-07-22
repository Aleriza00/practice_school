public class Programmer {
    private String name;
    private int age;
    private String direction;

    public Programmer(String name, int age, String direction) {
        this.name = name;
        this.age = age;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void languageCode(){
        System.out.println(" Coding language : JAVA");
    }
    public  void languageCode(String direction){
        System.out.println(direction + " Coding language : JAVA");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name  +
                "\n age=" + age +
                "\n direction='" + direction  +
                '}';
    }
}
