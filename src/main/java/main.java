import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame window = new JFrame("AquaManager");
        window.setSize(1000,700);
        AquaWindow leftWindow = new AquaWindow(window);
        window.add(leftWindow);
        window.setVisible(true);
    }
}
