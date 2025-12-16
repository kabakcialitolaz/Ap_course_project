import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * GUI Hesap Makinesi (v2)
 * - Arayüz hazır.
 * - Öğrencinin görevi: computeResult(...) metodunu tamamlamak ve hata kontrollerini yapmak.
 */
public class CalculatorV2 extends JFrame implements ActionListener {

    // --- UI Bileşenleri BURALARA ÇALIŞMANI VE HANGİ KODUN NE ANLAMA GELDİĞİNİ GOOGLE'DAN ARAŞTIRMANI, SONRA BURADA YORUM SATIRINDA
    // --- NOT ALMANI İSTİYORUM. BU SAYEDE KODU DAHA İYİ ANLAMIŞ OLURSUN. ---
    private final JTextField txtNum1 = new JTextField();
    // bu kod 1 numarayı girmemizi saağlar
    private final JTextField txtNum2 = new JTextField();
    // bu kodda 2. numarayı girmemizi sağlar
    private final JComboBox<String> cmbOp = new JComboBox<>(new String[]{"+", "-", "*", "/"});
    // bu kod sayesinde hangi işlemleri yapabileceğimizi görürüz
    private final JButton btnHesapla = new JButton("Hesapla");
    // burada j button tıklananbilir buton manasına gelir
    private final JButton btnTemizle = new JButton("Temizle");
    // bu ise alanları temizler
    private final JLabel lblSonuc = new JLabel("Sonuç: ");
    // j label sayesinde yazı gösterilmiş olur sonuç burda kullanıcıya gösterilmiş olur

    public CalculatorV2() {
        super("Hesap Makinesi");

        // Pencere ayarları
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 220);
        setLocationRelativeTo(null);

        // Layout: Basit bir grid + alt satır sonuç
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Satır 0: Num1
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("1. Sayı:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(txtNum1, gbc);

        // Satır 1: Operasyon
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("İşlem:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(cmbOp, gbc);

        // Satır 2: Num2
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("2. Sayı:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(txtNum2, gbc);

        // Satır 3: Butonlar
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        btnPanel.add(btnHesapla);
        btnPanel.add(btnTemizle);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(btnPanel, gbc);

        // Satır 4: Sonuç label
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 2;
        lblSonuc.setFont(lblSonuc.getFont().deriveFont(Font.BOLD, 14f));
        panel.add(lblSonuc, gbc);

        add(panel);

        // Event bağlama
        btnHesapla.addActionListener(this);
        btnTemizle.addActionListener(this);

        // Bonus: Enter’a basınca hesapla
        txtNum2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnTemizle) {
            txtNum1.setText("");
            txtNum2.setText("");
            cmbOp.setSelectedIndex(0);
            lblSonuc.setText("Sonuç: ");
            txtNum1.requestFocus();
            return;
        }

        // Hesapla (buton veya Enter)
        if (src == btnHesapla || src == txtNum2) {
            // 1) Inputları al
            String s1 = txtNum1.getText().trim();
            String s2 = txtNum2.getText().trim();
            String op = (String) cmbOp.getSelectedItem();

            // 2) Basit doğrulama (BURAYI GELİŞTİREBİLİRSİN)
            if (s1.isEmpty() || s2.isEmpty()) {
                showError("Lütfen iki sayıyı da gir.");
                return;
            }

            // 3) Parse et
            double n1, n2;
            try {
                n1 = Double.parseDouble(s1);
                n2 = Double.parseDouble(s2);
            } catch (NumberFormatException ex) {
                showError("Geçersiz sayı girdin veya harf Örn: 12, 3. R 5");
                return;
            }

            // 4) Hesapla (BURAYI SEN YAPACAKSIN)
            Double result = computeResult(n1, n2, op);

            // 5) Sonucu yazdır (computeResult null dönerse hata zaten gösterilmiş olmalı)
            if (result != null) {
                lblSonuc.setText(String.format("Sonuç: %.2f", result)); // 2 ondalık
            }
        }
    }

    /**
     * YAPACAKLARIN:
     * - op + - * / işlemlerini uygula
     * - 0'a bölme kontrolü yap: op "/" ve n2 == 0 ise hata göster, null dön
     * - op beklenmeyen bir şeyse hata göster, null dön
     */
    private Double computeResult(double n1, double n2, String op) {
        switch (op){
            case "+":
                return n1 + n2 ;
            case "-":
                return n1 - n2 ;
            case "*":
                return n1 * n2 ;
            case "/":
                if (n2==0){
                    showError("bir sayıyı sıfıra bölemezsin!!!!");
                    return null ;
                }
                return n1/n2 ;

            default:
                showError("bilinmeyen işlem"+ op);

        }



        // İPUCU: switch-case burada çok iyi olur. Ne olduğuna Youtube üzerinden bakabilirsin.
        // switch (op) { case "+": return n1 + n2; ... }

        // Şimdilik "tamamlanmadı" mesajı:
        showError("computeResult(...) henüz tamamlanmadı. (Ödev)");
        return null;
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Hata", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        // Swing’i güvenli başlatma
        SwingUtilities.invokeLater(() -> {
            CalculatorV2 app = new CalculatorV2();
            app.setVisible(true);
        });
    }
}