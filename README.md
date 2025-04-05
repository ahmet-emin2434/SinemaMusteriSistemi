Özellikler
Film Yönetimi:

Film ekleme (ad, süre, tür)

Maksimum 10 film kapasitesi

Film listeleme

Müşteri Yönetimi:

Müşteri kaydı (ad, email)

Maksimum 20 müşteri kapasitesi

Müşteri listeleme

Bilet Yönetimi:

Müşteri-film eşleştirme

Bilet satışı

Bilet listeleme

Kurulum
Java 17 veya üzeri yüklü olduğundan emin olun

Projeyi klonlayın:

bash
Copy
git clone https://github.com/kullaniciadi/sinema-kayit-sistemi.git
Proje dizinine gidin:

bash
Copy
cd sinema-kayit-sistemi
Uygulamayı derleyin ve çalıştırın:

bash
Copy
javac SinemaKayitSistemiTamamlanmis.java
java SinemaKayitSistemiTamamlanmis
Kullanım
Uygulama başlatıldığında aşağıdaki menüyü göreceksiniz:

Copy
--- MENÜ ---
1. Film Ekle (5/10 dolu)
2. Müşteri Ekle (8/20 dolu)
3. Bilet Sat
4. Filmleri Listele
5. Müşterileri Listele
6. Biletleri Listele
0. Çıkış
Seçiminiz: 
Örnek Kullanım Senaryoları
Yeni Film Ekleme:

Menüden 1 seçeneğini seçin

Film adını girin (ör: "Matrix")

Film süresini dakika cinsinden girin (ör: 136)

Film türünü girin (ör: "Bilim Kurgu")

Yeni Müşteri Ekleme:

Menüden 2 seçeneğini seçin

Müşteri adını girin (ör: "Eren Yılmaz")

Müşteri emailini girin (ör: "eren@mail.com")

Bilet Satışı:

Menüden 3 seçeneğini seçin

Müşteri numarasını seçin

Film numarasını seçin

Veri Yapısı
Proje üç temel veri yapısı kullanır:

Filmler:

java
Copy
String[] filmAdlari = new String[10];
int[] filmSureleri = new int[10];
String[] filmTurleri = new String[10];
Müşteriler:

java
Copy
String[] musteriAdlari = new String[20];
String[] musteriEmailler = new String[20];
Biletler:

java
Copy
int[][] biletler = new int[20][1];
Katkıda Bulunma
Katkıda bulunmak isterseniz:

Fork oluşturun

Yeni özellik ekleyin/düzeltme yapın

Pull request gönderin
