TechHub – Interface-Based Polymorphism in Java

This project demonstrates clean object-oriented design using interfaces, polymorphism, runtime type checking, and method overriding in Java. The application simulates a simplified technology ecosystem where different devices such as a Smartphone and an Electric Car share common capabilities while maintaining their own internal logic and behavior.

The architecture is intentionally interface-driven to showcase abstraction and flexibility. Instead of tightly coupling logic to specific classes, the system interacts with devices through shared behavioral contracts.

Project Overview

The program defines two interfaces:
Rechargeble – Represents any device capable of being charged.
Diagnosable – Represents any device capable of running internal diagnostics.


Two concrete classes implement these interfaces:
Smartphone
ElectricCar

Both classes provide their own implementation of charging logic and diagnostics behavior, demonstrating runtime polymorphism.

Core Concepts Demonstrated
This project highlights the following Java principles:

Interface-based abstraction
Multiple interface implementation
Runtime polymorphism
Safe type checking using instanceof
Casting between interface types
Encapsulation of device-specific behavior

Design Explanation

The TechHub class stores objects inside a Rechargeble[] array. This means the system interacts with devices through their charging capability rather than their concrete class type. During iteration:

The charge() method is invoked polymorphically.
The program checks whether the object also implements Diagnosable.
If so, it safely casts the object and runs diagnostics.

This approach allows the system to remain extensible. Any new device that implements Rechargeble can be added without modifying the main loop logic. If it also implements Diagnosable, it automatically gains diagnostic support.

The ElectricCar demonstrates conditional behavior by adjusting its charge rate depending on whether a fast charger is plugged in, reinforcing how different implementations can vary while adhering to the same interface contract.

Sample Execution Flow

When executed, the program:
Initializes devices with starting battery levels
Charges each device for a fixed duration
Runs diagnostics if supported
Displays device-specific output