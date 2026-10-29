# Theme: Smart Home
# Lesson: Strategy Pattern
A Java implementation of the **Strategy Design Pattern** for a smart home lighting system

## Overview
The application demonstrates how different lighting algorithms can be selected and switched at runtime without modifying the context class

## Strategies
- **Normal Lighting** — operates the main lights at full brightness
- **Energy-Saving Lighting** — operates the lights at reduced brightness
- **Night Lighting** — activates dim night lights
- **Motion-Sensor Lighting** — simulates lighting activation when movement is detected

## Project Structure
- `LightingStrategy` - interface defining the common strategy method
- `NormalLightingStrategy` - normal lighting algorithm
- `EnergySavingStrategy` - energy-saving algorithm
- `NightLightingStrategy` - night lighting algorithm
- `MotionSensorLightingStrategy` - motion-sensor lighting algorithm
- `Lighting` - context that delegates execution to the current strategy
- `Main` - client demonstrating strategy selection and runtime switching

## Design Pattern
The Strategy Pattern encapsulates interchangeable algorithms behind a common interface. New strategies can be added without modifying the existing context class
