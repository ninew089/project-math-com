package pkg6033611623_poker_project;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokeGameRun extends javax.swing.JFrame {

    public PokeGameRun() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFrame1 = new javax.swing.JFrame();
        NewGame = new javax.swing.JButton();
        MoreCard = new javax.swing.JButton();
        Stay = new javax.swing.JButton();
        ChangeBet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jFrame1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 204, 255));

        NewGame.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        NewGame.setForeground(new java.awt.Color(255, 0, 51));
        NewGame.setText("New Game");
        NewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewGameMouseClicked(evt);
            }
        });
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        MoreCard.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        MoreCard.setForeground(new java.awt.Color(204, 0, 204));
        MoreCard.setText("More Card");
        MoreCard.setEnabled(false);
        MoreCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreCardMouseClicked(evt);
            }
        });

        Stay.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        Stay.setForeground(new java.awt.Color(255, 102, 0));
        Stay.setText("Stay");
        Stay.setEnabled(false);
        Stay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StayMouseClicked(evt);
            }
        });
        Stay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayActionPerformed(evt);
            }
        });

        ChangeBet.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        ChangeBet.setForeground(new java.awt.Color(51, 51, 51));
        ChangeBet.setText("Change Bet");
        ChangeBet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeBetMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        jLabel1.setText("Master");

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Master's Card");

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Master's Result");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("You");

        jLabel5.setFont(new java.awt.Font("TH Sarabun New", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 102, 0));
        jLabel5.setText("Your Card");

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("Your Result");

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        jLabel7.setText("Your money left ");

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 3, 18)); // NOI18N
        jLabel8.setText("100");

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setFont(new java.awt.Font("TH Sarabun New", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("WELCOME");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("Welcome to Pok-Deng game Enjoy:-)");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("Your Name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Stay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MoreCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChangeBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MoreCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangeBet))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NewGameActionPerformed

    private void NewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewGameMouseClicked
        if (NewGame.isEnabled() == true) {
            NewGame.setText("Continue");
            Deck = new ArrayList<>(c.deckSuit());//เรียกมาสร้างdeck
            challenger = new Player(Deck.get(0), Deck.get(2));//เรียกการ์ด
            dealer = new Player(Deck.get(1), Deck.get(3));
            String e = "0A234567891JQKr";
            int C1 = e.indexOf(Deck.get(0).toString().charAt(0));
            int C2 = e.indexOf(Deck.get(2).toString().charAt(0));
            int D1 = e.indexOf(Deck.get(1).toString().charAt(0));
            int D2 = e.indexOf(Deck.get(3).toString().charAt(0));
            
            if (m.getMoney() <= 0) {
                jLabel9.setText("Gameover");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
                m.setMoney(100);
                jLabel8.setText(m.getMoney() + "");
                NewGame.setText("NewGame");
                m.setBet(1);
                jLabel10.setText("Now your bet is  : " + m.getBet());
            } else {
                //เจ้าpok
                if(C1==14||C2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                }
                 if(D1==14||D2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Lose");
                        m.losePricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                }
                if (dealer.getValue() >= 8) {
                    if (challenger.getValue() > dealer.getValue()) {

                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPrice();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                    }
                    if (D1 == D2 && C1 != C2) {

                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(Deck.get(1).toString().charAt(0) + "Deng");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Lose");
                        m.losePrice();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    }
                    if (challenger.getValue() < dealer.getValue()) {
                        if (C1 == C2) {

                            jLabel2.setText(dealer.toString() + "");
                            jLabel3.setText(dealer.getValue() + "points");
                            jLabel5.setText(challenger.toString());
                            jLabel6.setText(Deck.get(0).toString().charAt(0) + "Deng");
                            jLabel9.setText("You Win");
                            m.winPriceD();
                            jLabel8.setText(m.getMoney() + "");
                            NewGame.setEnabled(true);
                            MoreCard.setEnabled(false);
                            Stay.setEnabled(false);

                        } else {

                            jLabel2.setText(dealer.toString() + "");
                            jLabel3.setText(dealer.getValue() + "points");
                            jLabel5.setText(challenger.toString());
                            jLabel6.setText(challenger.getValue() + "points");
                            jLabel9.setText("You Lose");
                            m.losePrice();
                            jLabel8.setText(m.getMoney() + "");
                            NewGame.setEnabled(true);
                            MoreCard.setEnabled(false);
                            Stay.setEnabled(false);
                        }
                    } else {

                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("Draw");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                    }

                } else {

                    NewGame.setEnabled(false);
                    MoreCard.setEnabled(true);
                    Stay.setEnabled(true);
                    jLabel2.setText("xxxxx:p");
                    jLabel3.setText(null);
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(challenger.getValue() + "points");
                    jLabel9.setText(null);
                    jLabel10.setText("Now your bet is  : " + m.getBet());

                    NewGame.setEnabled(false);
                    MoreCard.setEnabled(true);
                    Stay.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_NewGameMouseClicked

    private void ChangeBetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeBetMouseClicked
        String x = JOptionPane.showInputDialog(null, "your bet " + m.getBet() + " ฿ " + "\nyou have bet .");
        m.setBet(Integer.parseInt(x));
        jLabel10.setText("Now your bet is  : " + m.getBet());
    }//GEN-LAST:event_ChangeBetMouseClicked

    private void StayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StayMouseClicked
        if (Stay.isEnabled() == true) {
            String i = "0A234567891JQKr";
            int C1 = i.indexOf(Deck.get(0).toString().charAt(0));
            int C2 = i.indexOf(Deck.get(2).toString().charAt(0));
            int D1 = i.indexOf(Deck.get(1).toString().charAt(0));
            int D2 = i.indexOf(Deck.get(3).toString().charAt(0));
            String j = "A234567891";
            int Cj1 = (i.indexOf(Deck.get(0).toString().charAt(0)) % 10);
            int Cj2 = (i.indexOf(Deck.get(2).toString().charAt(0)) % 10);
            int Dj1 = (i.indexOf(Deck.get(1).toString().charAt(0)) % 10);
            int Dj2 = (i.indexOf(Deck.get(3).toString().charAt(0)) % 10);
            //deng
                    if(C1==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                }
                      if(C2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                      }if(D1==14||D2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Lose");
                        m.losePricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                
                }if (C1 == C2 || D1 == D2) {
                if (C1 == C2 && D1 == D2) {
                    if (C1 > D2 && C1 != 1) {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(Deck.get(1).toString().charAt(0) + "TWO DENG");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(Deck.get(0).toString().charAt(0) + "TWO DENG");
                        jLabel9.setText("You Win");
                        m.winPriceD();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    }
                    if (C1 == D2) {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(Deck.get(1).toString().charAt(0) + "TWO DENG");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(Deck.get(0).toString().charAt(0) + "TWO DENG");
                        jLabel9.setText("Draw");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    }
                    if (C1 == 1) {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(Deck.get(1).toString().charAt(0) + "TWO DENG");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(Deck.get(0).toString().charAt(0) + "TWO DENG");
                        jLabel9.setText("You Win");
                        m.winPriceD();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    } else {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(Deck.get(1).toString().charAt(0) + "TWO DENG");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(Deck.get(0).toString().charAt(0) + "TWO DENG");
                        jLabel9.setText("You Lose");
                        m.losePriceD();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    }
                }
                if (C1 == C2 && D1 != D2) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + " point");
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(Deck.get(0).toString().charAt(0) + " TWO DENG");
                    jLabel9.setText("You Win");
                    m.winPriceD();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                } else {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(Deck.get(1).toString().charAt(0) + " TWO DENG");
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(challenger.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceD();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);
                }

            } else {
                //basic
                if(C1==14||C2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                }
                 if(D1==14||D2==14){
                        jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Lose");
                        m.losePricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
                 }if (challenger.getValue() == dealer.getValue()) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + " point");
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(dealer.getValue() + " point");
                    jLabel9.setText("Draw");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                }
                if (challenger.getValue() > dealer.getValue()) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + " point");
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(challenger.getValue() + " point");
                    jLabel9.setText("You Win");
                    m.winPrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                }
                if (challenger.getValue() < dealer.getValue()) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + " point");
                    jLabel5.setText(challenger.toString());
                    jLabel6.setText(challenger.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                }
            }

        }
    }//GEN-LAST:event_StayMouseClicked
    private void MoreCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreCardMouseClicked

        Player challenger2 = new Player(Deck.get(0), Deck.get(2), Deck.get(4));
        Player dealer3 = new Player(Deck.get(1), Deck.get(3), Deck.get(5));

        String i = "0234567891JQKAr";
        String j = "JQK";
        String q = "0234567891";
     
        
        int C1 = i.indexOf(Deck.get(0).toString().charAt(0));
        int C2 = i.indexOf(Deck.get(2).toString().charAt(0));
        int C3 = i.indexOf(Deck.get(4).toString().charAt(0));
        int D1 = i.indexOf(Deck.get(1).toString().charAt(0));
        int D2 = i.indexOf(Deck.get(3).toString().charAt(0));
        int D3 = i.indexOf(Deck.get(5).toString().charAt(0));
        int j1 = j.indexOf(Deck.get(0).toString().charAt(0));
        int j2 = j.indexOf(Deck.get(2).toString().charAt(0));
        int j3 = j.indexOf(Deck.get(4).toString().charAt(0));
        int q1 = q.indexOf(Deck.get(0).toString().charAt(0));
        int q2 = q.indexOf(Deck.get(2).toString().charAt(0));
        int q3 = q.indexOf(Deck.get(4).toString().charAt(0));
        int dq1 = q.indexOf(Deck.get(1).toString().charAt(0));
        int dq2 = q.indexOf(Deck.get(3).toString().charAt(0));
        int dq3 = q.indexOf(Deck.get(5).toString().charAt(0));
      
        //tongj
        jLabel10.setText("Now your bet is  : " + m.getBet());
        if(C1==14||C2==14||C3==14){
            jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You Win");
                        m.winPricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
            
        }if(D1==14||D2==14||D3==14){
            jLabel2.setText(dealer.toString() + "");
                        jLabel3.setText(dealer.getValue() + "points");
                        jLabel5.setText(challenger.toString());
                        jLabel6.setText(challenger.getValue() + "points");
                        jLabel9.setText("You lose");
                        m.losePricej();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);
        }
        if (C1 == C2 && C2 == C3 || D1 == D2 && D2 == D3) {
            if (C1 == C2 && C2 == C3 && C1 == C3 && D1 != D2 && D2 != D3 && D1 != D3) {
                jLabel2.setText(dealer3.toString());
                jLabel3.setText(dealer3.getValue() + "point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " Tong");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
            if (D1 == D2 && D2 == D3 && D1 == D3 && C1 != C2 && C2 != C3 && C1 != C3) {
                jLabel2.setText(dealer3.toString());
                jLabel3.setText(dealer3.getValue() + "Tong");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " point");
                jLabel9.setText("You Lose");
                m.losePriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
            if (D1 == D2 && D2 == D3 && D1 == D3 && C1 == C2 && C2 == C3 && C1 == C3 && D1 == C2) {
                jLabel2.setText(dealer3.toString());
                jLabel3.setText(dealer3.getValue() + "Tong");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " Tong");
                jLabel9.setText("Draw");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
       
        //jdk
        }
        if (j1 != -1 && j2 != -1 && j3 != -1) {
            if (j1 != j2 && j2 != j3 && j3 != j1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " Sam lueang");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            } else {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " point");
                jLabel9.setText("You Lose");
                m.losePrice();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            }
            //เรียง
        }
        if (q1 != -1 && q2 != -1 && q3 != -1) {
            if (C1 - C2 == 1 && C2 - C3 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
            if (C1 - C3 == 1 && C3 - C2 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + "point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            }
            if (C1 - C2 == 1 && C3 - C1 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            }
            if (C2 - C1 == 1 && C1 - C3 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            }
            if (C3 - C1 == 1 && C2 - C3 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            }
            if (C3 - C2 == 1 && C2 - C1 == 1) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(dealer.getValue() + " point");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(" Straight");
                jLabel9.setText("You Win");
                m.winPriceS();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
            if (D1 == D2) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(Deck.get(1).toString().charAt(0) + " TWO DENG");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " point");
                jLabel9.setText("You Lose");
                m.losePriceD();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);

            } else {
                if (challenger2.getValue() > dealer.getValue()) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + "point");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + "point");
                    jLabel9.setText("You Win");
                    m.winPrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                } else {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + "point");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + "point");
                    jLabel9.setText("You Lose");
                    m.losePrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                }
            }
        } else {

            if (D1 == D2) {
                jLabel2.setText(dealer.toString());
                jLabel3.setText(Deck.get(1).toString().charAt(0) + " TWO DENG");
                jLabel5.setText(challenger2.toString());
                jLabel6.setText(challenger2.getValue() + " point");
                jLabel9.setText("You Lose");
                m.losePriceD();
                jLabel8.setText(m.getMoney() + "");
                NewGame.setEnabled(true);
                MoreCard.setEnabled(false);
                Stay.setEnabled(false);
            }
          
            
            if (dq1 != -1 && dq2 != -1 && dq3 != -1) {
                if (D1 - D2 == 1 && D2 - D3 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");
                }
                if (D1 - D3 == 1 && D3 - D2 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");
                }
                if (D1 - D2 == 1 && D3 - D1 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");

                }
                if (D2 - D1 == 1 && D1 - D3 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");
                }
                if (D3 - D1 == 1 && D2 - D3 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");

                }
                if (D3 - D2 == 1 && D2 - D1 == 1) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(" Straight");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceS();
                    jLabel8.setText(m.getMoney() + "");
                }
                if (D1 == D2) {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(Deck.get(1).toString().charAt(0) + " TWO DENG");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + " point");
                    jLabel9.setText("You Lose");
                    m.losePriceD();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                } else {
                    if (challenger2.getValue() > dealer.getValue()) {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(dealer.getValue() + "point");
                        jLabel5.setText(challenger2.toString());
                        jLabel6.setText(challenger2.getValue() + "point");
                        jLabel9.setText("You Win");
                        m.winPrice();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    } else {
                        jLabel2.setText(dealer.toString());
                        jLabel3.setText(dealer.getValue() + "point");
                        jLabel5.setText(challenger2.toString());
                        jLabel6.setText(challenger2.getValue() + "point");
                        jLabel9.setText("You Lose");
                        m.losePrice();
                        jLabel8.setText(m.getMoney() + "");
                        NewGame.setEnabled(true);
                        MoreCard.setEnabled(false);
                        Stay.setEnabled(false);

                    }
                }

            } else {
                if (challenger2.getValue() > dealer3.getValue()) {
                    jLabel2.setText(dealer3.toString());
                    jLabel3.setText(dealer3.getValue() + "point");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + "point");
                    jLabel9.setText("You Win");
                    m.winPrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                } else {
                    jLabel2.setText(dealer.toString());
                    jLabel3.setText(dealer.getValue() + "point");
                    jLabel5.setText(challenger2.toString());
                    jLabel6.setText(challenger2.getValue() + "point");
                    jLabel9.setText("You Lose");
                    m.losePrice();
                    jLabel8.setText(m.getMoney() + "");
                    NewGame.setEnabled(true);
                    MoreCard.setEnabled(false);
                    Stay.setEnabled(false);

                }

            }

        }


    }//GEN-LAST:event_MoreCardMouseClicked

    private void StayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String x = JOptionPane.showInputDialog(null, "Plese enter your name" + ":)" + "\n What your name? .");
        jLabel4.setText(x);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeGameRun().setVisible(true);
                new PokeGameRun().setLayout(new FlowLayout());
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeBet;
    private javax.swing.JButton MoreCard;
    private javax.swing.JButton NewGame;
    private javax.swing.JButton Stay;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    static Creation c = new Creation();
    static Money m = new Money();
    static Player dealer, challenger;
    static ArrayList<Card> Deck = new ArrayList<>();

}
