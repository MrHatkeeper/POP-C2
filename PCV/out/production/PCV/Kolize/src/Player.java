public class Player {
    Entity status;
    int height;
    int width;
    int poziceX;
    int poziceY;

    public Player(int x, int y, Entity stat, int height, int width){
        height = height;
        width = width;
        poziceX = x;
        poziceY = y;
        Entity status = stat;
    }


    public boolean isColliding(Player entity) {
        return !(this.poziceX + this.width < entity.poziceX ||  this.poziceX > entity.poziceX + entity.width ||  this.poziceY + this.height < entity.poziceY || this.poziceY > entity.poziceY + entity.height);
    }
}
