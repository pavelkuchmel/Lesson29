import java.util.Objects;
import java.util.Random;
public class HeavyBox implements Comparable{
    private int weight;

    public HeavyBox(){
        Random rdm = new Random();
        weight = rdm.nextInt(9999) + 1;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Weight=" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public int compareTo(Object o) {
        if (weight > ((HeavyBox) o).getWeight()) return 1;
        else if (weight < ((HeavyBox) o).getWeight()) return -1;
        else return 0;
    }
}
