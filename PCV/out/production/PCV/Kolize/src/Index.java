public class Index {
    public static void main(String[] args) {
        Player player = new Player(0,0, Entity.player, 3,2);
        Player enemy = new Player(0,0, Entity.enemy,6,4);
        Player neutral = new Player(6,4, Entity.neutral,3,2);
        Player allied = new Player(3,0, Entity.allied,3,2);


        Player[] objekty = {enemy,neutral,allied};

        for(int i = 0; i < objekty.length; i++){
            System.out.println(player.isColliding(objekty[i]));
        }
    }
}
