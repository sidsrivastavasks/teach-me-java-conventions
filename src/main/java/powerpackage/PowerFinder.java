package powerpackage;

public class PowerFinder {
    public static int getPowerOf(int base, int power) {
        if(power==0){
            return 1;
        }
        int value = 1;
        System.out.println("working");
        while(power>0){
            value *= base;
            power -= 1;
        }
        return value;
    }
}
