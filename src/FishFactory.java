public class FishFactory {
    public static Fish creatFish() {
        Gender gender = creatGender();
        int age = RandomUtil.getRandom(10, 15);
        int x = RandomUtil.getRandom(Aquarium.width + 1);
        int y = RandomUtil.getRandom(Aquarium.height + 1);
        return new Fish(gender, age, x, y);
    }

    public static Gender creatGender() {
        return RandomUtil.getRandom(2) == 0 ? Gender.FEMALE : Gender.MALE;
    }
}
