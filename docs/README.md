# 🖥️ Sistema de Control de Pesaje (Java)

## 📌 Descripción

Este proyecto consiste en una aplicación de escritorio desarrollada en Java que permite registrar y visualizar datos de pesaje de productos. La aplicación cuenta con una interfaz gráfica sencilla y funcional, orientada a facilitar el ingreso y monitoreo de información en tiempo real.

El sistema fue desarrollado aplicando el paradigma de **Programación Orientada a Objetos (POO)** junto con patrones de diseño que permiten una arquitectura organizada, escalable y mantenible.

---

## ⚙️ Tecnologías utilizadas

* Java (JDK 8 o superior)
* Swing (interfaz gráfica)
* Visual Studio Code (entorno de desarrollo)
* Extensiones:

  * Extension Pack for Java
  * Debugger for Java
  * Test Runner for Java

---

## 🧠 Arquitectura del sistema

El proyecto implementa el patrón de arquitectura **MVC (Modelo - Vista - Controlador)**, junto con otros patrones de diseño:

### 🔹 MVC

* **Modelo (model):** Maneja los datos y la lógica del negocio (Pesaje, PesajeManager)
* **Vista (view):** Interfaz gráfica del usuario (MainView)
* **Controlador (controller):** Gestiona la comunicación entre la vista y el modelo

### 🔹 Patrones aplicados

* **Singleton:** Utilizado en `PesajeManager` para garantizar una única instancia global
* **Observer:** Permite actualizar automáticamente la interfaz cuando se registran nuevos datos

---

## 📁 Estructura del proyecto

Siguiendo buenas prácticas de organización en POO, el proyecto se divide en paquetes según su responsabilidad:

```
PESAJE-APP/
├── src/
│   ├── controller/
│   │     └── PesajeController.java
│   ├── model/
│   │     ├── Pesaje.java
│   │     ├── PesajeManager.java 
│   │     └── PesajeObserver.java
│   ├── view/
│   │     └── MainView.java
│   └── Main.java
│
├── docs/
├── .gitignore
└── README.md
```

### 📌 Descripción de carpetas

* **model/** → Contiene las clases de datos y lógica del negocio
* **controller/** → Maneja la lógica de interacción entre vista y modelo
* **view/** → Contiene la interfaz gráfica del usuario
* **Main.java** → Punto de entrada de la aplicación

---

## 🚀 Funcionamiento del sistema

1. El usuario ingresa un producto y su peso en la interfaz.
2. El controlador procesa la información ingresada.
3. Se crea un nuevo objeto `Pesaje`.
4. El `PesajeManager` (Singleton) almacena el registro.
5. Mediante el patrón Observer, la vista se actualiza automáticamente.
6. Los datos se muestran en pantalla en tiempo real.

---

## ▶️ Ejecución del proyecto

1. Compilar el proyecto:

```
javac -d out src/model/*.java src/controller/*.java src/view/*.java src/Main.java
```

2. Ejecutar:

```
java -cp out Main
```

---

## ✅ Características principales

* Registro de pesajes en tiempo real
* Interfaz gráfica sencilla e intuitiva
* Actualización automática de datos
* Arquitectura organizada y escalable
* Uso de patrones de diseño

---

## 📈 Posibles mejoras

* Conexión a base de datos (MySQL / SQLite)
* Exportación de datos a Excel o PDF
* Integración con básculas reales (puerto serial)
* Sistema de autenticación de usuarios
* Migración a JavaFX para una interfaz más moderna

---

## 👨‍💻 Autor

Proyecto desarrollado como práctica académica aplicando conceptos de ingeniería de software, POO y patrones de diseño.
