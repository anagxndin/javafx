package com.example.projetojavafx;

import com.example.projetojavafx.entidades.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class TelaCadastroClienteController {

    private List<Cliente> listaCliente = new ArrayList<>();

    @FXML
    private Button botaoSalvarCliente;

    @FXML
    private TextField campoCPF;

    @FXML
    private TextField campoEmail;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoEndereco;

    @FXML
    private TextField campoNumero;

    @FXML
    void salvarCliente(ActionEvent event) {
        String nome = campoNome.getText();
        String cpf = campoCPF.getText();
        String email = campoEmail.getText();
        String endereco = campoEndereco.getText();
        Cliente cli = new Cliente(nome, cpf, email);
        listaCliente.add(cli);
        limpaFormulario();
        for (Cliente cliente: listaCliente) {
            System.out.println(cliente);
        }


        int numero = Integer.parseInt(campoNumero.getText());
    }

    private void limpaFormulario(){
        campoNome.setText("");
    }

}
