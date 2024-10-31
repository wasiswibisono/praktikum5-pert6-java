abstract class BangunDatar {
}

class Lingkaran extends BangunDatar {
    int r; 

    Lingkaran(int r) {
        this.r = r;
    }

    float luas() {
        return (float) (Math.PI * r * r);
    }

    float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

class Segitiga extends BangunDatar {
    int alas, tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float luas() {
        return (float) (0.5 * alas * tinggi);
    }

    float keliling() {
        return 3 * alas;
    }
}

class Persegi extends BangunDatar {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    float luas() {
        return sisi * sisi;
    }

    float keliling() {
        return 4 * sisi;
    }
}

public class Utama {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(5, 10);
        Persegi persegi = new Persegi(4);

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());
    }
}
