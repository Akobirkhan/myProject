public class Fish extends Thread {
    private Gender gender;
    private int age;
    private int x;
    private int y;

    public Fish(Gender gender, int age, int x, int y) {
        this.gender = gender;
        this.age = age;
        this.x = x;
        this.y = y;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {

    }

    @Override
    public void run() {
        while (age != 0) {
            move();
            age--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gender=" + gender +
                ", age=" + age +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
