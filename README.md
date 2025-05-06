# 📱 Hesap Makinesi Demo – Kotlin ile Android Hesaplama Uygulaması

Bu proje, Kotlin dili kullanılarak Android Studio ortamında geliştirilmiş basit ama işlevsel bir hesap makinesi uygulamasıdır. Uygulama iki temel parçadan oluşur: bir kullanıcı arayüzü (`AnasayfaFragment`) ve işlemleri yöneten bir arka plan sınıfı (`Operations`).

## 🚀 Özellikler

- Temel dört işlem desteği: ➕ ➖ ✖️ ➗  
- Dinamik arayüz ile işlem sırasının gösterimi  
- Hatalı giriş denetimi (örneğin: art arda iki işlem sembolü engellenir)  
- Sıfıra bölme hatası yönetimi  
- Kapanınca işlem geçmişinin korunması (SharedPreferences ile)

## 🧩 Uygulama Yapısı

### 🧱 `AnasayfaFragment.kt`

- Kullanıcı arayüzü butonları burada tanımlıdır.
- Tıklama olaylarında `islem` adlı bir `String` güncellenerek işlem sırası oluşturulur.
- `buttonesit` tıklanarak işlemler `Operations` sınıfına gönderilir ve sonuç hesaplanır.
- SharedPreferences ile işlem geçmişi saklanır.

### 🧠 `Operations.kt`

- `parcalama(islem: String)`: Girdi metnini sayılar ve işlem işaretlerine böler.
- `getNumbers()` / `getIsaretler()`: Parçalanmış verileri sağlar.
- `kontrolFonksiyonu(islem: String)`: İki işlem işaretinin art arda gelmesi gibi hataları tespit eder.

## 📂 Dosya Yapısı

```
hesapmakinesidemo/
├── AnasayfaFragment.kt       # Arayüz ve kullanıcı etkileşimleri
├── Operations.kt             # İşlem ayrıştırma ve hesaplama mantığı
├── fragment_anasayfa.xml     # UI tasarımı (ViewBinding ile bağlanır)
```

## 🛠️ Kurulum

Projeyi kendi bilgisayarında çalıştırmak için:

1. Bu repoyu klonla:
   ```bash
   git clone https://github.com/emrullah-enis-ctnky/CalculatorAppAssignment.git
   ```
2. Android Studio ile projeyi aç.
3. Gerekli SDK ve bağımlılıkların yüklendiğinden emin ol.
4. Bir emülatörde veya gerçek cihazda çalıştır.

## ⚙️ Kullanılan Teknolojiler

- Kotlin
- Android SDK
- ViewBinding
- Fragment mimarisi
- SharedPreferences

## 🧠 Öğrenilecekler

Bu proje sayesinde:

- Kotlin'de Fragment yönetimini
- ViewBinding ile güvenli UI erişimini
- Temel algoritma ile işlem ayrıştırmayı
- Verilerin uygulama kapanınca korunmasını  
öğrenebilirsin.

## 🖼️ Ekran Görüntüsü

> 📸 Henüz bir ekran görüntüsü eklenmedi. Uygulamanın görsel çıktısını buraya ekleyerek projenin daha dikkat çekici olmasını sağlayabilirsin.

## 👤 Geliştirici

**Emrullah Enis Çetinkaya**  
🎓 Türk-Alman Üniversitesi – Bilgisayar Mühendisliği  
🔗 [GitHub Profilim](https://github.com/emrullah-enis-ctnky)  


## 📝 Lisans

Bu proje GPL3.0 lisansı ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakabilirsiniz.

---

💡 Katkıda bulunmak, hata bildirmek veya öneri sunmak isterseniz pull request göndermekten çekinmeyin!
