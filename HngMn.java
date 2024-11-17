import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Defines the Hangmangame class
public class HngMn {
    private JFrame frame;
    private JPanel gamePanel;
    private JLabel hangmanFigure;
    private JLabel wordLabel;
    private JLabel guessLabel;
    private JButton startButton;
// Defines the constructor for the Hangman class
    public HngMn() {
        // This will create a new JFrame for thy game
        frame = new JFrame("HngMn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
// This makes a JPanel for thy game
        gamePanel = new JPanel();
        gamePanel.setLayout(new BorderLayout());
// You guessed it... This makes a JLabel
        hangmanFigure = new JLabel();
        hangmanFigure.setPreferredSize(new Dimension(100, 100));
// A JLabel for the guessed word
        wordLabel = new JLabel();
        wordLabel.setPreferredSize(new Dimension(200, 20));
// JLabel for the players guesses
        guessLabel = new JLabel();
        guessLabel.setPreferredSize(new Dimension(100, 20));
// This will add the Man whom is destined to be hung, the word Label, and guess Label to the game panel
        gamePanel.add(hangmanFigure, BorderLayout.CENTER);
        gamePanel.add(wordLabel, BorderLayout.NORTH);
        gamePanel.add(guessLabel, BorderLayout.SOUTH);
// The Jbutton will be the Start button
        startButton = new JButton("Start Hangin!");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This will fire the game up when the Start button is clicked
                startGame();
            }
        });
// This adds the start button to the frame
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(startButton, BorderLayout.PAGE_END);
        frame.setVisible(true); // Makes the frame visible
    }
// Defines the start Game method i believe
    private void startGame() {
        String word = "typescript"; // This should define the word to be guessed
        String[] guesses = new String[6];
        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = "_";
        }
// Updates Stick Dude and word label
        hangmanFigure.setText(" 0 ");
        wordLabel.setText("Word: " + String.join("", guesses));
// Removes akk components from the game panel
        gamePanel.removeAll();
        JPanel wordPanel = new JPanel();
        wordPanel.setLayout(new BorderLayout());
        wordPanel.add(wordLabel, BorderLayout.CENTER);
        gamePanel.add(wordPanel, BorderLayout.NORTH);

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HngMn();
            }
        });
    }
}
 
