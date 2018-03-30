package video_game;

import java.awt.Polygon;

public class Rock extends Polygon{

    int uLeftXpos, uLeftYPos;

    int xDirection = 1;
    int yDirection = 1;

    int width = GameBoard.boardWidth;
    int height = GameBoard.boardHeight;

    int[] polyXArray, polyYArray;

    // here these points make polygon centered at origin
    public static int[] sPolyXArray = {10, 17, 26, 34, 27, 36, 26, 14, 8, 1, 5, 1, 10};
    public static int[] sPolyYArray = {0, 5, 1,8,13,20,31,28,31,22,16,7,0};

    public Rock(int[] polyXArray, int[] polyYArray, int pointsInPoly, int randomStartXPos, int randomStartYPos){
        super(polyXArray, polyYArray, pointsInPoly);

        this.xDirection = (int) (Math.random() * 4 + 1);
        this.yDirection = (int) (Math.random() * 4 + 1);

        this.uLeftXpos = randomStartXPos;
        this.uLeftYPos = randomStartYPos;
    }

    public void move(){
        int uLeftXpos = super.xpoints[0];
        int uLeftYpos = super.ypoints[0];

        if (uLeftXpos < 0 || ((uLeftXpos + 25) > width)) 
            xDirection = -xDirection;
        
        if (uLeftYpos < 0 || ((uLeftYpos + 50) > height))
            yDirection = -yDirection;

         for (int i=0 ; i<super.xpoints.length ; i++){
             super.xpoints[i] += xDirection;
             super.ypoints[i] += yDirection;
         }   
    }

    public static int[] getPolyXArray(int randomStartXPos){
        int[] tempPolyXArray = (int[]) sPolyXArray.clone(); 

        for (int i=0 ; i<tempPolyXArray.length ; i++) {
            tempPolyXArray[i] += randomStartXPos;
        }
        return tempPolyXArray;
    }

    public static int[] getPolyYArray(int randomStartYPos){
        int[] tempPolyYArray = (int[]) sPolyYArray.clone(); 

        for (int i=0 ; i<tempPolyYArray.length ; i++) {
            tempPolyYArray[i] += randomStartYPos;
        }
        return tempPolyYArray;
    }
}