import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipPanel extends JPanel {
    public static final int TIP1 = 1;
    public static final int TIP2 = 2;
    public static final int TIP3 = 3;
    public static final int TIP4 = 4;
    private int type = 1;

    Preferences preferencesPointerTipPanel;


    private final int COMPONENT_X=10;
    private final int COMPONENT_Y=5;
    private final int COMPONENT_WIDTH=532;
    private final int COMPONENT_HEIGHT=420;

    public TipPanel(int type, Preferences _preferences){
        preferencesPointerTipPanel=_preferences;
        this.type = type;
        setBackground(_preferences.background);
        setLayout(null);


        switch (type){
            case TIP1:
                JLabel tip1Label = new JLabel(preferencesPointerTipPanel.tip1Image);

                tip1Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);
                JTextArea tip1Text = new JTextArea("\n\n   1)   It is a turn based game\n" +
                        "    players roll the die in every turn.. ");



                tip1Text.setBounds(COMPONENT_X,COMPONENT_Y+tip1Label.getHeight(),COMPONENT_WIDTH,COMPONENT_HEIGHT-260);
                tip1Text.setBackground(_preferences.background);
                tip1Text.setForeground(Color.WHITE);
                tip1Text.setEditable(false);
                tip1Text.setFont(preferencesPointerTipPanel.tipFont);
                add(tip1Label);
                add(tip1Text);

                break;


            case TIP2:
                JLabel tip2Label = new JLabel(preferencesPointerTipPanel.tip2Image);
                tip2Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);
                JTextArea tip2Text = new JTextArea("\n\n   2)   ..and move according to the number\n" +
                        "   of die");

                tip2Text.setBounds(COMPONENT_X,COMPONENT_Y+tip2Label.getHeight(),COMPONENT_WIDTH,COMPONENT_HEIGHT-260);
                tip2Text.setBackground(_preferences.background);
                tip2Text.setForeground(Color.WHITE);
                tip2Text.setEditable(false);
                tip2Text.setFont(preferencesPointerTipPanel.tipFont);
                add(tip2Label);
                add(tip2Text);

                break;
            case TIP3:
                JLabel tip3Label = new JLabel(preferencesPointerTipPanel.tip3Image);
                tip3Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);
                JTextArea tip3Text = new JTextArea("\n\n   3)   Players can gain ground from their\n" +
                        "   fields to the next field by going left, right, up or down");

                tip3Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);


                tip3Text.setBounds(COMPONENT_X,COMPONENT_Y+tip3Label.getHeight(),COMPONENT_WIDTH,COMPONENT_HEIGHT-260);
                tip3Text.setBackground(_preferences.background);
                tip3Text.setForeground(Color.WHITE);
                tip3Text.setEditable(false);
                tip3Text.setFont(preferencesPointerTipPanel.tipFont);
                add(tip3Label);
                add(tip3Text);

                break;

            case TIP4:
                JLabel tip4Label = new JLabel(preferencesPointerTipPanel.tip4Image);
                tip4Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);
                JTextArea tip4Text = new JTextArea("\n\n   4)   Players cannot conquer another players field\n" +
                        "   Players can only conquer lordless fields");


                tip4Label.setBounds(COMPONENT_X,COMPONENT_Y,COMPONENT_WIDTH,250);
                tip4Label.setBackground(Color.black);

                tip4Text.setBounds(COMPONENT_X,COMPONENT_Y+tip4Label.getHeight(),COMPONENT_WIDTH,COMPONENT_HEIGHT-260);
                tip4Text.setBackground(_preferences.background);
                tip4Text.setForeground(Color.WHITE);
                tip4Text.setEditable(false);
                tip4Text.setFont(preferencesPointerTipPanel.tipFont);
                add(tip4Label);
                add(tip4Text);

                break;


        }

    }


    protected void paintComponent(Graphics g){

        super.paintComponent(g);


        switch (type){
            case TIP1:
                g.setColor(preferencesPointerTipPanel.blue);
                g.drawRoundRect(0,0,550,425, 25,25);
                break;
            case TIP2:
                g.setColor(preferencesPointerTipPanel.green);
                g.drawRoundRect(0,0,550,425, 25,25);
                break;
            case TIP3:
                g.setColor(preferencesPointerTipPanel.orange);
                g.drawRoundRect(0,0,550,425, 25,25);
                break;
            case TIP4:
                g.setColor(preferencesPointerTipPanel.red);
                g.drawRoundRect(0,0,550,425, 25,25);
                break;
        }
    }
}
