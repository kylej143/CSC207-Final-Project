package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

public class LoginView extends JPanel implements ActionListener {

    private LoginViewModel loginViewModel;

    private final JTextField usernameInputField = new JTextField(15);
    private final JPasswordField passwordInputField = new JPasswordField(15);

    private JButton loginButton;
    private JButton signUpButton;

    public LoginView(LoginViewModel loginViewModel)
    {
        this.loginViewModel = loginViewModel;

        loginButton = new JButton(LoginViewModel.LOGIN_BUTTON_STRING);
        signUpButton = new JButton(LoginViewModel.SIGNUP_BUTTON_STRING);

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel(LoginViewModel.USERNAME_FIELD_STIRNG));
        usernamePanel.add(usernameInputField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel(LoginViewModel.PASSWORD_FIELD_STRING));
        passwordPanel.add(passwordInputField);

        loginButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Login");
                    }
                }
        );

        usernameInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        String text = usernameInputField.getText() + e.getKeyChar();
                        System.out.println(text);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

        passwordInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        String text = usernameInputField.getText() + e.getKeyChar();
                        System.out.println(text);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

        this.add(usernamePanel);
        this.add(passwordPanel);
        this.add(loginButton);
        this.add(signUpButton);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
