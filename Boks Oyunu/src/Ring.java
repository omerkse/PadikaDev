public class Ring {
    Boksor bok1;
    Boksor bok2;

    int minAgirlik;
    int maxAgirlik;
    int sayi;


    public Ring(Boksor bok1, Boksor bok2, int maxAgirlik, int minAgirlik) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.maxAgirlik = maxAgirlik;
        this.minAgirlik = minAgirlik;
    }

    public void baslat() {
        if (agirlikKontrol()) {
            while (this.bok1.can > 0 && this.bok2.can > 0) {
                System.out.println("==========Yeni Round=========");
                switch (sayi()) {
                    case 1:
                        this.bok2.can = this.bok1.vurus(this.bok2);
                        if (kazanan()) {
                            break;
                        }
                        this.bok1.can = this.bok2.vurus(this.bok1);
                        if (kazanan()) {
                            break;
                        }
                    case 2:
                        this.bok1.can = this.bok2.vurus(this.bok1);
                        if (kazanan()) {
                            break;
                        }
                        this.bok2.can = this.bok1.vurus(this.bok2);
                        if (kazanan()) {
                            break;
                        }

                }

                scoreyazdir();
            }
        } else {
            System.out.println("Sporcularin Agirliklari Uyusmuyor!");
        }

    }

    public boolean agirlikKontrol() {
        return (this.bok1.agirlik >= minAgirlik && this.bok1.agirlik <= maxAgirlik) && (this.bok2.agirlik >= minAgirlik && this.bok2.agirlik <= maxAgirlik);
    }

    public boolean kazanan() {
        if (this.bok1.can == 0) {
            System.out.println("Kazanan Boksor:" + bok2.name);
            return true;
        } else if (this.bok2.can == 0) {
            System.out.println("Kazanan Boksor:" + bok1.name);
            return true;
        }
        return false;
    }

    public void scoreyazdir() {
        System.out.println("-----------");
        System.out.println(this.bok1.name + "Kalan Can:  " + this.bok1.can);
        System.out.println(this.bok2.name + "Kalan Can:  " + this.bok2.can);
    }

    public int sayi() {
        sayi = (int) (Math.random() * 2 + 1);

        return sayi;
    }

}
