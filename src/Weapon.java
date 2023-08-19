public class Weapon {
    private Weapon_Type type;
    private String name ;
    public Weapon (Weapon_Type type , String name){
        this.name = name;
        this.type = type;
    }

    public Weapon_Type getType() {
        return type;
    }
    public String getName(){
        return  name ;
    }
    public void setType(Weapon_Type type) {
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
}
