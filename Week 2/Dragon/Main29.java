
public class Main29 {

    public static void main(String[] args) {

        Dragon29 dragon = new Dragon29(100, 9, 500, 500);

        // Simulasi gerakan dragon
        dragon.printPosition();
        dragon.moveLeft();
        dragon.moveUp();
        dragon.moveRight();
        dragon.moveDown();
        dragon.detectCollision(100,0);
        
        
    }

}
