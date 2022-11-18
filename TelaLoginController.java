package com.example.projetojavafx;

import com.example.projetojavafx.excecao.LoginFalhaException;
import com.example.projetojavafx.excecao.LoginSucessoException;
import br.edu.iftm.lp2.projetojavafx.util.Notificacao;
import com.example.projetojavafx.excecao.LoginSucessoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaLoginController {

    @FXML
    private TextField campoUsuario;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private Button botaoLogin;

    @FXML


    void fazerLogin(ActionEvent event) {

        try {
            String usario = campoUsuario.getText();
            String senha = campoSenha.getText();
            if (usario.equals("lp22022") && senha.equals("shrek")) {
                App.setRaiz("TelaCadastroLogin.fxml");
                throw new LoginSucessoException();

            } else {
                throw new LoginFalhaException();
            }

        } catch (LoginSucessoException e) {
            Notificacao.mostraNotificacao("Login Sucesso", "lOGIN REALIZADO COM SUCESSO", e.getMessage(), Alert.AlertType.INFORMATION);
        } catch (LoginFalhaException e) {
            Notificacao.mostraNotificacao("Login eRRO", "lOGIN NÃO REALIZADO", e.getMessage(), Alert.AlertType.INFORMATION);
        } catch (IOException e) {
             Notificacao.mostraNotificacao("ERRO", "Erro ao carregar a janela", e.getMessage(), Alert.AlertType.INFORMATION);

        }

    }

}
