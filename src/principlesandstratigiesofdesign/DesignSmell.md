# Design Smells
Structures in the design that violates the fundamental design principles and negatively impacts the quality of the design.

- **General Design Smells**
  - **Rigidity**
    - System where changes are difficult.
    - Tight coupling: needs cascading changes even for small changes.
  - **Fragility**
    - Small changes may break the software in multiple places.
    - Unrelated peices of code may break because of changes.
  - **Repetition**
  - **Opacity**
    - Difficulty in understanding a module.
    - Code not wirtten in a clear and expressive manner.
    - Over time, with changes code becomes more complex to understand.
  - **Needless Complexity**
- **Programming to an Interface**
  - Program to an interface means "program to a supertype".
  - Declared type of the variables should be of supertype.
  - Exploit polymorphism, so that the actual runtime object is not locked into the code.
