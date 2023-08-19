public class Main {
    public static void main(String[] args) {
        Weapon sword = new  Weapon(Weapon_Type.Cold_Weapon , "Excalibur");
        Weapon bow = new Weapon(Weapon_Type.Bullet_Weapon, "Bow");
        Weapon grenade = new Weapon(Weapon_Type.Bomb_Weapon, "Bomb");

        Boss boss = new Boss ("Boss", 100, 50, sword) {
        };
        System.out.println(boss.getNames() + " Hp " + boss.getHp() + " Attack "+ boss.getAttack()+
                " Weapon "+ boss.getWeapon().getName());
        System.out.println(boss.info());
        Skeleton skeleton1 = new Skeleton("Hunter1",60,25, bow, 55);
        Skeleton skeleton2 = new Skeleton("Hunter2",50,35, grenade, 30);
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}