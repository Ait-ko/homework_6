public class GameEntity {
    private int hp ;
    private int attack ;
    private String names ;

    public GameEntity(String names, int hp, int attack) {
        super();
        this.names = names;
        this.attack = attack;
        this.hp = hp ;
    }



        public int getHp () {
            return hp;
        }

        public int getAttack () {
            return attack;
        }
        public void setHp ( int hp){
            this.hp = hp;
        }

        public void setAttack ( int attack){
            this.attack = attack;
        }

        public String getNames () {
            return names;
        }

        public void setNames (String names){
            this.names = names;
        }

    }