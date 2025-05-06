# 📱 Calculator Demo – Android Calculator App Using Kotlin

This project is a simple yet functional calculator application developed using the Kotlin programming language in Android Studio. The application consists of two main parts: a user interface (`AnasayfaFragment`) and a backend logic handler (`Operations`).

## 🚀 Features

- Basic arithmetic operations supported: ➕ ➖ ✖️ ➗  
- Real-time display of the current input  
- Invalid input detection (e.g., prevents entering two operation symbols consecutively)  
- Division-by-zero error handling  
- Persistent state with SharedPreferences

## 🧩 Application Structure

### 🧱 `AnasayfaFragment.kt`

- Manages UI buttons and interactions.
- Updates the `islem` string with user input.
- On pressing the equals button (`buttonesit`), the input is passed to the `Operations` class for processing.
- Uses SharedPreferences to save the last operation string when the app is paused or stopped.

### 🧠 `Operations.kt`

- `parcalama(islem: String)`: Splits the input string into numbers and operators.
- `getNumbers()` / `getIsaretler()`: Returns parsed numbers and operators.
- `kontrolFonksiyonu(islem: String)`: Checks for invalid sequences like multiple consecutive operators.

## 📂 File Structure

```
hesapmakinesidemo/
├── AnasayfaFragment.kt       # UI and interaction logic
├── Operations.kt             # Parsing and calculation logic
├── fragment_anasayfa.xml     # UI layout (linked via ViewBinding)
```

## 🛠️ Setup

To run the project on your local machine:

1. Clone the repository:
   ```bash
   git clone https://github.com/emrullah-enis-ctnky/CalculatorAppAssignment.git
   ```
2. Open the project in Android Studio.
3. Ensure all SDKs and dependencies are installed.
4. Run on an emulator or a physical device.

## ⚙️ Technologies Used

- Kotlin
- Android SDK
- ViewBinding
- Fragment architecture
- SharedPreferences

## 🧠 What You'll Learn

By reviewing this project, you'll gain experience in:

- Fragment management in Kotlin
- Safe UI handling with ViewBinding
- Parsing user input for arithmetic evaluation
- Persisting state with SharedPreferences

## 🖼️ Screenshots

> 📸 No screenshots yet. You can add screenshots of the app to make the project more appealing.

## 👤 Developer

**Emrullah Enis Çetinkaya**  
🎓 Turkish-German University – Computer Engineering  
🔗 [GitHub Profile](https://github.com/emrullah-enis-ctnky)  
## 📝 License

This project is licensed under the MIT License. For more information, see the `LICENSE` file.

---

💡 Feel free to open a pull request if you'd like to contribute, report an issue, or suggest improvements!
