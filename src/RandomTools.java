public class RandomTools {
    public static float pick(float[] choices){
        return choices[(int)Math.floor(Math.random() * choices.length)];
    }

    public static float randomLength(){
        return pick(new float []{1, 2, 5, 10, 15, 20});
    }
}
