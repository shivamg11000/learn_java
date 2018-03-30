/*
    INCOMPLETE GAME

    javac -d . *
    java videoGame.GameBoard

*/

package video_game;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.util.ArrayList;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GameBoard extends JFrame{
     
    public static int boardWidth = 700;
    public static int boardHeight = 700;

    public static void main(String[] args) {
        new GameBoard();
    }

    public GameBoard(){
        this.setSize(boardWidth, boardHeight);
        this.setTitle("Java Asteriods");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);

        GameDrawingPanel gamePanel = new GameDrawingPanel(); // draws on the gameBoard or on the frame

        this.add(gamePanel, BorderLayout.CENTER);

        
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);

        executor.scheduleAtFixedRate(new RepaintTheBoard(this), 0L, 20L, TimeUnit.MILLISECONDS); // every 20 sec repaint the board

        this.setVisible(true);
    }
        
}

class RepaintTheBoard implements Runnable{
    GameBoard theBoard;

    public RepaintTheBoard(GameBoard theBoard){
        this.theBoard = theBoard;
    }

    @Override
    public void run() {
        theBoard.repaint();
    }
}



class GameDrawingPanel extends JComponent{
    public ArrayList<Rock> rocks = new ArrayList<Rock>();
    
    // coordinates of the shape of polygon 
    int[] polyXArray = Rock.sPolyXArray;
    int[] polyYArray = Rock.sPolyYArray;

    int width = GameBoard.boardWidth;
    int height = GameBoard.boardHeight;

    public GameDrawingPanel(){

        for (int i=0 ; i < 20 ; i++) {
            int randomStartXPos = (int) (Math.random() * (GameBoard.boardWidth - 40) + 1);
            int randomStartYPos = (int) (Math.random() * (GameBoard.boardHeight - 40) + 1);

            rocks.add(new Rock(Rock.getPolyXArray(randomStartXPos),
                               Rock.getPolyYArray(randomStartYPos),
                               13, randomStartXPos, randomStartYPos
                               ));

        }
    }

    public void paint(Graphics g){
        Graphics2D graphicSettings = (Graphics2D) g;
        
        graphicSettings.setColor(Color.BLACK);
        graphicSettings.fillRect(0, 0, getWidth(), getHeight());

        graphicSettings.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        graphicSettings.setPaint(Color.WHITE);

        for(Rock rock : rocks) {
            rock.move();
            graphicSettings.draw(rock);
        }
    }
}