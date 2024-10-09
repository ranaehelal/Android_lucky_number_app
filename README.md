# Lucky Number App

This project is a fun Android app built with Java that generates a lucky number for the user based on their name input. It features a clean and simple interface where users can input their name, receive a lucky number, and even share it with friends!

## Features

- **Input and Display Lucky Number**: Users enter their name, and the app generates a lucky number for them.
- **Share with Friends**: Share the lucky number with friends via messaging or social media.
- **User-Friendly Interface**: Simple and intuitive layout with easy navigation.

## Screenshots

<img src="assets/1.png" alt="Main Screen" width="250" height="450">
<img src="assets/2.png" alt="Lucky Number Screen" width="250" height="450">
<img src="assets/3.png" alt="Share with Friends Screen" width="250" height="450">

## Getting Started

### Prerequisites

- Android Studio installed on your machine.
- Android device or emulator for testing.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/lucky-number-app.git
   ```
2. Open the project in Android Studio:
   ```bash
   File > Open > Select the project folder
   ```
3. Sync the project with Gradle and build the app:
   ```bash
   Build > Make Project
   ```

### Running the App

1. Connect your device or start an emulator.
2. Click on the **Run** button in Android Studio, or use:
   ```bash
   Run > Run 'app'
   ```

## Folder Structure

```
├── app/src/main               # Main application code
│   ├── java/com/example/luckynumber  # Java source files
│   │   ├── MainActivity.java         # Main screen for user input
│   │   └── MainActivity2.java        # Lucky number display and sharing screen
│   ├── res                         # Resource files
│   │   ├── layout                   # XML layout files for the UI
│   │   │   ├── activity_main.xml    # Layout for MainActivity
│   │   │   └── activity_main2.xml   # Layout for MainActivity2
│   │   ├── drawable                 # Custom button and background assets
│   │   └── values                   # Colors, strings, and styles
│   └── AndroidManifest.xml          # App configuration and permissions
└── build.gradle               # Gradle configuration files
```

## Customization

- **Colors and Styles**: Modify color scheme and styles in `res/values`.
- **Button and Backgrounds**: Update button and background styles in `res/drawable`.
- **Layouts**: Customize user interface in `activity_main.xml` and `activity_main2.xml`.

## Contact

For questions or suggestions, feel free to reach out to [ranaesmailhelal@gmail.com](mailto:ranaesmailhelal@gmail.com).
