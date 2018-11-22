/**
 * @author Fancyking
 */
public class Human {

    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human() {
        this.name = "nullptr";
        this.age = -1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHuman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Human) {
            return this.age == ((Human) o).age;
        }
        else {
            return false;
        }
    }

    int compareTo(Object o) {
        if (o instanceof Human) {
            if (this.age > ((Human) o).age) {
                return 1;
            }
            else if (this.equals(o)) {
                return 0;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + String.valueOf(this.age);
    }
}
