
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class resturant1 extends javax.swing.JFrame {


       // هنا عرف الأسعار
    double priceBroast = 15.0;
    double pricePizza = 20.0;
    double priceZinger = 18.0;
    double priceFajita = 22.0;

    double priceStrawberry = 10.0;
    double priceMango = 12.0;
    double priceGrapes = 11.0;
    double priceLemon = 8.0;

    double priceSpicy = 2.0;   // سبايسي +2 ريال
    double priceCheese = 3.0;  // جبن +3 ريال

     // ✅ عداد الفاتورة
    int billNumberCounter = 1;  // يبدأ من 1
    
    public resturant1() {
       
        initComponents();
        
         
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        B = new javax.swing.JSpinner();
        Bchese = new javax.swing.JCheckBox();
        Bprice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        P = new javax.swing.JSpinner();
        Pchese = new javax.swing.JCheckBox();
        Pprice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Z = new javax.swing.JSpinner();
        Zchese = new javax.swing.JCheckBox();
        Zprice = new javax.swing.JLabel();
        fajita = new javax.swing.JLabel();
        F = new javax.swing.JSpinner();
        Fchese = new javax.swing.JCheckBox();
        Fprice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        S = new javax.swing.JSpinner();
        Sprice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        M = new javax.swing.JSpinner();
        Mprice = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        G = new javax.swing.JSpinner();
        Gprice = new javax.swing.JLabel();
        Lprice = new javax.swing.JLabel();
        L = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        subtotal = new javax.swing.JLabel();
        vattotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        calculatebill = new javax.swing.JButton();
        savebill = new javax.swing.JButton();
        newbill = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        billnumber = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("نظام اداره  المطاعم");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الماكولات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("بروست");

        B.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        B.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BStateChanged(evt);
            }
        });

        Bchese.setText("سبايسي");
        Bchese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Bchese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcheseActionPerformed(evt);
            }
        });

        Bprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bprice.setText("0.0ريال");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("بيتزا عادي");

        P.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        P.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PStateChanged(evt);
            }
        });

        Pchese.setText("جبن");
        Pchese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Pchese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcheseActionPerformed(evt);
            }
        });

        Pprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pprice.setText("0.0ريال");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("زنجر");

        Z.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        Z.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ZStateChanged(evt);
            }
        });

        Zchese.setText("جبن");
        Zchese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Zchese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZcheseActionPerformed(evt);
            }
        });

        Zprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Zprice.setText("0.0ريال");

        fajita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fajita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fajita.setText("فاهيتا");

        F.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        F.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FStateChanged(evt);
            }
        });

        Fchese.setText("جبن");
        Fchese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Fchese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcheseActionPerformed(evt);
            }
        });

        Fprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fprice.setText("0.0ريال");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pprice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Pchese, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bchese)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(B)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(P)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Zprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Zchese, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fchese))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(F)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fajita, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bchese)
                    .addComponent(Bprice))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Pchese)
                        .addComponent(Pprice)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Zprice))
                    .addComponent(Zchese))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fajita)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fprice))
                    .addComponent(Fchese))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "العصائر", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("فرواله");

        S.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        S.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SStateChanged(evt);
            }
        });

        Sprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sprice.setText("0.0ريال");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("مانجو");

        M.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        M.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MStateChanged(evt);
            }
        });

        Mprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Mprice.setText("0.0ريال");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("عرايسي");

        G.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        G.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GStateChanged(evt);
            }
        });

        Gprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Gprice.setText("0.0ريال");

        Lprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lprice.setText("0.0ريال");

        L.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        L.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LStateChanged(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("ليمون");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Gprice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lprice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Mprice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Sprice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Sprice, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mprice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gprice))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lprice))
                .addGap(19, 19, 19))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        subtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotal.setText("المجموع:0.0ريال");

        vattotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vattotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vattotal.setText("الضريبه:0.0ريال");

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("الاجمالي:0.0ريال");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vattotal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vattotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        calculatebill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculatebill.setText("حساب");
        calculatebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebillActionPerformed(evt);
            }
        });

        savebill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savebill.setText("حفظ الفاتوره");
        savebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebillActionPerformed(evt);
            }
        });

        newbill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newbill.setText("فاتوره جديده");
        newbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calculatebill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(newbill)
                        .addGap(18, 18, 18)
                        .addComponent(savebill)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(calculatebill)
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebill)
                    .addComponent(newbill))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("خروج");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        billnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        billnumber.setText("رقم الفاتوره:1");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DC\\OneDrive\\الصور\\Screenshots\\OIF.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(exit))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(billnumber)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(billnumber)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BStateChanged
   // عباره عن ميثود
     int qty = (int) B.getValue(); 
    double totalPrice = qty * priceBroast; // السعر الاصلي
    
    if(Bchese.isSelected()){
        totalPrice += qty * priceSpicy; 
    }
   
    Bprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_BStateChanged

    private void calculatebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebillActionPerformed
double subtotalValue = 0;


 // بروست
      int qtyB = (int)B.getValue();
    if (qtyB > 0) {
        double broastTotal = qtyB * priceBroast;
        if (Bchese.isSelected()) {
            broastTotal += qtyB * priceSpicy; // سبايسي للبروست
        }
        subtotalValue += broastTotal;
    }

    // ================= البيتزا =================
    int qtyP = (int)P.getValue();
    if (qtyP > 0) {
        double pizzaTotal = qtyP * pricePizza;
        if (Pchese.isSelected()) {
            pizzaTotal += qtyP * priceCheese; // جبنة للبيتزا
        }
        subtotalValue += pizzaTotal;
    }

    // ================= الزنجر =================
    int qtyZ = (int)Z.getValue();
    if (qtyZ > 0) {
        double zingerTotal = qtyZ * priceZinger;
        if (Zchese.isSelected()) {
            zingerTotal += qtyZ * priceCheese; // جبنة للزنجر
        }
        subtotalValue += zingerTotal;
    }

 
   // فاهيتا
    int qtyF = (int)F.getValue();
    subtotalValue += qtyF * priceFajita;
    if (Fchese.isSelected()) {
        subtotalValue += qtyF * priceCheese; // جبنة للفاهيتا
    }



subtotalValue += (int)S.getValue() * priceStrawberry;
subtotalValue += (int)M.getValue() * priceMango;
subtotalValue += (int)G.getValue() * priceGrapes;
subtotalValue += (int)L.getValue() * priceLemon;

// ضريبة 15%
double vat = subtotalValue * 0.15;
double totalValue = subtotalValue + vat;

subtotal.setText("المجموع: " + subtotalValue + " ريال");
vattotal.setText("الضريبة: " + vat + " ريال");
total.setText("الإجمالي: " + totalValue + " ريال");




        // TODO add your handling code here:
    }//GEN-LAST:event_calculatebillActionPerformed

    private void PStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PStateChanged

          int qty = (int) P.getValue(); 
    double totalPrice = qty * pricePizza; // السعر الاصلي
    
       if(Pchese.isSelected()){
        totalPrice += qty * priceSpicy; 
    }
   
    
    Pprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_PStateChanged

    private void ZStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ZStateChanged

          int qty = (int) Z.getValue(); 
    double totalPrice = qty * priceZinger;
    
       if(Zchese.isSelected()){
        totalPrice += qty * priceSpicy; 
    }
   
    
    Zprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_ZStateChanged

    private void FStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FStateChanged
        
          int qty = (int) F.getValue(); 
    double totalPrice = qty * priceFajita;
    
       if(Fchese.isSelected()){
        totalPrice += qty * priceSpicy; 
    }
   
    
    Fprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_FStateChanged

    private void SStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SStateChanged
       int qty = (int) S.getValue(); 
    double totalPrice = qty * priceStrawberry;
    
    
    
    Sprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_SStateChanged

    private void MStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MStateChanged
       
        int qty = (int) M.getValue(); 
    double totalPrice = qty * priceMango;
    Mprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_MStateChanged

    private void GStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GStateChanged
        
        int qty = (int) G.getValue(); 
    double totalPrice = qty * priceGrapes;
    Gprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_GStateChanged

    private void LStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LStateChanged
       
        int qty = (int) L.getValue(); 
    double totalPrice = qty * priceLemon;
    Lprice.setText(totalPrice + " ريال");
    }//GEN-LAST:event_LStateChanged

    
    private void savebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebillActionPerformed
        
        try {
            try (FileWriter writer = new FileWriter("bill.txt", true) // append mode
            ) {
                writer.write("===== فاتورة جديدة =====\n");
                writer.write("المجموع: " + subtotal.getText() + "\n");
                writer.write("الضريبة: " + vattotal.getText() + "\n");
                writer.write("الإجمالي: " + total.getText() + "\n");
                writer.write("======================\n\n");
            }
    JOptionPane.showMessageDialog(this, "تم حفظ الفاتورة بنجاح");
    billNumberCounter++;
    billnumber.setText("رقم الفاتورة:"+ billNumberCounter);
    
} catch (IOException e) {
    JOptionPane.showMessageDialog(this, "خطأ في حفظ الفاتورة");
}

    }//GEN-LAST:event_savebillActionPerformed

    private void newbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbillActionPerformed
      
        B.setValue(0);
P.setValue(0);
Z.setValue(0);
F.setValue(0);

S.setValue(0);
M.setValue(0);
G.setValue(0);
L.setValue(0);

Bprice.setText("0");
Pprice.setText("0");
Zprice.setText("0");
Fprice.setText("0");

Sprice.setText("0");
Mprice.setText("0");
Gprice.setText("0");
Lprice.setText("0");

subtotal.setText("0");
vattotal.setText("0");
total.setText("0");

    }//GEN-LAST:event_newbillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

    private void FcheseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcheseActionPerformed
        
          if (Fchese.isSelected()) {
             JOptionPane.showMessageDialog(this, "تم اضافة جبن +2 ريال");
         } else {
             JOptionPane.showMessageDialog(this, "تم الغاء جبن");
         }
    }//GEN-LAST:event_FcheseActionPerformed

    private void BcheseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcheseActionPerformed
       
         if (Bchese.isSelected()) {
             JOptionPane.showMessageDialog(this, "تم اضافة سبايسي +2 ريال");
         } else {
             JOptionPane.showMessageDialog(this, "تم الغاء سبايسي");
         }
    }//GEN-LAST:event_BcheseActionPerformed

    private void PcheseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcheseActionPerformed
        
          if (Pchese.isSelected()) {
             JOptionPane.showMessageDialog(this, "تم اضافة جبن +2 ريال");
         } else {
             JOptionPane.showMessageDialog(this, "تم الغاء جبن");
         }
    }//GEN-LAST:event_PcheseActionPerformed

    private void ZcheseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZcheseActionPerformed
        
          if (Zchese.isSelected()) {
             JOptionPane.showMessageDialog(this, "تم اضافة جبن +2 ريال");
         } else {
             JOptionPane.showMessageDialog(this, "تم الغا ءجبن");
         }
    }//GEN-LAST:event_ZcheseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new resturant1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner B;
    private javax.swing.JCheckBox Bchese;
    private javax.swing.JLabel Bprice;
    private javax.swing.JSpinner F;
    private javax.swing.JCheckBox Fchese;
    private javax.swing.JLabel Fprice;
    private javax.swing.JSpinner G;
    private javax.swing.JLabel Gprice;
    private javax.swing.JSpinner L;
    private javax.swing.JLabel Lprice;
    private javax.swing.JSpinner M;
    private javax.swing.JLabel Mprice;
    private javax.swing.JSpinner P;
    private javax.swing.JCheckBox Pchese;
    private javax.swing.JLabel Pprice;
    private javax.swing.JSpinner S;
    private javax.swing.JLabel Sprice;
    private javax.swing.JSpinner Z;
    private javax.swing.JCheckBox Zchese;
    private javax.swing.JLabel Zprice;
    private javax.swing.JButton billnumber;
    private javax.swing.JButton calculatebill;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fajita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton newbill;
    private javax.swing.JButton savebill;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel total;
    private javax.swing.JLabel vattotal;
    // End of variables declaration//GEN-END:variables

    private void updateBprice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
