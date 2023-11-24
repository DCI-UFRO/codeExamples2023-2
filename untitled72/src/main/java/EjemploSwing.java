import javax.swing.*;
import java.awt.*;

public class EjemploSwing {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Dos Paneles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear dos paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // Crear botones para cada panel
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");

        // Añadir botón al primer panel
        panel1.add(button1);

        // Añadir botón al segundo panel
        panel2.add(button2);

        // Añadir paneles al marco principal
        frame.setLayout(new GridLayout(1, 2)); // Organización en una fila de dos columnas
        frame.add(panel1);
        frame.add(panel2);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
