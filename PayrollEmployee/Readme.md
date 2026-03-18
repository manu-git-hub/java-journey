# Employee Payroll System

## Problem Statement

Design a simple Employee payroll system using inheritance, constructor chaining with super, method overriding, and
method overloading.

---

## 📋 Requirements & Implementation

### 1. Base Class: `Employee`

We define the core structure for all employees:

* **Private Fields**: `name` (String), `id` (int), `baseSalary` (double).
* **Constructor**: Initializes all three fields.
* **`calculatePay()`**: Returns the `baseSalary`.
* **`displayInfo()`**: Prints the name, ID, and the result of `calculatePay()`.

### 2. Subclass: `FullTimeEmployee`

Extends `Employee` to include:

* **Extra Field**: `bonus` (double).
* **Constructor**: Uses `super()` for parent fields and initializes `bonus`.
* **Method Overriding**: `calculatePay()` returns `baseSalary + bonus`.
* **Method Overloading**:
    * `displayInfo()`: Prints all details.
    * `displayInfo(boolean showBonus)`: Toggles the visibility of the bonus line.

### 3. Subclass: `PartTimeEmployee`

Extends `Employee` to include:

* **Extra Fields**: `hoursWorked` (int), `hourlyRate` (double).
* **Constructor**: Passes `0` as `baseSalary` to the `super` constructor.
* **Method Overriding**: `calculatePay()` returns `hoursWorked * hourlyRate`.

---

## 💻 Technical Concepts Used

| Concept                  | Application in our Code                                                        |
|:-------------------------|:-------------------------------------------------------------------------------|
| **Inheritance**          | `FullTimeEmployee` and `PartTimeEmployee` inheriting from `Employee`.          |
| **Constructor Chaining** | Using `super(name, id, baseSalary)` to initialize parent attributes.           |
| **Method Overriding**    | Customizing `calculatePay()` logic for different employee types.               |
| **Method Overloading**   | Providing two versions of `displayInfo()` in `FullTimeEmployee`.               |
| **Polymorphism**         | Storing different objects in an `Employee[]` array and calling shared methods. |

---

## 🚀 Execution & Expected Output

In our `Main` class, we instantiate one employee of each type, store them in a common array, and iterate through them to
display their details.

**Output:**

```text
=== Employee Details ===
Name: Rahul | ID: 101
Total Pay: 85000.0

Name: Priya | ID: 102
Total Pay: 12000.0