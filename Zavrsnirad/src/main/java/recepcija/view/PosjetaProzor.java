/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recepcija.view;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.apache.commons.collections.comparators.ComparatorChain;
import recepcija.controller.ObradaKorisnik;
import recepcija.controller.ObradaPosjeta;
import recepcija.controller.ObradaUsluga;
import recepcija.model.Korisnik;
import recepcija.model.Usluga;
import recepcija.model.Posjeta;
import recepcija.util.ZavrsniException;
import recepcija.util.ZavrsniUtil;

/**
 *
 * @author Igor
 */
public class PosjetaProzor extends javax.swing.JFrame {
    
    private ObradaPosjeta op;
    private ObradaKorisnik ok;
    private Date datum;
    private SimpleDateFormat sdf;
    private ComparatorChain veza;
    private Korisnik izabraniKorisnik;

    /**
     * Creates new form DjelatnikProzor
     */
    public PosjetaProzor() {
        initComponents();
        op = new ObradaPosjeta();
        ok = new ObradaKorisnik();
        setTitle(ZavrsniUtil.getNaslov("Posjete"));
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        lstPosjete.setCellRenderer(new PrikazPosjeta());
        veza = new ComparatorChain();
        veza.addComparator(new DatumPrijaveComparator());
        veza.addComparator(new DatumOdjaveComparator());
        ucitaj();
        ucitajUsluge();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPosjete = new javax.swing.JList<>();
        btnKreiraj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBrojOdraslih = new javax.swing.JTextField();
        txtBrojDjece = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBrojSoba = new javax.swing.JTextField();
        dpDatumPrijave = new com.github.lgooddatepicker.components.DatePicker();
        dpDatumOdjave = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUslugeNaPosjeti = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSviKorisnici = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        txtTraziKorisnika = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnTraziDatum = new javax.swing.JButton();
        lblKorisnik = new javax.swing.JLabel();
        dpTraziDatum = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSveUsluge = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnDodajUslugu = new javax.swing.JButton();
        btnUkloni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstPosjete.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPosjete.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPosjeteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPosjete);

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel1.setText("Broj odraslih");

        jLabel3.setText("Broj djece");

        jLabel5.setText("Broj soba");

        jLabel7.setText("Datum prijave");

        jLabel8.setText("Datum odjave");

        jLabel9.setText("Korisnik");

        lstUslugeNaPosjeti.setToolTipText("");
        jScrollPane2.setViewportView(lstUslugeNaPosjeti);

        jLabel2.setText("Usluge na posjeti");

        lstSviKorisnici.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSviKorisnici.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSviKorisniciValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstSviKorisnici);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel4.setText("Traži korisnika");

        jLabel10.setText("Traži posjetu");

        btnTraziDatum.setText("Traži");
        btnTraziDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziDatumActionPerformed(evt);
            }
        });

        lblKorisnik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lstSveUsluge.setToolTipText("");
        jScrollPane4.setViewportView(lstSveUsluge);

        jLabel6.setText("Usluge");

        btnDodajUslugu.setText("Dodaj");
        btnDodajUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajUsluguActionPerformed(evt);
            }
        });

        btnUkloni.setText("Ukloni");
        btnUkloni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUkloniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dpTraziDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraziDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKorisnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(dpDatumPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(dpDatumOdjave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBrojSoba, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBrojOdraslih, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBrojDjece, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKreiraj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajUslugu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnUkloni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTraziKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTraziKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi)
                            .addComponent(btnDodajUslugu)
                            .addComponent(btnUkloni)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKorisnik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTraziDatum)
                                .addComponent(dpTraziDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDatumPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDatumOdjave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojSoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojOdraslih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojDjece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKreiraj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisi)
                                .addGap(0, 58, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPosjeteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPosjeteValueChanged
        if (evt.getValueIsAdjusting() || lstPosjete.getSelectedValue() == null) {
            return;
        }
        op.setEntitet(lstPosjete.getSelectedValue());
        var p = op.getEntitet();
        if (p.getDatumPrijave() != null) {
            dpDatumPrijave.setDate(p.getDatumPrijave().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpDatumPrijave.setDate(null);
        }
        if (p.getDatumOdjave() != null) {
            dpDatumOdjave.setDate(p.getDatumOdjave().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpDatumOdjave.setDate(null);
        }
        txtBrojSoba.setText(p.getBrojSoba().toString());
        txtBrojOdraslih.setText(p.getBrojOdraslih().toString());
        if (p.getBrojDjece() != null) {
            txtBrojDjece.setText(p.getBrojDjece().toString());
        } else {
            txtBrojDjece.setText("0");
        }
        
        DefaultListModel<Usluga> m = new DefaultListModel<>();
        m.addAll(p.getUsluge());
        lstUslugeNaPosjeti.setModel(m);
        
        lblKorisnik.setText(p.getKorisnik().getIme() + " " + p.getKorisnik().getPrezime());
        izabraniKorisnik = p.getKorisnik();
    }//GEN-LAST:event_lstPosjeteValueChanged

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        if (op.getEntitet() == null) {
            op.setEntitet(new Posjeta());
        }
        vrijednosti();
        try {
            op.create();
        } catch (ZavrsniException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        ucitaj();
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (op.getEntitet() == null || lstPosjete.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        vrijednosti();
        
        try {
            op.update();
            ucitaj();
        } catch (ZavrsniException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (op.getEntitet() == null || lstPosjete.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Sigurno bristati ?", "Brisanje",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            op.delete();
            ucitaj();
        } catch (ZavrsniException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Korisnik> m = new DefaultListModel<>();
        List<Korisnik> korisnici;
        if (txtTraziKorisnika.getText().trim().equals("")) {
            korisnici = new ObradaKorisnik().read();
        } else {
            korisnici = new ObradaKorisnik().read(txtTraziKorisnika.getText());
        }
        for (Korisnik k : korisnici) {
            m.addElement(k);
        }
        lstSviKorisnici.setModel(m);

    }//GEN-LAST:event_btnTraziActionPerformed

    private void lstSviKorisniciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSviKorisniciValueChanged
        if (evt.getValueIsAdjusting() || lstSviKorisnici.getSelectedValue() == null) {
            return;
        }
        lblKorisnik.setText(lstSviKorisnici.getSelectedValue().getIme() + " " + lstSviKorisnici.getSelectedValue().getPrezime());
        izabraniKorisnik = lstSviKorisnici.getSelectedValue();
    }//GEN-LAST:event_lstSviKorisniciValueChanged

    private void btnDodajUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajUsluguActionPerformed
        if (lstSveUsluge.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Morate izabrati uslugu/e za dodati");
            return;
        }
        DefaultListModel<Usluga> m;
        
        if (op.getEntitet() != null) {
            m = (DefaultListModel<Usluga>) lstUslugeNaPosjeti.getModel();
        } else {
            op.setEntitet(new Posjeta());
            op.getEntitet().setUsluge(new ArrayList<>());
            vrijednosti();
            m = new DefaultListModel<>();
            lstUslugeNaPosjeti.setModel(m);
        }
        if (op.getEntitet().getUsluge() == null) {
            op.getEntitet().setUsluge(new ArrayList<>());
        }
        for (Usluga u : lstSveUsluge.getSelectedValuesList()) {
            op.getEntitet().getUsluge().add(u);
            m.addElement(u);
        }
        lstUslugeNaPosjeti.repaint();
    }//GEN-LAST:event_btnDodajUsluguActionPerformed

    private void btnUkloniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUkloniActionPerformed
        if (lstUslugeNaPosjeti.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Morate izabrati uslugu/e za brisati");
            return;
        }
        DefaultListModel<Usluga> m = (DefaultListModel<Usluga>) lstUslugeNaPosjeti.getModel();
        for (Usluga u : lstUslugeNaPosjeti.getSelectedValuesList()) {
            m.removeElement(u);
            for (Usluga mu : op.getEntitet().getUsluge()) {
                if (mu.getSifra().equals(u.getSifra())) {
                    op.getEntitet().getUsluge().remove(mu);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnUkloniActionPerformed

    private void btnTraziDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziDatumActionPerformed
        if (dpTraziDatum.getDate() == null) {
            return;
        }
        datum = Date.from(dpTraziDatum.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        ucitajPosjeteDatum();
    }//GEN-LAST:event_btnTraziDatumActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajUslugu;
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JButton btnTraziDatum;
    private javax.swing.JButton btnUkloni;
    private com.github.lgooddatepicker.components.DatePicker dpDatumOdjave;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPrijave;
    private com.github.lgooddatepicker.components.DatePicker dpTraziDatum;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblKorisnik;
    private javax.swing.JList<Posjeta> lstPosjete;
    private javax.swing.JList<Usluga> lstSveUsluge;
    private javax.swing.JList<Korisnik> lstSviKorisnici;
    private javax.swing.JList<Usluga> lstUslugeNaPosjeti;
    private javax.swing.JTextField txtBrojDjece;
    private javax.swing.JTextField txtBrojOdraslih;
    private javax.swing.JTextField txtBrojSoba;
    private javax.swing.JTextField txtTraziKorisnika;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        DefaultListModel<Posjeta> m = new DefaultListModel<>();
        List<Posjeta> posjete = op.read();
        Collections.sort(posjete, veza);
        for (Posjeta p : posjete) {
            m.addElement(p);
        }
        lstPosjete.setModel(m);
    }
    
    private void vrijednosti() {
        var p = op.getEntitet();
        try {
            p.setDatumPrijave(Date.from(dpDatumPrijave.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        } catch (Exception e) {
            p.setDatumPrijave(null);
        }
        try {
            p.setDatumOdjave(Date.from(dpDatumOdjave.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        } catch (Exception e) {
            p.setDatumOdjave(null);
        }
        try {
            p.setBrojSoba(Integer.parseInt(txtBrojSoba.getText()));
        } catch (Exception e) {
            p.setBrojSoba(null);
        }
        try {
            p.setBrojOdraslih(Integer.parseInt(txtBrojOdraslih.getText()));
        } catch (Exception e) {
            p.setBrojOdraslih(null);
        }
        try {
            p.setBrojDjece(Integer.parseInt(txtBrojDjece.getText()));
        } catch (Exception e) {
            p.setBrojDjece(0);
        }
        p.setKorisnik(izabraniKorisnik);
    }
    
    private void ucitajPosjeteDatum() {
        DefaultListModel<Posjeta> m = new DefaultListModel<>();
        String uvjet = sdf.format(datum);
        List<Posjeta> posjete = op.read(uvjet);
        for (Posjeta p : posjete) {
            m.addElement(p);
        }
        lstPosjete.setModel(m);
    }
    
    private void ucitajUsluge() {
        DefaultListModel<Usluga> m = new DefaultListModel<>();
        List<Usluga> usluge = new ObradaUsluga().read();
        for (Usluga u : usluge) {
            m.addElement(u);
        }
        lstSveUsluge.setModel(m);
    }
}
