# SinemaMusteriSistemi

# Sinema Müşteri Kayıt Sistemi

Bu proje, Java programlama dili kullanılarak geliştirilmiş bir konsol tabanlı sinema müşteri kayıt sistemidir. Sistem, sinema salonu işletmecilerinin filmleri, müşterileri ve bilet satışlarını kolayca yönetmesine olanak tanır. Önceden tanımlı verilerle başlar ve kullanıcıların yeni film, müşteri ve bilet eklemesine imkan sağlar.

## Özellikler
- Film Yönetimi: Yeni filmler ekleyebilir ve mevcut filmleri listeleyebilirsiniz. Her film için ad, süre ve tür bilgisi tutulur.
- Müşteri Yönetimi: Yeni müşteriler ekleyebilir ve mevcut müşterileri listeleyebilirsiniz. Her müşteri için ad ve e-posta bilgisi saklanır.
- Bilet Satışı: Müşterilere film biletleri satabilir ve bu kayıtları takip edebilirsiniz.
- Listeleme: Filmler, müşteriler ve biletler ayrı ayrı listelenebilir.
- Kapasite Sınırları: Maksimum 10 film ve 20 müşteri desteklenir.

## Başlangıç Verileri
Sistem, aşağıdaki önceden tanımlı verilerle başlar:
- Filmler (5 adet): 
  - Başlangıç (Bilim Kurgu, 148 dk)
  - Yüzüklerin Efendisi (Fantastik, 178 dk)
  - Prestij (Gerilim, 130 dk)
  - Dövüş Kulübü (Drama, 139 dk)
  - Zindan Adası (Gerilim, 138 dk)
- Müşteriler (8 adet): Ahmet Yılmaz, Mehmet Demir, Ayşe Kaya, Fatma Şahin, Ali Can, Zeynep Koç, Murat Kurt, Selin Tan (her biri bir e-posta adresiyle).
- Biletler (6 adet): İlk 6 müşteriye birer film bileti atanmıştır (Murat ve Selin hariç).

## Kullanım
1. Programı çalıştırdığınızda bir menü ile karşılaşırsınız.
2. Menüden seçim yaparak aşağıdaki işlemleri gerçekleştirebilirsiniz:
   - 1: Yeni film ekle
   - 2: Yeni müşteri ekle
   - 3: Bilet sat
   - 4: Filmleri listele
   - 5: Müşterileri listele
   - 6: Biletleri listele
   - 0: Programdan çık
3. Her işlem için gerekli bilgileri konsoldan girmeniz istenir.

## Kurulum
1. Bu repository’yi klonlayın:
   git clone https://github.com/[kullanıcı-adınız]/[repository-adı].git
2. Java Development Kit (JDK) yüklü olduğundan emin olun.
3. Proje dizinine gidin ve kodu derleyip çalıştırın:
   javac SinemaKayitSistemiTamamlanmis.java
   java SinemaKayitSistemiTamamlanmis

## Kod Yapısı
- Diziler: Film, müşteri ve bilet bilgileri statik dizilerde saklanır.
- Metotlar: Her işlev (ekleme, listeleme, bilet satışı) ayrı bir metotla yönetilir.
- Kullanıcı Arayüzü: Konsol tabanlı bir arayüzle çalışır ve Scanner sınıfı ile kullanıcı girdileri alınır.

## Geliştirme Önerileri
- Hata Kontrolü: Kullanıcı girdileri için daha fazla doğrulama eklenebilir (örneğin, sayı yerine harf girilirse hata yakalama).
- Dinamik Veri Yapısı: Sabit boyutlu diziler yerine ArrayList gibi dinamik yapılar kullanılarak kapasite sınırı kaldırılabilir.
- Çoklu Bilet Desteği: Bir müşterinin birden fazla bilet alabilmesi için bilet sistemi geliştirilebilir.

## Katkıda Bulunma
Katkıda bulunmak isterseniz:
1. Repository’yi fork edin.
2. Değişikliklerinizi yapın ve bir pull request gönderin.

## Lisans
Bu proje açık kaynaklıdır ve MIT Lisansı altında dağıtılmaktadır.

## İletişim
Sorularınız veya önerileriniz için [ahmeteminozcan16@gmail.com] üzerinden bana ulaşabilirsiniz.
