🚗 Fleet Manager – Java Polymorphism Demo

This project demonstrates Runtime Polymorphism in Java using inheritance and method overriding.The program manages different types of vehicles (Vehicle, Car, and Drone) using a single Vehicle[] array and showcases Dynamic Method Dispatch.

📌 Concepts Covered

Inheritance (extends)
Method Overriding
Runtime Polymorphism
Dynamic Method Dispatch
Array of Parent Type References
super keyword usage

🏗️ Class Structure
1️⃣ Vehicle (Base Class)

Fields:
brand
speed

Method:
move() → Prints generic vehicle movement message.

2️⃣ Car (Subclass of Vehicle)
Additional Field:
doors

Overrides:
move() → Prints car-specific movement message.

3️⃣ Drone (Subclass of Vehicle)
Additional Field:
maxAltitude

Overrides:
move() → Prints drone-specific flying message.

🔁 How Polymorphism Works Here
Even though the array is declared as:
Vehicle[] myFleet
It stores objects of:
Vehicle
Car
Drone

When calling:
myFleet[i].move();

Java determines at runtime which move() method to execute based on the actual object type.
This is called Dynamic Method Dispatch.

▶️ Sample Output
Deploying Fleet via Array...
The Generic vehicle moves at the speed of 40 mph.
The 2-door Tesla vehicle is moving at the speed of 100 mph.
The DJI drone flies at an altitude of 150 feet at 20 mph.

📂 Project Structure
FleetManager.java
README.md

