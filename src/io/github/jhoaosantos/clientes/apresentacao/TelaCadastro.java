package io.github.jhoaosantos.clientes.apresentacao;

import io.github.jhoaosantos.clientes.dominio.Cliente;
import io.github.jhoaosantos.clientes.dominio.enums.TipoSexo;
import io.github.jhoaosantos.clientes.logicanegocio.Cadastro;
import io.github.jhoaosantos.clientes.logicanegocio.LogicaCadastroClienteFake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setSize(600, 500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        adicionarCampos();
        adicionarBotoes();
        adicionarComponentesFoto();
    }

    private void adicionarCampos() {
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 200, 20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);

        labelCpf = new JLabel("Cpf:");
        labelCpf.setBounds(20, 60, 200, 20);
        getContentPane().add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20, 80, 200, 20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20, 100, 200, 20);
        getContentPane().add(labelSexo);

        TipoSexo[] tipoSexo = {TipoSexo.M, TipoSexo.F, TipoSexo.O};
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(20, 120, 200, 20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes() {
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20, 160, 100, 20);

        ActionListener acaoBotaoSalvar = botaoSalvarActionL();
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);
    }

    private void adicionarComponentesFoto() {
        // Implementar se necessário
    }

    private ActionListener botaoSalvarActionL() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(
                        campoNome.getText(),
                        campoCpf.getText(),
                        (TipoSexo) campoSexo.getSelectedItem());

                Cadastro<Cliente> logicaCadastro = new LogicaCadastroClienteFake();
                logicaCadastro.salvar(cliente);

                JOptionPane.showMessageDialog(null, cliente);
            }
        };
    }

}
