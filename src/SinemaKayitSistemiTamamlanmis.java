import java.util.Scanner;

public class SinemaKayitSistemiTamamlanmis {
    // Film bilgileri (önceden doldurulmuş)
    private static String[] filmAdlari = {
            "Başlangıç", "Yüzüklerin Efendisi", "Prestij", "Dövüş Kulübü", "Zindan Adası", null, null, null, null, null
    };
    private static int[] filmSureleri = {148, 178, 130, 139, 138, 0, 0, 0, 0, 0};
    private static String[] filmTurleri = {
            "Bilim Kurgu", "Fantastik", "Gerilim", "Drama", "Gerilim", null, null, null, null, null
    };
    private static int filmSayisi = 5;

    // Müşteri bilgileri (önceden doldurulmuş)
    private static String[] musteriAdlari = {
            "Ahmet Yılmaz", "Mehmet Demir", "Ayşe Kaya", "Fatma Şahin", "Ali Can",
            "Zeynep Koç", "Murat Kurt", "Selin Tan", null, null, null, null, null, null, null, null, null, null, null, null
    };
    private static String[] musteriEmailler = {
            "ahmet@mail.com", "mehmet@mail.com", "ayse@mail.com", "fatma@mail.com", "ali@mail.com",
            "zeynep@mail.com", "murat@mail.com", "selin@mail.com", null, null, null, null, null, null, null, null, null, null, null, null
    };
    private static int musteriSayisi = 8;

    // Bilet bilgileri (önceden doldurulmuş)
    private static int[][] biletler = {
            {0}, // Ahmet - Başlangıç
            {1}, // Mehmet - Yüzüklerin Efendisi
            {2}, // Ayşe - Prestij
            {3}, // Fatma - Dövüş Kulübü
            {4}, // Ali - Zindan Adası
            {0}, // Zeynep - Başlangıç
            {},  // Murat - henüz bilet yok
            {}   // Selin - henüz bilet yok
    };

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sinema Müşteri Kayıt Sistemine Hoş Geldiniz!");
        System.out.println("Sistemde önceden 5 film, 8 müşteri ve 6 bilet kaydı bulunmaktadır.\n");

        while (true) {
            menuGoster();
            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            switch (secim) {
                case 1:
                    filmEkle();
                    break;
                case 2:
                    musteriEkle();
                    break;
                case 3:
                    biletSat();
                    break;
                case 4:
                    filmleriListele();
                    break;
                case 5:
                    musterileriListele();
                    break;
                case 6:
                    biletleriListele();
                    break;
                case 0:
                    System.out.println("Program sonlandırılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    private static void menuGoster() {
        System.out.println("\n--- MENÜ ---");
        System.out.println("1. Film Ekle (" + filmSayisi + "/10 dolu)");
        System.out.println("2. Müşteri Ekle (" + musteriSayisi + "/20 dolu)");
        System.out.println("3. Bilet Sat");
        System.out.println("4. Filmleri Listele");
        System.out.println("5. Müşterileri Listele");
        System.out.println("6. Biletleri Listele");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminiz: ");
    }

    private static void filmEkle() {
        if (filmSayisi >= 10) {
            System.out.println("Maksimum film sayısına ulaşıldı (10)!");
            return;
        }

        System.out.println("\n--- Yeni Film Ekle ---");
        System.out.print("Film Adı: ");
        String ad = scanner.nextLine();

        System.out.print("Film Süresi (dakika): ");
        int sure = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.print("Film Türü: ");
        String tur = scanner.nextLine();

        filmAdlari[filmSayisi] = ad;
        filmSureleri[filmSayisi] = sure;
        filmTurleri[filmSayisi] = tur;
        filmSayisi++;

        System.out.println("Film başarıyla eklendi!");
    }

    private static void musteriEkle() {
        if (musteriSayisi >= 20) {
            System.out.println("Maksimum müşteri sayısına ulaşıldı (20)!");
            return;
        }

        System.out.println("\n--- Yeni Müşteri Ekle ---");
        System.out.print("Müşteri Adı: ");
        String ad = scanner.nextLine();

        System.out.print("Müşteri Email: ");
        String email = scanner.nextLine();

        musteriAdlari[musteriSayisi] = ad;
        musteriEmailler[musteriSayisi] = email;
        musteriSayisi++;

        System.out.println("Müşteri başarıyla eklendi!");
    }

    private static void biletSat() {
        if (musteriSayisi == 0 || filmSayisi == 0) {
            System.out.println("Bilet satışı için önce müşteri ve film eklemelisiniz!");
            return;
        }

        System.out.println("\n--- Bilet Sat ---");

        // Müşteri seçimi
        System.out.println("Müşteri Listesi:");
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println((i+1) + ". " + musteriAdlari[i] + " (" + musteriEmailler[i] + ")");
        }
        System.out.print("Müşteri No: ");
        int musteriNo = scanner.nextInt() - 1;

        if (musteriNo < 0 || musteriNo >= musteriSayisi) {
            System.out.println("Geçersiz müşteri numarası!");
            return;
        }

        // Film seçimi
        System.out.println("\nFilm Listesi:");
        for (int i = 0; i < filmSayisi; i++) {
            System.out.println((i+1) + ". " + filmAdlari[i] + " (" + filmTurleri[i] + ", " + filmSureleri[i] + " dakika)");
        }
        System.out.print("Film No: ");
        int filmNo = scanner.nextInt() - 1;
        scanner.nextLine(); // Boş satırı oku

        if (filmNo < 0 || filmNo >= filmSayisi) {
            System.out.println("Geçersiz film numarası!");
            return;
        }

        // Bilet kaydı
        biletler[musteriNo] = new int[]{filmNo};
        System.out.println("Bilet başarıyla satıldı!");
        System.out.println(musteriAdlari[musteriNo] + " için " + filmAdlari[filmNo] + " filmine bilet kaydedildi.");
    }

    private static void filmleriListele() {
        System.out.println("\n--- Film Listesi (" + filmSayisi + " film) ---");
        if (filmSayisi == 0) {
            System.out.println("Kayıtlı film bulunmamaktadır.");
            return;
        }

        for (int i = 0; i < filmSayisi; i++) {
            System.out.println((i+1) + ". " + filmAdlari[i] + " | Tür: " + filmTurleri[i] + " | Süre: " + filmSureleri[i] + " dakika");
        }
    }

    private static void musterileriListele() {
        System.out.println("\n--- Müşteri Listesi (" + musteriSayisi + " müşteri) ---");
        if (musteriSayisi == 0) {
            System.out.println("Kayıtlı müşteri bulunmamaktadır.");
            return;
        }

        for (int i = 0; i < musteriSayisi; i++) {
            System.out.print((i+1) + ". " + musteriAdlari[i] + " | Email: " + musteriEmailler[i]);
            if (biletler[i].length > 0 && biletler[i][0] >= 0) {
                System.out.println(" | Bilet: " + filmAdlari[biletler[i][0]]);
            } else {
                System.out.println(" | Bilet: Yok");
            }
        }
    }

    private static void biletleriListele() {
        System.out.println("\n--- Bilet Listesi ---");
        int biletSayisi = 0;

        for (int i = 0; i < musteriSayisi; i++) {
            if (biletler[i].length > 0 && biletler[i][0] >= 0) {
                System.out.println((biletSayisi+1) + ". " + musteriAdlari[i] + " -> " + filmAdlari[biletler[i][0]]);
                biletSayisi++;
            }
        }

        if (biletSayisi == 0) {
            System.out.println("Kayıtlı bilet bulunmamaktadır.");
        } else {
            System.out.println("Toplam " + biletSayisi + " bilet kayıtlı.");
        }
    }
}