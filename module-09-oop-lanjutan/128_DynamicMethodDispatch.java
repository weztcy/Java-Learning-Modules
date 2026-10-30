// Mendemonstrasikan Dynamic Method Dispatch: penentuan eksekusi method terjadi saat runtime berdasarkan objek aktual.
class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("=== Dynamic Method Dispatch (Runtime Polymorphism) ===");

        // Referensi superclass menunjuk ke berbagai jenis objek saat runtime
        NotifikasiLayanan notif;

        notif = new NotifikasiEmail();
        notif.kirimPesan("Halo melalui Email!");

        notif = new NotifikasiSMS();
        notif.kirimPesan("Kode OTP: 459128");

        notif = new NotifikasiPush();
        notif.kirimPesan("Promo diskon 50% hari ini!");
    }
}

class NotifikasiLayanan {
    void kirimPesan(String pesan) {
        System.out.println("Mengirim notifikasi umum: " + pesan);
    }
}

class NotifikasiEmail extends NotifikasiLayanan {
    @Override
    void kirimPesan(String pesan) {
        System.out.println("[EMAIL-GATEWAY] Mengirim surel: " + pesan);
    }
}

class NotifikasiSMS extends NotifikasiLayanan {
    @Override
    void kirimPesan(String pesan) {
        System.out.println("[SMS-GATEWAY] Mengirim SMS ke seluler: " + pesan);
    }
}

class NotifikasiPush extends NotifikasiLayanan {
    @Override
    void kirimPesan(String pesan) {
        System.out.println("[FIREBASE-PUSH] Mengirim push banner: " + pesan);
    }
}
