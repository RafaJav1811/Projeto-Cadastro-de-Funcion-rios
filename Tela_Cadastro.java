package com.mycompany.cadastrofuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tela_Cadastro extends javax.swing.JFrame 
{
private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Tela_Cadastro() 
    {
        initComponents();
    try 
    {
    Campo_DataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
    Campo_DataValorHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
    Campo_HorasTrabalhadas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
    } 
    catch (java.text.ParseException ex) 
    {
    ex.printStackTrace();
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Painel_main = new javax.swing.JPanel();
        Painel_Azul = new javax.swing.JPanel();
        User_Image = new javax.swing.JLabel();
        Txt_EMPRESA = new javax.swing.JLabel();
        Painel_X = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        Txt_Cadastro = new javax.swing.JLabel();
        Bnt_Imprimir = new javax.swing.JButton();
        Bnt_Salvar = new javax.swing.JButton();
        Txt_Nome = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        Campo_DataAdmissao = new javax.swing.JFormattedTextField();
        Txt_DataAdmissao = new javax.swing.JLabel();
        Campo_DataValorHora = new javax.swing.JFormattedTextField();
        Txt_Valor_Hora = new javax.swing.JLabel();
        Campo_HorasTrabalhadas = new javax.swing.JFormattedTextField();
        Txt_Horas_Trabalhadas = new javax.swing.JLabel();
        Txt_Textinho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel_main.setBackground(new java.awt.Color(255, 255, 255));

        Painel_Azul.setBackground(new java.awt.Color(51, 51, 255));
        Painel_Azul.setForeground(new java.awt.Color(255, 255, 255));

        User_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cadastrofuncionario/user.png"))); // NOI18N

        Txt_EMPRESA.setBackground(new java.awt.Color(255, 255, 255));
        Txt_EMPRESA.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        Txt_EMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        Txt_EMPRESA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_EMPRESA.setText("QuantumPulse System");

        javax.swing.GroupLayout Painel_AzulLayout = new javax.swing.GroupLayout(Painel_Azul);
        Painel_Azul.setLayout(Painel_AzulLayout);
        Painel_AzulLayout.setHorizontalGroup(
            Painel_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_AzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Txt_EMPRESA, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Painel_AzulLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(User_Image)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_AzulLayout.setVerticalGroup(
            Painel_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_AzulLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(User_Image)
                .addGap(18, 18, 18)
                .addComponent(Txt_EMPRESA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel_X.setBackground(new java.awt.Color(51, 51, 255));

        X.setBackground(new java.awt.Color(255, 255, 255));
        X.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");

        javax.swing.GroupLayout Painel_XLayout = new javax.swing.GroupLayout(Painel_X);
        Painel_X.setLayout(Painel_XLayout);
        Painel_XLayout.setHorizontalGroup(
            Painel_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_XLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel_XLayout.setVerticalGroup(
            Painel_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_XLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(X)
                .addContainerGap())
        );

        Txt_Cadastro.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        Txt_Cadastro.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Cadastro.setText("Cadastro");

        Bnt_Imprimir.setBackground(new java.awt.Color(51, 51, 255));
        Bnt_Imprimir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Bnt_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        Bnt_Imprimir.setText("Imprimir");
        Bnt_Imprimir.setAlignmentY(0.0F);
        Bnt_Imprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bnt_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ImprimirActionPerformed(evt);
            }
        });

        Bnt_Salvar.setBackground(new java.awt.Color(51, 51, 255));
        Bnt_Salvar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Bnt_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Bnt_Salvar.setText("Salvar");
        Bnt_Salvar.setAlignmentY(0.0F);
        Bnt_Salvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bnt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_SalvarActionPerformed(evt);
            }
        });

        Txt_Nome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Txt_Nome.setForeground(new java.awt.Color(102, 102, 102));
        Txt_Nome.setText("Nome");

        Campo_Nome.setForeground(new java.awt.Color(51, 51, 51));
        Campo_Nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Campo_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_NomeActionPerformed(evt);
            }
        });

        Campo_DataAdmissao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Campo_DataAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_DataAdmissaoActionPerformed(evt);
            }
        });

        Txt_DataAdmissao.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Txt_DataAdmissao.setForeground(new java.awt.Color(102, 102, 102));
        Txt_DataAdmissao.setText("Data de Admissão");

        Campo_DataValorHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Campo_DataValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_DataValorHoraActionPerformed(evt);
            }
        });

        Txt_Valor_Hora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Txt_Valor_Hora.setForeground(new java.awt.Color(102, 102, 102));
        Txt_Valor_Hora.setText("Valor/Hora");

        Campo_HorasTrabalhadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Campo_HorasTrabalhadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_HorasTrabalhadasActionPerformed(evt);
            }
        });

        Txt_Horas_Trabalhadas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Txt_Horas_Trabalhadas.setForeground(new java.awt.Color(102, 102, 102));
        Txt_Horas_Trabalhadas.setText("Horas Trabalhadas");

        Txt_Textinho.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Txt_Textinho.setForeground(new java.awt.Color(102, 102, 102));
        Txt_Textinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Textinho.setText("Insira as informações para o cadastro");

        javax.swing.GroupLayout Painel_mainLayout = new javax.swing.GroupLayout(Painel_main);
        Painel_main.setLayout(Painel_mainLayout);
        Painel_mainLayout.setHorizontalGroup(
            Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_mainLayout.createSequentialGroup()
                .addComponent(Painel_Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_mainLayout.createSequentialGroup()
                        .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_Nome)
                            .addGroup(Painel_mainLayout.createSequentialGroup()
                                .addComponent(Txt_Nome)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_mainLayout.createSequentialGroup()
                                .addComponent(Txt_Cadastro)
                                .addGap(111, 111, 111)
                                .addComponent(Painel_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_mainLayout.createSequentialGroup()
                                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Textinho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_mainLayout.createSequentialGroup()
                                        .addComponent(Bnt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bnt_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92))))
                    .addGroup(Painel_mainLayout.createSequentialGroup()
                        .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Txt_DataAdmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Campo_DataAdmissao, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_mainLayout.createSequentialGroup()
                                .addComponent(Txt_Valor_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addComponent(Campo_DataValorHora))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Horas_Trabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_HorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        Painel_mainLayout.setVerticalGroup(
            Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Painel_mainLayout.createSequentialGroup()
                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel_mainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Txt_Cadastro)
                        .addGap(25, 25, 25)
                        .addComponent(Txt_Nome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_DataAdmissao)
                    .addComponent(Txt_Horas_Trabalhadas)
                    .addComponent(Txt_Valor_Hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_HorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_DataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_DataValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(Painel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bnt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bnt_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(Txt_Textinho)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_NomeActionPerformed

    private void Bnt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_SalvarActionPerformed
 if (Campo_Nome.getText().trim().isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "O campo 'Nome' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
        Campo_Nome.requestFocus();
        return;
    }

    // Verificar se o campo "Data de Admissão" está vazio ou inválido
    String dataAdmissaoStr = Campo_DataAdmissao.getText().trim();
    if (dataAdmissaoStr.isEmpty() || !isDataValida(dataAdmissaoStr)) 
    {
        JOptionPane.showMessageDialog(this, "O campo 'Data de Admissão' é inválido ou está vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
        Campo_DataAdmissao.requestFocus();
        return;
    }

    // Verificar se o campo "Valor Hora" está vazio
    if (Campo_DataValorHora.getText().trim().isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "O campo 'Valor/Hora' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
        Campo_DataValorHora.requestFocus();
        return;
    }

    if (Campo_HorasTrabalhadas.getText().trim().isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "O campo 'Horas Trabalhadas' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
        Campo_HorasTrabalhadas.requestFocus();
        return;
    }

    try 
    {
        String nome = Campo_Nome.getText().trim();
        Date dataAdmissao = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dataAdmissaoStr);
        double valorHora = Double.parseDouble(Campo_DataValorHora.getText().trim());
        double horasTrabalhadas = Double.parseDouble(Campo_HorasTrabalhadas.getText().trim());

        Funcionario funcionario = new Funcionario(nome, dataAdmissao, valorHora, horasTrabalhadas);

        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        limparCampos();
        Campo_Nome.requestFocus();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar os dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean isDataValida(String data) 
{
    try 
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        Date dataAdmissao = formato.parse(data);
        return !dataAdmissao.after(new Date());
    } catch (ParseException e) 
    {
        return false;
    }
}

private void limparCampos() 
{
    Campo_Nome.setText("");
    Campo_DataAdmissao.setText("");
    Campo_DataValorHora.setText("");
    Campo_HorasTrabalhadas.setText("");
}    }//GEN-LAST:event_Bnt_SalvarActionPerformed

    private void Bnt_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ImprimirActionPerformed
    
    String nome = Campo_Nome.getText().trim();
    String dataAdmissaoStr = Campo_DataAdmissao.getText().trim();
    String valorHoraStr = Campo_DataValorHora.getText().trim();
    String horasTrabalhadasStr = Campo_HorasTrabalhadas.getText().trim();

    if (nome.isEmpty() || dataAdmissaoStr.isEmpty() || valorHoraStr.isEmpty() || horasTrabalhadasStr.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Todos os campos devem estar preenchidos antes de imprimir.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAdmissao = formato.parse(dataAdmissaoStr);
        double valorHora = Double.parseDouble(valorHoraStr);
        double horasTrabalhadas = Double.parseDouble(horasTrabalhadasStr);

        String mensagem = String.format
        (
            "Dados do Funcionário:\n\n" +
            "Nome: %s\n" +
            "Data de Admissão: %s\n" +
            "Valor/Hora: R$ %.2f\n" +
            "Horas Trabalhadas: %.2f\n" +
            "Salário Estimado: R$ %.2f",
            nome,
            formato.format(dataAdmissao),
            valorHora,
            horasTrabalhadas,
            valorHora * horasTrabalhadas
        );

        // Exibir os dados em um painel de diálogo
        JOptionPane.showMessageDialog(this, mensagem, "Impressão", JOptionPane.INFORMATION_MESSAGE);

    } 
    catch (ParseException e) 
    {
        JOptionPane.showMessageDialog(this, "Erro ao processar a data de admissão.", "Erro", JOptionPane.ERROR_MESSAGE);
    } 
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Erro ao processar os valores numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_Bnt_ImprimirActionPerformed
    private void Campo_DataAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_DataAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_DataAdmissaoActionPerformed

    private void Campo_DataValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_DataValorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_DataValorHoraActionPerformed

    private void Campo_HorasTrabalhadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_HorasTrabalhadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_HorasTrabalhadasActionPerformed

    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnt_Imprimir;
    private javax.swing.JButton Bnt_Salvar;
    private javax.swing.JFormattedTextField Campo_DataAdmissao;
    private javax.swing.JFormattedTextField Campo_DataValorHora;
    private javax.swing.JFormattedTextField Campo_HorasTrabalhadas;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JPanel Painel_Azul;
    private javax.swing.JPanel Painel_X;
    private javax.swing.JPanel Painel_main;
    private javax.swing.JLabel Txt_Cadastro;
    private javax.swing.JLabel Txt_DataAdmissao;
    private javax.swing.JLabel Txt_EMPRESA;
    private javax.swing.JLabel Txt_Horas_Trabalhadas;
    private javax.swing.JLabel Txt_Nome;
    private javax.swing.JLabel Txt_Textinho;
    private javax.swing.JLabel Txt_Valor_Hora;
    private javax.swing.JLabel User_Image;
    private javax.swing.JLabel X;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
