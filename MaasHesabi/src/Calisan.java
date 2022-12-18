public class Calisan {
    String adSoyad;
    double maas;
    int haftalikCalismaS;
    int isBaslangicYil;


    public Calisan(String adSoyad, double maas, int haftalikCalismaS, int isBaslangicYil) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.haftalikCalismaS = haftalikCalismaS;
        this.isBaslangicYil = isBaslangicYil;
    }

    public double vergiHesapla() {
        if (maas >= 1000) {
            return maas * 0.03;
        }
        return 0;
    }

    public double mesai() {
        if (haftalikCalismaS - 40 > 0) {
            int bonus = (haftalikCalismaS - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double yillikZam() {
        int yil = 2021 - isBaslangicYil;
        if (yil < 10) {
            return maas * 0.05;
        } else if (yil >= 10 && yil <= 20) {
            return maas * 0.1;
        } else {
            return maas * 0.15;
        }
    }

    public double toplam() {
        return maas + yillikZam() + mesai() - vergiHesapla();
    }

    @Override
    public String toString() {
        return "Calisanin " +
                "Adi Soyadi:" + adSoyad +
                "\nMaasi:" + maas +
                "\nHaftalik Calisma Saati:" + haftalikCalismaS +
                "\nIse Basladigi Tarih:" + isBaslangicYil ;
    }
}
