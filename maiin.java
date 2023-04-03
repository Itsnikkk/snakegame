import javax.swing.JFrame;

public class maiin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        game Game = new game();
        frame.add(Game);
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
