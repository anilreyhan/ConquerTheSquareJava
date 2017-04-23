
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

class Preferences {

    //Defining the colors.
    Color blue = new Color(67, 174, 238);    //43aeee
    Color orange = new Color(254, 191, 120); //febf78
    Color green = new Color(158, 224, 98);   //9ee062
    Color red = new Color(252, 97, 98);      //fc6162
    Color background = new Color(102, 102, 102);
    Color white = new Color(255, 255, 255);
    Color black = new Color(0, 0, 0);

    final int canvasWidth = 600;
    final int canvasHeight = 600;
    int boxWidth = 20;
    int boxHeight = 20;
    int gameMode = 0;
    int boxSize = 20;
    int players = 0;
    int turn = 1;
    int dieCount = 0;
    int blueScore = 0;
    int greenScore = 0;
    int orangeScore = 0;
    int redScore = 0;
    boolean bluePlayer = true;
    boolean greenPlayer = true;
    boolean orangePlayer = true;
    boolean redPlayer = true;

    ArrayList<String> gameMoves = new ArrayList<>();


    Font boxFont = new Font("TAHOMA", Font.PLAIN, 9);
    Font tipFont = new Font("Ubuntu", Font.ITALIC, 18);
    Font scoresFont = new Font("Ubuntu", Font.PLAIN, 30);


    ImageIcon banner = new ImageIcon("Files/banner.png");


    ImageIcon twoPlayers = new ImageIcon("Files/2.png");
    ImageIcon fourPlayers = new ImageIcon("Files/4.png");
    ImageIcon twoPlayersSelected = new ImageIcon("Files/click2.png");
    ImageIcon fourPlayersSelected = new ImageIcon("Files/click4.png");


    ImageIcon tenIcon = new ImageIcon("Files/ten.png");
    ImageIcon twentyIcon = new ImageIcon("Files/twenty.png");
    ImageIcon thirtyIcon = new ImageIcon("Files/thirty.png");
    ImageIcon tenSelectedIcon = new ImageIcon("Files/selectedTen.png");
    ImageIcon twentySelectedIcon = new ImageIcon("Files/selectedTwenty.png");
    ImageIcon thirtySelectedIcon = new ImageIcon("Files/selectedThirty.png");


    ImageIcon startIcon = new ImageIcon("Files/start.png");
    ImageIcon startIconRollover = new ImageIcon("Files/startRollover.png");
    ImageIcon howToIcon = new ImageIcon("Files/howTo.png");
    ImageIcon howToIconRollover = new ImageIcon("Files/howToRollover.png");
    ImageIcon bannerHowTo = new ImageIcon("Files/howToBanner.gif");



    ImageIcon tip1Image = new ImageIcon("Files/tip1.gif");
    ImageIcon tip2Image = new ImageIcon("Files/tip2.gif");
    ImageIcon tip3Image = new ImageIcon("Files/tip3.gif");
    ImageIcon tip4Image = new ImageIcon("Files/tip4.gif");


    ImageIcon movesBanner = new ImageIcon("Files/movesBanner.gif");
    ImageIcon die = new ImageIcon("Files/Die/bR.png");
    ImageIcon rollButton = new ImageIcon("Files/rollButton.png");
    ImageIcon rollButtonRollover = new ImageIcon("Files/rollButtonRollover.gif");

    ImageIcon backToTheMainMenu = new ImageIcon("Files/backToTheMainMenu.png");
    ImageIcon backToTheMainMenuRoll = new ImageIcon("Files/backToTheMainMenuRoll.png");
    File animationCodes = new File("Files/Anim.txt");


}
