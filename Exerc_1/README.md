# Exercise 1: Student Management with Dynamic Grade Array

![Exercise 1 Diagram](./image.png)

## Objective
Practice creating a Java class with dynamic array management, implementing automatic array expansion, and calculating averages from array data.

## Description
This exercise implements a student management system where each student can have multiple grades stored in a dynamically expanding array. The system demonstrates:
- Dynamic array growth (doubles capacity when full)
- Auto-incremented unique ID generation
- Grade management and average calculation

## Class Structure

### Etudiant Class
Located in `com.example.tp` package

**Attributes:**
- `compteur` (static): Global counter for ID generation
- `id` (final): Unique identifier for each student
- `nom`: Student's last name
- `prenom`: Student's first name
- `notes`: Dynamic array storing grades
- `nbNotes`: Count of grades currently stored

**Constructor:**
```java
public Etudiant(String nom, String prenom)
```
- Initializes ID with auto-increment
- Creates initial array with capacity of 5
- Sets grade count to 0

**Methods:**
- `ajouterNote(double note)`: Adds a grade, expanding array if needed (doubles capacity)
- `calculerMoyenne()`: Calculates and returns the average of all grades
- `afficherNotes()`: Displays all grades in a readable format
- `toString()`: Returns formatted student information with ID and average

## Key Features

### Dynamic Array Growth
When the array is full (`nbNotes == notes.length`):
1. Creates new array with double the capacity
2. Copies existing grades to new array
3. Replaces old array with expanded one

### Average Calculation
- Returns 0.0 if no grades exist
- Otherwise sums all grades and divides by count

## Example Usage

```java
Etudiant e1 = new Etudiant("Dupont", "Alice");
e1.ajouterNote(14.5);
e1.ajouterNote(12.0);
e1.ajouterNote(16.0);

e1.afficherNotes();
System.out.println(e1);
```

## Expected Output

```
Notes de Dupont Alice : 14.5, 12.0, 16.0
Etudiant[id=1, nom=Dupont, prenom=Alice, moyenne=14.17]
```

## Compilation & Execution

```bash
# From src/ directory
javac com/example/tp/*.java
java com.example.tp.Main
```

## Verification Checklist
- [ ] Grade array expands correctly (test with more than 5 grades)
- [ ] Average calculation is accurate
- [ ] IDs are unique and auto-incremented
- [ ] All methods work as expected

## Possible Extensions
- Method to remove last grade
- Maximum grade limit enforcement
- Grade sorting functionality
- File I/O for data persistence

## Files
- `Etudiant.java`: Student class implementation
- `Main.java`: Test program demonstrating functionality
- `subject.txt`: Complete exercise specifications
