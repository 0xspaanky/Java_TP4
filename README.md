# TP_3 - Object-Oriented Programming: Classes and Associations

This repository contains 4 Java exercises focusing on object-oriented programming, class design, and object associations.

## Repository Structure

```
TP_3/
├── Exerc_1/    # Student Management with Dynamic Grade Array
├── Exerc_2/    # Student-Major Association (One-to-Many)
├── Exerc_3/    # Article and Category Management
└── Exerc_4/    # Library Management System (Advanced Associations)
```

## Exercises Overview

### Exercise 1: Student Management with Dynamic Grade Array
Implements a single `Etudiant` class with dynamic array management for storing grades.

**Key Concepts:**
- Dynamic array expansion (automatic doubling)
- Auto-incremented unique IDs
- Grade management and average calculation
- `System.arraycopy()` for array manipulation

**Features:**
- Adds grades with automatic capacity growth
- Calculates student averages
- Displays grades in readable format

---

### Exercise 2: Student-Major Association
Demonstrates a **one-to-many** bidirectional relationship between `Filiere` (Major) and `Etudiant` (Student).

**Key Concepts:**
- One-to-many associations
- Bidirectional relationships
- Dynamic array management without collections
- Association integrity maintenance

**Features:**
- One major contains multiple students
- Each student belongs to one major
- Automatic bidirectional linking
- Dynamic student array in major class

---

### Exercise 3: Article and Category Management
Models a business system with `Article` and `Categorie` classes using **arrays only** (no collections).

**Key Concepts:**
- UML to Java implementation
- Package organization (`ma.projet.bean`, `ma.projet.test`)
- Array-based data storage
- Nested loop algorithms for filtering

**Requirements:**
- Must use only arrays and loops (no List/Map/Stream)
- Auto-incremented IDs per class
- Exact output format compliance
- Displays articles grouped by category

**Sample Data:**
- Categories: "Ordinateur Portable", "Ordinateur Poste"
- Articles: DELL INSPIRON, SONY VAIO, TERRA, HP Compaq

---

### Exercise 4: Library Management System (Advanced)
Comprehensive system with **multiple association types** between `Auteur` (Author), `Livre` (Book), and `Bibliotheque` (Library).

**Key Concepts:**
- One-to-many: Author → Books
- Many-to-many: Library ↔ Books
- Bidirectional associations
- Java Collections (List, Set)
- Lambda expressions

**Features:**
- Authors maintain list of their books
- Books automatically link to authors on creation
- Libraries store book collections (Set prevents duplicates)
- Same book can exist in multiple libraries

**Advanced Topics:**
- Bidirectional relationship management
- Using Set for duplicate prevention
- Auto-incremented IDs across multiple classes

---

## Common Themes Across All Exercises

### Auto-Incremented IDs
Every class uses a static counter to generate unique IDs:
```java
private static int compteur = 0;
private final int id;

public ClassName(...) {
    this.id = ++compteur;
    // ...
}
```

### Progressive Complexity
1. **Exerc_1**: Single class with array management
2. **Exerc_2**: Two classes with one-to-many association
3. **Exerc_3**: Business modeling with array-only constraint
4. **Exerc_4**: Multiple classes with complex associations and collections

## Technologies
- **Language:** Java 8+
- **Concepts:** OOP, Classes, Objects, Associations, Arrays, Collections
- **Patterns:** Auto-increment IDs, Bidirectional associations, Dynamic arrays

## Package Structures

### Exercises 1, 2, 4
```
com.example.tp/
├── ClassName1.java
├── ClassName2.java
└── Main.java
```

### Exercise 3
```
ma.projet.bean/      # Business classes
├── Categorie.java
└── Article.java
ma.projet.test/      # Test classes
└── TestApp.java
```

## Compilation & Execution

Each exercise can be compiled and run independently:

```bash
# Navigate to exercise directory
cd Exerc_X

# Compile (from src/ directory if applicable)
javac com/example/tp/*.java
# or for Exercise 3:
javac ma/projet/bean/*.java ma/projet/test/*.java

# Run
java com.example.tp.Main
# or for Exercise 3:
java ma.projet.test.TestApp
```

## Learning Objectives

### Fundamental Skills
- Creating and using Java classes
- Implementing constructors and methods
- Using getters/setters appropriately
- Overriding `toString()` for readable output

### Intermediate Skills
- Managing object associations (one-to-many, many-to-many)
- Implementing bidirectional relationships
- Using static fields for shared state
- Dynamic array management

### Advanced Skills
- Working with Java Collections (List, Set)
- Ensuring association integrity
- Package organization
- UML to code implementation

### Design Patterns
- Auto-increment ID generation
- Dynamic capacity management
- Bidirectional association maintenance
- Separation of concerns (business vs. test packages)

## Verification Tips

For all exercises:
- [ ] IDs are unique and sequential
- [ ] All associations work bidirectionally (where applicable)
- [ ] Dynamic arrays expand correctly
- [ ] Output format matches specifications
- [ ] No null pointer exceptions
- [ ] toString() methods provide useful information

## Possible Extensions

### For All Exercises
- Add data persistence (files, databases)
- Implement search functionality
- Create GUI (Swing/JavaFX)
- Add validation and error handling
- Implement CRUD operations

### Exercise-Specific
- **Exerc_1**: Grade removal, sorting, weighted averages
- **Exerc_2**: Student transfer between majors
- **Exerc_3**: Stock management, price tracking
- **Exerc_4**: Book borrowing system, ISBN management, due dates

## Documentation
Each exercise directory contains:
- `README.md`: Detailed exercise description and specifications
- `subject.txt`: Original French exercise requirements
- Java source files with implementations

---

**Course:** Object-Oriented Programming with Java
**Institution:** FST
**Focus:** Classes, Objects, and Associations
