package lt.viko.eif.stamulyte.UI;

import lt.viko.eif.stamulyte.model.Gyvunas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame{
    private JPanel productPanel;
    private JButton searchButton;
    private JButton loginButton;
    private JButton mainPageButton, logoutButton, loved;

    public MainWindow() {
        setTitle("Prieglaudela");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel(new BorderLayout());

        // Create logo
        ImageIcon logoIcon = new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/logo.png");
        Image logoImage = logoIcon.getImage();
        Image scaledLogoImage = logoImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);
        JLabel logoLabel = new JLabel(scaledLogoIcon);

        // Create name label

        JLabel nameLabel = new JLabel("Prieglauda");
        nameLabel.setFont(new Font("Arrial", Font.BOLD, 20));
        // Create log out button
        logoutButton = new JButton("Log Out");
        logoutButton.setPreferredSize(new Dimension(100,50));
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform log out action
                JOptionPane.showMessageDialog(MainWindow.this, "Logging out...");
            }
        });

        loved = new JButton("Loved");
        loved.setPreferredSize(new Dimension(100,50));
        loved.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainWindow.this, "Loved animals...");
            }
        });
        JPanel logoPanel = new JPanel((new FlowLayout(FlowLayout.LEFT)));
        logoPanel.add(logoLabel);
        logoPanel.add(nameLabel);

        JPanel accountPanel = new JPanel((new FlowLayout(FlowLayout.RIGHT)));
        accountPanel.add(loved);
        accountPanel.add(logoutButton);
        // Add logo and log out button to the header panel
        headerPanel.add(logoPanel, BorderLayout.WEST);
        headerPanel.add(accountPanel, BorderLayout.EAST);

        // Add header panel to the frame

        JPanel searchPanel = new JPanel(new BorderLayout());

        // Create panel for the products grid
        productPanel = new JPanel(new GridLayout(3, 3));
        addProductsToGrid();

        // Create scroll pane and add the product panel to it
        JScrollPane scrollPane = new JScrollPane(productPanel);

        // Create search button
        searchButton = new JButton("Search");
        searchButton.setPreferredSize(new Dimension(100,50));
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform search action
                JOptionPane.showMessageDialog(MainWindow.this, "Performing search...");
            }
        });

        // Create login button
        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(100,50));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform login action
                JOptionPane.showMessageDialog(MainWindow.this, "Logging in...");
            }
        });

        // Create main page button
        mainPageButton = new JButton("Main Page");
        mainPageButton.setPreferredSize(new Dimension(100,50));
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Go to the main page
                JOptionPane.showMessageDialog(MainWindow.this, "Going to the main page...");
            }
        });

        // Create panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());

        buttonPanel.add(searchButton);
        buttonPanel.add(mainPageButton);
        buttonPanel.add(loginButton);

        // Set layout for the frame
        setLayout(new BorderLayout());
        add(headerPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);

    }

    private void addProductsToGrid() {

        // Add product buttons to the grid
        List<Gyvunas> animals = new ArrayList<>();
        animals.add(new Gyvunas("Huskis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/husky.png")));
        animals.add(new Gyvunas("suniukai", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/German-Shepherd.png")));
        animals.add(new Gyvunas("aviganis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/cutest-dog.png")));
        animals.add(new Gyvunas("Huskis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/husky.png")));
        animals.add(new Gyvunas("suniukai", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/German-Shepherd.png")));
        animals.add(new Gyvunas("aviganis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/cutest-dog.png")));
        animals.add(new Gyvunas("Huskis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/husky.png")));
        animals.add(new Gyvunas("suniukai", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/German-Shepherd.png")));
        animals.add(new Gyvunas("aviganis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/cutest-dog.png")));
        animals.add(new Gyvunas("Huskis", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/husky.png")));
        animals.add(new Gyvunas("suniukai", new ImageIcon("/Users/sindijatamulyte/Documents/GitHub/shelter_app/src/German-Shepherd.png")));


        for (Gyvunas animal : animals) {
            JPanel animalPanel = new JPanel(new BorderLayout());
            ImageIcon imageIcon = new ImageIcon(animal.getImage().getImage());
            Image animalImage = imageIcon.getImage();
            Image scaledAnimalImage = animalImage.getScaledInstance(120,120, Image.SCALE_SMOOTH);
            ImageIcon scaled = new ImageIcon(scaledAnimalImage);
            JLabel imageLabel = new JLabel(scaled);

            JLabel nameLabel = new JLabel(animal.getName());
            nameLabel.setPreferredSize(new Dimension(20,50));
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

            animalPanel.add(imageLabel, BorderLayout.CENTER);
            animalPanel.add(nameLabel, BorderLayout.SOUTH);
            animalPanel.setPreferredSize(new Dimension(200,150));
            animalPanel.setBorder(new LineBorder(Color.lightGray, 1));
            this.productPanel.add(animalPanel);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow gui = new MainWindow();
                gui.setVisible(true);
            }
        });
    }
}
