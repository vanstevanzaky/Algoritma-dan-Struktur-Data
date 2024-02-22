public class Dragon29 {

    int x;
    int y;
    int width;
    int height;

    public Dragon29(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    void printPosition(){
        System.out.println("Position x = "+ x + "\nPositin y = "+ y + "\nposition width = "+width+"\nPosition height = "+height);
    }

    void moveLeft() {
        x--;
       
    }

     void moveRight() {
        x++;
      
    }

     void moveUp() {
        y--;
     
    }

     void moveDown() {
        y++;
        
    }

      void detectCollision(int x, int y) {
        if (x<0) {
            System.out.println("Game Over");
            
        } else if (x>width) {
            System.out.println("Game Over");
            
        } else if (y < 0) {
            System.out.println("Game Over");
            
        } else if (y>height) {
            System.out.println("Game Over");
            
        }
        System.out.println("Collision detected at position (" + x + ", " + y + ")! Game Over!");
      }

}
