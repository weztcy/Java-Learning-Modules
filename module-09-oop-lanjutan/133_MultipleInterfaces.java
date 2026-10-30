// Mendemonstrasikan multiple interface implementation untuk mengatasi ketiadaan multiple inheritance class di Java.
class MultipleInterfaces {
    public static void main(String[] args) {
        System.out.println("=== Implementasi Beberapa Interface Sekaligus ===");

        SmartphoneSerbaBisa hp = new SmartphoneSerbaBisa();
        hp.putarAudio("Lagu Jazz Santai.mp3");
        hp.rekamVideo(1080);
        hp.terhubungKeWifi("KopiKenangan_FreeWiFi");
    }
}

interface PemutarAudio {
    void putarAudio(String judulLagu);
}

interface PerekamVideo {
    void rekamVideo(int resolusiP);
}

interface JaringanNirkabel {
    void terhubungKeWifi(String ssid);
}

// Satu class dapat mengimplementasikan banyak interface sekaligus dipisahkan koma
class SmartphoneSerbaBisa implements PemutarAudio, PerekamVideo, JaringanNirkabel {
    @Override
    public void putarAudio(String judulLagu) {
        System.out.println("Memutar musik: " + judulLagu);
    }

    @Override
    public void rekamVideo(int resolusiP) {
        System.out.println("Merekam video pada resolusi: " + resolusiP + "p 60fps");
    }

    @Override
    public void terhubungKeWifi(String ssid) {
        System.out.println("Tersambung ke jaringan Wi-Fi: " + ssid);
    }
}
