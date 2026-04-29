
package spel;

import javax.swing.*;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StenSaxPase extends JFrame implements ActionListener{
    
    JLabel spelare = new JLabel("Spelare:");
    JButton stenclient = new JButton("sten");
    JButton stendator = new JButton("sten");
    JButton paseclient = new JButton("Påse");
    JLabel pointsforyou = new JLabel("Dina poäng: 0");
    JButton pasedator = new JButton("Påse");
    JButton saxdator = new JButton("Sax");
    JButton saxclient = new JButton("Sax");
    JLabel dator = new JLabel("Dator:");
    JLabel winnertextbox = new JLabel();
    JLabel pointsforbot = new JLabel("Datorns poäng: 0");
    public StenSaxPase(){

        //Layouten för fönstret
        this.setVisible(true);
        this.setSize(500, 400);
        this.setLayout(new FlowLayout());
        this.add(spelare);
        this.add(stenclient);
        this.add(paseclient);
        this.add(saxclient);
        this.add(pointsforyou);
        this.add(dator);
        this.add(stendator);
        this.add(saxdator);
        this.add(pasedator);
        this.add(pointsforbot);
        this.add(winnertextbox);
        paseclient.addActionListener(this);
        saxclient.addActionListener(this);
        stenclient.addActionListener(this);
    }
    private int score;
    private String val; //kan vara sten sax eller påse
    private String datorVal;
    private boolean win;
    private boolean even;
    private int botScore;
    

    public static void main(String[] args) {

        new StenSaxPase();
    }

public void actionPerformed(ActionEvent e) {
    //Kollar vilken knapp du tryckte på
    if(e.getSource() == stenclient){
        val = "sten";
    }
    else if(e.getSource() == paseclient){
        val = "påse";
    }
    else if(e.getSource() == saxclient){
        val = "sax";
    }
    datorVal = DatorVal(); //Slumpar ett val för datorn
    CheckWin(val, datorVal); //Jämför ditt och datorns val
}

    public String DatorVal(){

        String slumpatval = "sten";
        double slumpNummer = (int)(Math.random() * 3) + 1;
        //Väljer vilket val datorn gör baserat på math.random samt väljer vilka knappar som ska vara på/av
        if(slumpNummer == 1){
            slumpatval = "sten";
            stendator.getModel().setArmed(true);
            stendator.getModel().setPressed(true);
            pasedator.getModel().setArmed(false);
            pasedator.getModel().setPressed(false);
            saxdator.getModel().setArmed(false);
            saxdator.getModel().setPressed(false);

        }
        else if(slumpNummer == 2){
            slumpatval = "påse";
            stendator.getModel().setArmed(false);
            stendator.getModel().setPressed(false);
            pasedator.getModel().setArmed(true);
            pasedator.getModel().setPressed(true);
            saxdator.getModel().setArmed(false);
            saxdator.getModel().setPressed(false);
        }
        else if(slumpNummer == 3){
            slumpatval = "sax";
            stendator.getModel().setArmed(false);
            stendator.getModel().setPressed( false);
            pasedator.getModel().setArmed(false);
            pasedator.getModel().setPressed(false);
            saxdator.getModel().setArmed(true);
            saxdator.getModel().setPressed(true);
        }

        return slumpatval;
    }
    public void CheckWin(String mittVal, String datornsVal){
        // if satser som säger vem som vann eller om det blev oavgjort
        if(mittVal == "sten"){
            if(datornsVal == "sax"){
                win = true;
                even = false;
            }
            else if(datornsVal == "sten"){
                even = true;
            }
            else{
                win = false;
                even = false;
            }
        }
        else if(mittVal == "sax"){

            if(datornsVal == "sax"){             
                even = true;
            }
            else if(datornsVal == "sten"){
                even = false;
                win = false;
            }
            else{
                win = true;
                even = false;
            }            
        }
        else{
            if(datornsVal == "sax"){
                win = false;
                even = false;
            }
            else if(datornsVal =="sten"){
                win = true;
                even = false;
            }
            else{
                even = true;
            }
        } //Ger utskrifter beroende vad resultatet blev
        if(even){
            System.out.println("Lika!");
            winnertextbox.setText("Oavgjort");
        }
        else{
            if(win){
                score += 1; //ökar dina poäng om du vann
                System.out.println("DU VANN!");
                pointsforyou.setText("Dina poäng:" + score); // skriver ut poängen
                winnertextbox.setText("Du fick poäng");
            }
            else if(!win){
                botScore += 1; //ökar datorns poäng om den vann
                System.out.println("DATORN VANN!");
                pointsforbot.setText("Datorns poäng: " + botScore); //skriver ut datorns poäng
                winnertextbox.setText("Datorn fick poäng");
                
            }
        }
        //Nollställer poäng när antingen spelaren eller datorn får 10 poäng samt säger vem som vann matchen
        if(score >= 10){
            score = 0;
            botScore = 0;
            pointsforbot.setText("Datorns poäng: " + botScore);
            pointsforbot.setText("Dina poäng:" + score);
            winnertextbox.setText("DU VANN!!!!!!!");
        }
        if(botScore >= 10){
            score = 0;
            botScore = 0;
            pointsforbot.setText("Datorns poäng:" + botScore);
            pointsforbot.setText("Dina poäng:" + score);
            winnertextbox.setText("Datorn vann :( :( :(");
        }
            
    }

}
