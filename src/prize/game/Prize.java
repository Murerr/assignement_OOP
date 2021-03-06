package prize.game;

public class Prize {

    private String prize;
    private int weight;
    private String name;

    public Prize(String prize, int weight, String name) {
        this.prize = prize;
        this.weight = weight;
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PrizeGame{" +
                "prize='" + prize + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}'+'\n';
    }

}
