# NiceStart

Proyecto Android desarrollado como práctica final de la asignatura **Desarrollo de Interfaces**.

NiceStart es una aplicación de ejemplo centrada en la correcta estructura de una app Android moderna, aplicando **Material Design 3**, buenas prácticas de layouts, navegación entre actividades, uso de recursos y control del ciclo de vida.

---

## 📱 Descripción general

La aplicación consta de un flujo completo de arranque, autenticación simulada y navegación:

1. **SplashActivity** – Pantalla de inicio.
2. **LoginActivity** – Inicio de sesión (diseño adaptado a vertical y horizontal).
3. **SignupActivity** – Registro de usuario.
4. **MainActivity** – Pantalla principal con AppBar y WebView.
5. **MainBabActivity** – Ejemplo de uso de BottomAppBar + FAB + BottomSheet.


---

## 🧱 Arquitectura del proyecto

```
app/
 └─ src/main/
    ├─ java/com/example/nicestart/
    │   ├─ SplashActivity.java
    │   ├─ LoginActivity.java
    │   ├─ SignupActivity.java
    │   ├─ MainActivity.java
    │   └─ MainBabActivity.java
    │
    ├─ res/
    │   ├─ layout/
    │   │   ├─ activity_splash.xml
    │   │   ├─ activity_login.xml
    │   │   ├─ activity_signup.xml
    │   │   ├─ activity_main.xml
    │   │   ├─ activity_main_bab.xml
    │   │   └─ bottom_sheet_dialog.xml
    │   │
    │   ├─ layout-land/
    │   │   └─ activity_login.xml
    │   │
    │   ├─ drawable/
    │   │   ├─ bg_nicestart_gradient.xml
    │   │   ├─ ic_menu.xml
    │   │   ├─ ic_add.xml
    │   │   ├─ ic_person.xml
    │   │   └─ ...
    │   │
    │   ├─ values/
    │   │   ├─ colors.xml
    │   │   ├─ styles.xml
    │   │   ├─ themes.xml
    │   │   └─ strings.xml
    │   │
    │   └─ menu/
    │       ├─ menu_main.xml
    │       └─ menu_bottom_bab.xml
    │
    └─ AndroidManifest.xml
```

---

## 🎨 Diseño y estilos

* **Material Design 3** como base visual.

* Tema personalizado `Theme.NiceStart`.

* Colores definidos en `colors.xml`:

    * Primary / Secondary
    * Surface / Background
    * OnPrimary / OnSecondary

* Estilos reutilizables:

    * `mybutton` → Botones principales
    * `mycard` → Tarjetas
    * `FabRound` → FloatingActionButton redondo

---

## 🧭 Navegación

* `SplashActivity` → `LoginActivity`
* `LoginActivity` → `MainActivity`
* `SignupActivity` → `MainActivity`
* `MainActivity` → `MainBabActivity`

Control del stack mediante `finish()` y flags cuando es necesario.

---


## 🌐 WebView

La `MainActivity` contiene un `WebView` configurado con:

* JavaScript habilitado
* DOM Storage activado
* SwipeRefreshLayout para recarga

Carga inicial:

```
https://m3.material.io/
```
---
## 📸 Activitys

A continuación se muestran las capturas de pantalla de cada una de las *Activities* principales de la aplicación **NiceStart**, junto con una breve descripción de su función dentro de la app.

### SplashActivity

Pantalla inicial que se muestra al abrir la aplicación. Presenta el logotipo y el nombre de la app durante unos segundos antes de redirigir automáticamente al login.

*![SplashActivity](screenshots/splash.png)*

---

### LoginActivity

Pantalla de inicio de sesión en orientación vertical. Permite al usuario introducir su correo y contraseña para acceder a la aplicación o navegar a la pantalla de registro.

![LoginActivity](screenshots/login.png)
---

### SignupActivity

Pantalla de registro de usuario. Permite crear una nueva cuenta introduciendo nombre, correo electrónico y contraseña.

![SignupActivity](screenshots/signup.png)

---

### MainActivity

Pantalla principal de la aplicación. Incluye una AppBar superior con menú y un WebView con soporte para recarga mediante *SwipeRefreshLayout*.

![MainActivity](screenshots/main.png)

---
### MainBabActivity

Pantalla que muestra el uso de **BottomAppBar** con menú inferior y **FloatingActionButton**, además de un contenido desplazable y un *BottomSheetDialog*.

![MainBabActivity](screenshots/mainbab.png)

---

## 👨‍💻 Autor

Proyecto realizado por **Alejandro Barroso** .

Repositorio:
👉 [https://github.com/abarrosomagan/NiceStart0](https://github.com/abarrosomagan/NiceStart0)

---
