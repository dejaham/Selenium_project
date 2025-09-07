# Projet de Démonstration : Tests Automatisés avec Selenium

## Objectif

Ce projet a été conçu pour **démontrer mes compétences** en automatisation de tests logiciels en utilisant **Selenium WebDriver**, **JUnit**, et d'autres outils pertinents. Il simule des scénarios de tests sur une application web pour valider des fonctionnalités essentielles, tout en suivant les bonnes pratiques en matière de tests.

---

## Points Clés

- Automatisation de scénarios fonctionnels complexes à l'aide de **Selenium WebDriver**.
- Structuration des tests avec **JUnit**.
- Utilisation du modèle **Page Object Model (POM)** et de **Page Factory** pour une meilleure maintenabilité du code.
- Gestion des dépendances via **Maven**.
- Mise en place de bonnes pratiques en automatisation et en gestion des données de test.

---

## Fonctionnalités Démontrées

1. **Tests d'authentification** :
   - Vérification du bon fonctionnement de la connexion avec des identifiants valides/invalides.
   - Gestion des cas de bord, comme les champs laissés vides.

2. **Tests de navigation** :
   - Automatisation de la navigation entre plusieurs pages d'une application web.
   - Vérification des liens et des redirections.

3. **Validation d'éléments de formulaire** :
   - Tests sur les formulaires (champ obligatoire, format des données, etc.).
   - Interaction avec des boutons, menus déroulants, et cases à cocher.

4. **Modèle Page Object avec Page Factory** :
   - Implémentation de classes spécifiques à chaque page pour une séparation claire des responsabilités.
   - Réduction des duplications de code grâce à l'utilisation de **Page Factory** pour initialiser les éléments de la page.

5. **Rapports d'exécution** :
   - Génération automatique de rapports pour analyser les résultats des tests.

---

## Structure du Projet

- **`src/test/java`** : Contient les classes de tests organisées par fonctionnalité.
- **`src/main/java`** : Définit les classes de page en suivant le modèle **Page Object**.
- **`resources`** : Fichiers de configuration et jeux de données.
- **`pom.xml`** : Gestion des dépendances avec Maven.

---

## Prérequis Techniques

- **Java JDK 8** ou version supérieure.
- **Maven 3.6** ou version supérieure.
- Navigateur **Google Chrome**.
- **ChromeDriver** compatible avec la version de Chrome installée.

---

## Installation et Exécution

### Étape 1 : Cloner le dépôt

```bash
git clone https://github.com/dejaham/Selenium_project.git
cd Selenium_project
```

### Étape 2 : Installer les dépendances Maven

```bash
mvn clean install
```

### Étape 3 : Lancer les tests

Pour exécuter tous les tests, utilisez la commande suivante :

```bash
mvn test
```

---

## Points Forts de Ce Projet

- **Utilisation avancée de Selenium** : Intégration du modèle Page Object avec Page Factory pour écrire des tests robustes et maintenables.
- **Scénarios réalistes** : Chaque test reflète des cas courants rencontrés dans des projets professionnels.
- **Bonne organisation** : Les tests sont bien structurés pour démontrer la maîtrise de l'écriture de scripts réutilisables et maintenables.
- **Respect des standards** : Utilisation des outils et des techniques largement adoptés dans l'industrie.

---

## Exemples de Scénarios

- **Test de connexion** : Vérifie qu’un utilisateur peut se connecter avec des identifiants valides.
- **Test de recherche** : Valide que les résultats retournés par une barre de recherche sont corrects.
- **Test de panier** : Simule l'ajout et la suppression de produits dans un panier.

---

## Pourquoi ce projet ?

Ce projet reflète mes capacités à :

- **Automatiser des processus de tests manuels** pour gagner du temps et améliorer la couverture des tests.
- **Utiliser des techniques avancées** comme le modèle Page Factory pour des scripts de tests efficaces.
- **Communiquer mes résultats efficacement** avec des rapports clairs et exploitables.

---

## Ressources Complémentaires

- [Documentation Selenium](https://www.selenium.dev/documentation/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Guide Maven](https://maven.apache.org/guides/index.html)

---

## Auteur

- **Malik de Jaham** - Passionné par le test logiciel et l'amélioration de la qualité des applications. [Mon profil LinkedIn](https://www.linkedin.com/in/dejaham/).
