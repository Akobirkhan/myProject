import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Aquarium {
    public static int width = 5; // x axis
    public static int height = 5; // y axis
    private List<Fish> fishList = new LinkedList<>();
    public void start(){
        int fishCount = RandomUtil.getRandom(5,  10);
        for (int i = 0; i < fishCount; i ++){
            Fish fish = FishFactory.creatFish();
            fish.start();
            fishList.add(fish);

        }
        System.out.println(fishCount);
        System.out.println(fishList);
    }

}
