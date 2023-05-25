/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.view;
import UTS_A.controller.WarnetController.*;
import UTS_A.model.Pelanggan;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author acer
 */

public class FormWarnet {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;

    public FormWarnet() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        JLabel lblKodePelanggan = new JLabel("Kode Pelanggan:");
        panel.add(lblKodePelanggan);

        JTextField txtKodePelanggan = new JTextField();
        panel.add(txtKodePelanggan);
        txtKodePelanggan.setColumns(10);

        JLabel lblNamaPelanggan = new JLabel("Nama Pelanggan:");
        panel.add(lblNamaPelanggan);

        JTextField txtNamaPelanggan = new JTextField();
        panel.add(txtNamaPelanggan);
        txtNamaPelanggan.setColumns(10);

        JLabel lblJenisPelanggan = new JLabel("Jenis Pelanggan:");
        panel.add(lblJenisPelanggan);

        JTextField txtJenisPelanggan = new JTextField();
        panel.add(txtJenisPelanggan);
        txtJenisPelanggan.setColumns(10);

        JLabel lblTglMasuk = new JLabel("Tanggal Masuk:");
        panel.add(lblTglMasuk);

        JTextField txtTglMasuk = new JTextField();
        panel.add(txtTglMasuk);
        txtTglMasuk.setColumns(10);

        JLabel lblJamMasuk = new JLabel("Jam Masuk:");
        panel.add(lblJamMasuk);

        JTextField txtJamMasuk = new JTextField();
        panel.add(txtJamMasuk);
        txtJamMasuk.setColumns(10);

        JLabel lblJamKeluar = new JLabel("Jam Keluar:");
        panel.add(lblJamKeluar);

        JTextField txtJamKeluar = new JTextField();
        panel.add(txtJamKeluar);
        txtJamKeluar.setColumns(10);

        JButton btnHitung = new JButton("Hitung");
        panel.add(btnHitung);

        table = new JTable();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Kode Pelanggan");
        tableModel.addColumn("Nama Pelanggan");
        tableModel.addColumn("Jenis Pelanggan");
        tableModel.addColumn("Total Bayar");
        table.setModel(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kodePelanggan = txtkodePelanggan.getText();
                String namaPelanggan = txtnamaPelanggan.getText();
                String jenisPelanggan = txtjenisPelanggan.getText();
                String tglMasuk = txtTglMasuk.getText();
                int jamMasuk = Integer.parseInt(txtJamMasuk.getText());
                int jamKeluar = Integer.parseInt(txtJamKeluar.getText());

                Pelanggan pelanggan = new Pelanggan(kodePelanggan, namaPelanggan, jenisPelanggan);
                WarnetController warnet = new WarnetController(pelanggan, tglMasuk, jamMasuk, jamKeluar);
                int totalBayar = warnet.hitungTotalBayar();

                Object[] rowData = {kodePelanggan, namaPelanggan, jenisPelanggan, totalBayar};
                tableModel.addRow(rowData);
                txtkodePelanggan.setText("");
                txtnamaPelanggan.setText("");
                txtjenisPelanggan.setText("");
                txtTglMasuk.setText("");
                txtJamMasuk.setText("");
                txtJamKeluar.setText("");
            }
        });
    }

    public void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        FormWarnet main = new FormWarnet();
        main.show();
    }
}