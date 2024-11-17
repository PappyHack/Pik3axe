import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Defining the Games Class
public class HngMn {
    // Defining My Game Variables
    private JFrame frame;
    private JPanel gamePanel;
    private JLabel hangmanFigure;
    private JLabel wordLabel;
    private JButton startButton;

    public HngMn() {
        frame = new JFrame("HngMn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            // Create a new JPanel for the game
            gamePanel = new JPanel();
            gamePanel.setLayout(new BorderLayout());
            // Makes a new JLabel for the Stick Brotha Dude
            hangmanFigure = new JLabel();
            hangmanFigure.setPreferredSize(new
            Dimension(100, 100));
            // This will make a new JLabel for the word to be guessed
            wordLabel = new JLabel();
            wordLabel.setPreferredSize(new
            Dimension(200, 20));
            // This one will make a JLbabel for the peeps guessses
            guessLabel = new JLabel();
            guessLabel.setPreferredSize(new
            Dimension(100, 20));
            // Add the Dude figure, word Label, and guess label to the game gamePanel
            gamePanel.add(hangmanFigure,
                          BorderLayout.CENTER);
            gamePanel.add(wordLabel,
                          BorderLayout.NORTH);
            gamePanel.add(guessLabel,
                          BorderLayout.SOUTH);
            // JButton for the startButton
            startButton = new JButton("Start Hangin!");
            startButton.addActionListener(new
            ActionListener() {
                @Override
                public void actionPerformed(ActionEvent
                e) {
                    startGame();
                }
            });
            frame.add(gamePanel,
                      BorderLayout.CENTER);
            frame.add(startButton,
                      BorderLayout.PAGE_END);
            // THis should make the frame visable
            frame.setVisable(true);
        }
        private void startGame() {
            String word = "typescript";
            String[] guesses = new
      String[6].fill("_");
// Idk How i feel about Java (---_____---)3
      for (int i = 0; i < word.length(); i++) {
          guesses[i] = word.charAt(i) + "";
    }
    // Updates the Stick dude and the word Label
    hangmanFigure.setText(" 0 ");
    wordLabel.setText("Word: " +
String.join("", guesses));
 // removes all components from the game panel
    gamePanel.removeALL();
// Creates a Jpanel fo the word to be guessed
    JPanel wordPanel = new JPanel();
    wordPanel.setLayout(new BorderLayout());
// Adds the word label to the word panel
    JLabel wordLabel2 = new JLabel("Word; " +
String.join("", guesses));
// Add a word Panel to the ummm.. game panel
    wordPanel.add(wordLabel2,
                  BorderLayout.CENTER);
    // Well it kinda says what it does...
    frame.revalidate();
    frame.repaint();
// Define the main method
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new HngMn();
        }
    });
  } 
} 
