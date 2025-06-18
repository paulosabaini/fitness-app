# 📱 Fitness App

A modular, offline-capable Android fitness app that helps users browse exercises, create custom workouts, track workout sessions, and review workout history and statistics. Built with **Jetpack Compose**, **Koin**, **Ktor**, and **Room** following **Modern Android Development** best practices.

---

## 📂 Project Structure

```plaintext
app/                      # Main Application, Navigation, Koin setup
core/
 ├── common/              # Shared models, Result wrappers, Utils
 ├── network/             # Ktor client setup
 ├── database/            # Room setup, Shared DAOs
 └── ui/                  # Shared UI components, themes, error/loading views
feature/
 ├── exercise/            # Exercise Catalog (API, cache, UI)
 ├── workout/             # Workout CRUD (create, edit, list)
 ├── session/             # Workout Execution
 └── history/             # Workout History, Statistics
```

---

## 🚀 Features

- ✅ Browse exercises from the **Wger public API**
- ✅ View detailed exercise instructions and images
- ✅ Create, edit, and delete **custom workouts**
- ✅ Execute workouts with **timers and step-by-step navigation**
- ✅ Track **workout history** and view session details
- ✅ View statistics: completed workouts, time spent, most used exercises
- ✅ Receive **workout reminders** via notifications
- ✅ Fully supports **offline mode** with local caching
- ✅ Modularized by feature with **Clean Architecture**

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Dependency Injection:** Koin
- **Networking:** Ktor
- **Database:** Room
- **Architecture:** Clean Architecture (MVI Pattern)
- **Background Work:** WorkManager
- **Testing:** Unit Testing, UI Testing (Compose)

---

## 📂 Module Breakdown

| Module             | Responsibility                        |
|--------------------|---------------------------------------|
| app                | Navigation, App Setup, Koin Graph     |
| core:network       | Ktor client setup                     |
| core:database      | Room database setup                   |
| core:common        | Shared models, utilities              |
| core:ui            | Shared UI components and design       |
| feature:exercise   | Browse and view exercises             |
| feature:workout    | Workout CRUD                          |
| feature:session    | Workout execution flow                |
| feature:history    | History tracking and statistics       |

---

## ⚙️ Architecture Overview

- **Clean Architecture Layers:**
    - Data → API, DAOs, Repositories
    - Domain → Use Cases
    - Presentation → ViewModels (MVI), Compose UI

- **Modularization by Feature:**
    - Isolated responsibilities per feature
    - Scalable and maintainable structure

- **Offline First:**
    - Local Room cache
    - Manual refresh support
    - Fallback to cached data on API errors

---

## 🧪 Testing Strategy

- ✅ Unit tests for repositories, use cases, and view models
- ✅ Ktor MockEngine for API layer testing
- ✅ In-memory Room for local database tests
- ✅ UI tests using Compose Testing framework
- ✅ Integration tests across features

---

## 🏃‍♂️ Getting Started

### Prerequisites
- Android Studio Flamingo or newer
- Kotlin 1.9+
- Gradle 8+

### Running the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/paulosabaini/fitness-app.git
   ```
2. Open in Android Studio.
3. Sync Gradle.
4. Run the app on an emulator or physical device.

---

## 📚 API Reference

- Wger Exercise API: https://wger.de/en/software/api

---

## 📄 License

This project is licensed under the GPL-3.0 License. See the [LICENSE](LICENSE) file for details.