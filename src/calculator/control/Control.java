package calculator.control;

import calculator.model.Model;

/**
 *
 * @author Misty
 */
public class Control implements AksiCalculator {

    private int hasil;

    public Control() {
    }

    @Override
    public void tambah(Model model) {
        hasil = model.getBilangan1() + model.getBilangan2();
        model.setHasil(hasil);
    }

    @Override
    public void kurang(Model model) {
        hasil = model.getBilangan1() - model.getBilangan2();
        model.setHasil(hasil);
    }

    @Override
    public void kali(Model model) {
        hasil = model.getBilangan1() * model.getBilangan2();
        model.setHasil(hasil);
    }

    @Override
    public void bagi(Model model) {
        hasil = model.getBilangan1() / model.getBilangan2();
        model.setHasil(hasil);
    }
}
