import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProjetoResistores {
    
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        
        JLabel labelfrase = new JLabel("Qual opção você deseja?");

        JButton botao1 = new JButton("Calculadora pelo valor dos OHMS");
        JButton botao2 = new JButton("Calculadora pela sequência de CORES");
       
        
        panel.setLayout(new GridBagLayout());        
        GridBagConstraints gbc;
        
        gbc = new GridBagConstraints();
        gbc.gridx = 1;        
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;        
        gbc.insets = new Insets(5, 10, 10, 0);
        gbc.anchor = GridBagConstraints.NORTH;
        panel.add(labelfrase, gbc);
        
        gbc = new GridBagConstraints();
        gbc.gridx = 1;        
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;        
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(botao1, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;        
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;        
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(botao2, gbc);
        
        botao1.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                    JFrame frameOhms = new JFrame("Ohms");
                    JPanel panelOhms = new JPanel();
                
                    JLabel pergunta1 = new JLabel("Insira a quantidade de Ω : ");
                    JTextField receberPergunta1 = new JTextField(10);
                    JLabel pergunta2 = new JLabel("Insira a tolerância : ");
                    JTextField receberPergunta2 = new JTextField(10);
                    JButton botaoCalcularOhms = new JButton("Calcular");

                    panelOhms.setLayout(new GridBagLayout());
                    GridBagConstraints gbc;
        
                    gbc = new GridBagConstraints();
                    gbc.gridx = 1;        
                    gbc.gridy = 1;
                    gbc.gridwidth = 2;
                    gbc.gridheight = 1;        
                    gbc.insets = new Insets(5, 10, 10, 0);
                    panelOhms.add(pergunta1, gbc);
                    
                    gbc = new GridBagConstraints();
                    gbc.gridx = 4;        
                    gbc.gridy = 1;
                    gbc.gridwidth = 2;
                    gbc.gridheight = 1;        
                    gbc.insets = new Insets(5, 10, 10, 0);
                    panelOhms.add(receberPergunta1, gbc);
                    
                    gbc = new GridBagConstraints();
                    gbc.gridx = 1;        
                    gbc.gridy = 3;
                    gbc.gridwidth = 2;
                    gbc.gridheight = 1;        
                    gbc.insets = new Insets(5, 10, 10, 0);
                    panelOhms.add(pergunta2, gbc);
                    
                    gbc = new GridBagConstraints();
                    gbc.gridx = 4;        
                    gbc.gridy = 3;
                    gbc.gridwidth = 2;
                    gbc.gridheight = 1;        
                    gbc.insets = new Insets(5, 10, 10, 0);
                    panelOhms.add(receberPergunta2, gbc);
                    
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;        
                    gbc.gridy = 5;
                    gbc.gridwidth = 4;
                    gbc.gridheight = 1;        
                    gbc.insets = new Insets(5, 10, 10, 0);
                    panelOhms.add(botaoCalcularOhms, gbc);
                    
                    botaoCalcularOhms.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            
                            JFrame frameResultadoOhms = new JFrame("Resultado");
                            JPanel panelResultadoOhms = new JPanel();
                            
                            long valorPergunta1 = Long.parseLong(receberPergunta1.getText());
                            double valorPergunta2 = Double.parseDouble(receberPergunta2.getText());
                            
                            long cor1 = 0;
                            long cor2 = 0;
                            long cor3 = 0;
                            long mod = 0;
                            long div = valorPergunta1;
                            
                            while(div>0){
                                mod = (div%10);
                                div /= 10;
                                
                                if(mod == 0){
                                    cor3++;
                                } else{
                                    cor1 = div;
                                    cor2 = mod;
                                    break;
                                }
                            }
                            
                            JLabel faixa1 = new JLabel("PRIMEIRA FAIXA: ");
                            JLabel faixa2 = new JLabel("SEGUNDA FAIXA: ");
                            JLabel faixa3 = new JLabel("TERCEIRA FAIXA: ");
                            JLabel faixa4 = new JLabel("QUARTA FAIXA (TOLERÂNCIA): ");
                            JLabel separa1 = new JLabel("");
                            JLabel separa2 = new JLabel("");
                            JLabel separa3 = new JLabel("");
                            JLabel separa4 = new JLabel("");
                            
                            JLabel corFaixa1 = new JLabel();
                            corFaixa1.setOpaque(true);
                            corFaixa1.setBounds(50,50,200,200);

                            JLabel corFaixa2 = new JLabel();
                            corFaixa2.setOpaque(true);
                            corFaixa2.setBounds(100,100,200,200);

                            JLabel corFaixa3 = new JLabel();
                            corFaixa3.setOpaque(true);
                            corFaixa3.setBounds(150,150,200,200);

                            JLabel corFaixa4 = new JLabel();
                            corFaixa4.setOpaque(true);
                            corFaixa4.setBounds(150,150,200,200);
                            
                            if(cor1 == 0){
                                corFaixa1.setBackground(new Color(0,0,0));}
                            if(cor1 == 1){
                                corFaixa1.setBackground(new Color(116,71,0));}
                            if(cor1 == 2){
                                corFaixa1.setBackground(new Color(252,0,0));}
                            if(cor1 == 3){
                                corFaixa1.setBackground(new Color(252,146,0));}
                            if(cor1 == 4){
                                corFaixa1.setBackground(new Color(255,219,30));}
                            if(cor1 == 5){
                                corFaixa1.setBackground(new Color(110,250,48));}
                            if(cor1 == 6){
                                corFaixa1.setBackground(new Color(21,155,255));}
                            if(cor1 == 7){
                                corFaixa1.setBackground(new Color(182,53,212));}
                            if(cor1 == 8){
                                corFaixa1.setBackground(new Color(128,128,128));}
                            if(cor1 == 9){
                                corFaixa1.setBackground(new Color(255,255,255));}
                            
                            if(cor2 == 0){
                                corFaixa2.setBackground(new Color(0,0,0));}
                            if(cor2 == 1){
                                corFaixa2.setBackground(new Color(116,71,0));}
                            if(cor2 == 2){
                                corFaixa2.setBackground(new Color(252,0,0));}
                            if(cor2 == 3){
                                corFaixa2.setBackground(new Color(252,146,0));}
                            if(cor2 == 4){
                                corFaixa2.setBackground(new Color(255,219,30));}
                            if(cor2 == 5){
                                corFaixa2.setBackground(new Color(110,250,48));}
                            if(cor2 == 6){
                                corFaixa2.setBackground(new Color(21,155,255));}
                            if(cor2 == 7){
                                corFaixa2.setBackground(new Color(182,53,212));}
                            if(cor2 == 8){
                                corFaixa2.setBackground(new Color(128,128,128));}
                            if(cor2 == 9){
                                corFaixa2.setBackground(new Color(255,255,255));}
                            
                            if(cor3 == 0){
                                corFaixa3.setBackground(new Color(0,0,0));}
                            if(cor3 == 1){
                                corFaixa3.setBackground(new Color(116,71,0));}
                            if(cor3 == 2){
                                corFaixa3.setBackground(new Color(252,0,0));}
                            if(cor3 == 3){
                                corFaixa3.setBackground(new Color(252,146,0));}
                            if(cor3 == 4){
                                corFaixa3.setBackground(new Color(255,219,30));}
                            if(cor3 == 5){
                                corFaixa3.setBackground(new Color(110,250,48));}
                            if(cor3 == 6){
                                corFaixa3.setBackground(new Color(21,155,255));}
                            if(cor3 == 7){
                                corFaixa3.setBackground(new Color(182,53,212));}
                            if(cor3 == 8){
                                corFaixa3.setBackground(new Color(128,128,128));}
                            if(cor3 == 9){
                                corFaixa3.setBackground(new Color(255,255,255));}
                            
                            if((valorPergunta1 * 0.05) == valorPergunta2){
                                corFaixa4.setBackground(new Color(204,204,0));
                            }
                            
                            if((valorPergunta1 * 0.10) == valorPergunta2){
                                corFaixa4.setBackground(new Color(192,192,192));
                            }
                            
                            panelResultadoOhms.setLayout(new GridLayout(12, 1));
                            
                            panelResultadoOhms.add(faixa1);
                            panelResultadoOhms.add(corFaixa1);
                            panelResultadoOhms.add(separa1);
                            panelResultadoOhms.add(faixa2);
                            panelResultadoOhms.add(corFaixa2);
                            panelResultadoOhms.add(separa2);
                            panelResultadoOhms.add(faixa3);
                            panelResultadoOhms.add(corFaixa3);
                            panelResultadoOhms.add(separa3);
                            panelResultadoOhms.add(faixa4);
                            panelResultadoOhms.add(corFaixa4);
                            panelResultadoOhms.add(separa4);
                            
                            
                            frameResultadoOhms.add(panelResultadoOhms);
                            frameResultadoOhms.setSize(450,450);
                            frameResultadoOhms.setLocationRelativeTo(null);
                            frameResultadoOhms.setVisible(true);
                        }
                    });
                    
                    frameOhms.add(panelOhms);
                    frameOhms.setSize(400,200);
                    frameOhms.setLocationRelativeTo(null);
                    frameOhms.setVisible(true);
            }
        });
         
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                JFrame frameCores = new JFrame("Cores");
                JPanel panelCores = new JPanel();
                JButton botaoCalcular = new JButton("Calcular");

                Vector coreslista = new Vector<String>();
                
                coreslista.add ("0 - Preto");
                coreslista.add ("1 - Marrom");
                coreslista.add ("2 - Vermelho");
                coreslista.add ("3 - Laranja");
                coreslista.add ("4- Amarelo");
                coreslista.add ("5- Verde");
                coreslista.add ("6- Azul");
                coreslista.add ("7- Violeta");
                coreslista.add ("8- Cinza");
                coreslista.add ("9- Branco");
            
                Color[] cores = new Color[]{
                    new Color (0,0,0), //preto
                    new Color (116,71,0), //marrom
                    new Color (252,0,0), //vermelho
                    new Color (252,146,0), //laranja
                    new Color (255,219,30), //amarelo
                    new Color (110,250,48), //verde
                    new Color (21,155,255), //azul
                    new Color (182,53,212), //violeta
                    new Color (128,128,128), //cinza
                    new Color (255,255,255), //branco
                    
                };
                
                
                Vector cores4faixa = new Vector<String>();
                
                cores4faixa.add ("Dourado");
                cores4faixa.add ("Prata");
                
                Color[] coresquarta = new Color[]{
                    new Color (204,204,0),
                    new Color (192,192,192),
                };
                
                JComboBox<String> combo1 = new JComboBox<>(coreslista);
                JComboBox<String> combo2 = new JComboBox<>(coreslista);
                JComboBox<String> combo3 = new JComboBox<>(coreslista);
                JComboBox<String> combo4 = new JComboBox<>(cores4faixa);

                JLabel label1 = new JLabel();
                label1.setOpaque(true);
                label1.setBounds(50,50,200,200);

                JLabel label2 = new JLabel();
                label2.setOpaque(true);
                label2.setBounds(100,100,200,200);

                JLabel label3 = new JLabel();
                label3.setOpaque(true);
                label3.setBounds(150,150,200,200);
                
                JLabel label4 = new JLabel();
                label4.setOpaque(true);
                label4.setBounds(150,150,200,200);
                
                JLabel labelfaixa1 = new JLabel("PRIMEIRA FAIXA: ");
                JLabel labelfaixa2 = new JLabel("SEGUNDA FAIXA: ");
                JLabel labelfaixa3 = new JLabel("TERCEIRA FAIXA: ");
                JLabel labelfaixa4 = new JLabel("QUARTA FAIXA (TOLERÂNCIA): ");
                JLabel separação1 = new JLabel("");
                JLabel separação2 = new JLabel("");
                JLabel separação3 = new JLabel("");
                JLabel separação4 = new JLabel("");
                JLabel separação5 = new JLabel("");
                
                combo1.addActionListener((ActionEvent e) -> {
                    
                    String cor1 = (String)combo1.getSelectedItem();
                    
                    Color corselecionada = cores[coreslista.indexOf(cor1)];  
                    
                    label1.setBackground(corselecionada);

                 });
                
                combo2.addActionListener((ActionEvent e) -> {
                String cor2 = (String)combo2.getSelectedItem();

                    Color corselecionada = cores[coreslista.indexOf(cor2)];
                           
                    label2.setBackground(corselecionada);
                    
                 });
                
                combo3.addActionListener((ActionEvent e) -> {
                String cor3 = (String)combo3.getSelectedItem();

                    Color corselecionada = cores[coreslista.indexOf(cor3)];
                           
                    label3.setBackground(corselecionada);

                 });
                
                combo4.addActionListener((ActionEvent e) -> {
                String cor4 = (String)combo4.getSelectedItem();

                    Color corselecionada = coresquarta[cores4faixa.indexOf(cor4)];
                           
                    label4.setBackground(corselecionada);
                    
                 });
  
                panelCores.setLayout(new GridLayout(19, 1));

                panelCores.add(labelfaixa1);
                panelCores.add(combo1);
                panelCores.add(label1);
                panelCores.add(separação1);
                panelCores.add(labelfaixa2);
                panelCores.add(combo2);
                panelCores.add(label2);
                panelCores.add(separação2);
                panelCores.add(labelfaixa3);
                panelCores.add(combo3);
                panelCores.add(label3);
                panelCores.add(separação3);
                panelCores.add(labelfaixa4);
                panelCores.add(combo4);
                panelCores.add(label4);
                panelCores.add(separação4);
                panelCores.add(botaoCalcular);
                panelCores.add(separação5);

                
                botaoCalcular.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                        JFrame frameResultado = new JFrame("Resultado");

                        double resultado = 0;
                        double tolerancia = 0;
                        
                        String cor1 = (String)combo1.getSelectedItem();
                        String cor2 = (String)combo2.getSelectedItem();
                        String cor3 = (String)combo3.getSelectedItem();
                        String cor4 = (String)combo4.getSelectedItem();
                        
                        if (cor1 == "0 - Preto"){                            
                            resultado = resultado + 0;}
                        if (cor1 == "1 - Marrom"){                            
                            resultado = resultado + 10;}
                        if (cor1 == "2 - Vermelho"){                            
                            resultado = resultado + 20;}
                        if (cor1 == "3 - Laranja"){   
                            resultado = resultado + 30;}
                        if (cor1 == "4- Amarelo"){   
                            resultado = resultado + 40;}
                        if (cor1 == "5- Verde"){   
                            resultado = resultado + 50;}
                        if (cor1 == "6- Azul"){   
                            resultado = resultado + 60;}
                        if (cor1 == "7- Violeta"){   
                            resultado = resultado + 70;}
                        if (cor1 == "8- Cinza"){   
                            resultado = resultado + 80;}
                        if (cor1 == "9- Branco"){   
                            resultado = resultado + 90;}
                        
                        if (cor2 == "0 - Preto"){                            
                            resultado = resultado + 0;}
                        if (cor2 == "1 - Marrom"){                            
                            resultado = resultado + 1;}
                        if (cor2 == "2 - Vermelho"){                            
                            resultado = resultado + 2;}
                        if (cor2 == "3 - Laranja"){   
                            resultado = resultado + 3;}
                        if (cor2 == "4- Amarelo"){   
                            resultado = resultado + 4;}
                        if (cor2 == "5- Verde"){   
                            resultado = resultado + 5;}
                        if (cor2 == "6- Azul"){   
                            resultado = resultado + 6;}
                        if (cor2 == "7- Violeta"){   
                            resultado = resultado + 7;}
                        if (cor2 == "8- Cinza"){   
                            resultado = resultado + 8;}
                        if (cor2 == "9- Branco"){   
                            resultado = resultado + 9;}
                        
                        if (cor3 == "0 - Preto"){                            
                            resultado = resultado * 0;}
                        if (cor3 == "1 - Marrom"){                            
                            resultado = resultado * 10;}
                        if (cor3 == "2 - Vermelho"){                            
                            resultado = resultado * 100;}
                        if (cor3 == "3 - Laranja"){   
                            resultado = resultado * 1000;}
                        if (cor3 == "4- Amarelo"){   
                            resultado = resultado * 10000;}
                        if (cor3 == "5- Verde"){   
                            resultado = resultado * 100000;}
                        if (cor3 == "6- Azul"){   
                            resultado = resultado * 1000000;}
                        if (cor3 == "7- Violeta"){   
                            resultado = resultado * 10000000;}
                        if (cor3 == "8- Cinza"){   
                            resultado = resultado * 100000000;}
                        if (cor3 == "9- Branco"){   
                            resultado = resultado * 1000000000;}

                        
                        JLabel resultadoDoCalculo = new JLabel("Resultado: " + resultado + "Ω");
                        
                        if (cor4 == "Dourado"){   
                            tolerancia = (resultado * 0.05);}
                        if (cor4 == "Prata"){   
                            tolerancia = (resultado * 0.10);}
                        
                        JLabel resultadoTolerancia = new JLabel("Tolerância: " + tolerancia + "Ω");
                        JLabel variação = new JLabel("O resistor pode variar de: " + (resultado - tolerancia) + "Ω a " + (resultado + tolerancia)+ "Ω");
                        
                        JPanel panelResultado = new JPanel();
                        panelResultado.setLayout(new GridLayout(3, 1));
                        panelResultado.add(resultadoDoCalculo);
                        panelResultado.add(resultadoTolerancia);
                        panelResultado.add(variação);

                        frameResultado.add(panelResultado);
                        frameResultado.setSize(350,150);
                        frameResultado.setLocationRelativeTo(null);
                        frameResultado.setVisible(true);
                        
                    }
                });

                frameCores.add(panelCores);
                frameCores.setSize(450,450);
                frameCores.setLocationRelativeTo(null);
                frameCores.setVisible(true);
            }
        });
        
        JFrame frame = new JFrame ("Frame");
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    } 
}

