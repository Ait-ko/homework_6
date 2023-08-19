public abstract class Boss extends GameEntity{
    private Weapon weapon;
    public Boss (String names, int hp, int attack, Weapon weapon){
        super(names, hp, attack);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon (Weapon weapon) {
        this.weapon = weapon;
    }
    public  String info (){
        return getNames() + " Hp "+ getHp() + " Attack " +getAttack()+ " Weapon " + getWeapon().getName();
    }


}
