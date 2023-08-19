public class Skeleton extends Boss {
    private int arrow ;

    public Skeleton(String names, int hp, int attack, Weapon weapon , int arrow) {
        super(names, hp, attack, weapon);
        this.arrow = arrow;
    }
    public String printInfo(){
        return super.info() + " Arrow count " + getArrow();
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public int getArrow() {
        return arrow;
    }
}
