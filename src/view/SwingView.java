package view;

import javafx.fxml.Initializable;
import presenter.IPresenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

public class SwingView implements IView {
    private IPresenter presenter;

    private JTextField textField = new JTextField();
    private JButton button = new JButton("Rechnen");
    private JLabel label = new JLabel(" ");

    public SwingView() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        frame.setContentPane(panel);
        panel.add(textField, BorderLayout.NORTH);
        panel.add(button);
        panel.add(label, BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setTitle("MVP mit Swing");
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // delegieren an Presenter
                presenter.buttonClick();
            }
        });
    }

    // fuer App
    @Override
    public void setPresenter(IPresenter presenter) {
        this.presenter = presenter;
    }

    // fuer Presenter
    @Override
    public void setDaten(String daten) {
        label.setText(daten);
    }

    @Override
    public String getDaten() {
        return textField.getText();
    }


}
