# Outfit Builder

**Assignment #1 — Builder Design Pattern**  
**Course:** ShP-2216, Software Design Patterns  
**Astana IT University**

## About the Project

Outfit Builder is a Java project that demonstrates the **Builder Design Pattern** by creating different types of outfits step by step.

An `Outfit` can contain a top, bottom, shoes, optional outerwear, and accessories. Instead of using a large constructor with many parameters, the Builder Pattern allows each component to be added separately using fluent method chaining.

The project provides three different representations of the same `Outfit` product:

- **CasualOutfitBuilder** — creates casual everyday outfits and requires the core items: top, bottom, and shoes.
- **FormalOutfitBuilder** — creates formal outfits, requires outerwear, and limits the number of accessories.
- **SportyOutfitBuilder** — creates athletic outfits and does not allow formal accessories such as ties, cufflinks, and bow ties.

## Builder Pattern Structure

The implementation consists of the following Builder Pattern components:

- **Product:** `Outfit`
- **Builder:** `OutfitBuilder`
- **Concrete Builders:** `CasualOutfitBuilder`, `FormalOutfitBuilder`, `SportyOutfitBuilder`
- **Director:** `StylistDirector`
- **Client:** `Main`
- **Enum:** `OutfitStyle`

The `StylistDirector` provides reusable construction sequences for office, weekend, and gym outfits.

## Project Structure

```text
src/
├── Outfit.java
├── OutfitStyle.java
├── OutfitBuilder.java
├── CasualOutfitBuilder.java
├── FormalOutfitBuilder.java
├── SportyOutfitBuilder.java
├── StylistDirector.java
└── Main.java
```

## Usage

### Manual Builder Usage

An outfit can be created step by step using fluent method chaining:

```java
Outfit customCasual = new CasualOutfitBuilder()
        .addTop("Hoodie")
        .addBottom("Joggers")
        .addShoes("Slip-on sneakers")
        .addAccessory("Beanie")
        .build();
```

### Using the Director

The `StylistDirector` can be used to create predefined outfit configurations:

```java
StylistDirector director = new StylistDirector();

Outfit officeLook =
        director.createOfficeOutfit(new FormalOutfitBuilder());

Outfit weekendLook =
        director.createWeekendOutfit(new CasualOutfitBuilder());

Outfit gymLook =
        director.createGymOutfit(new SportyOutfitBuilder());
```

## Validation Rules

The builders contain validation rules to ensure that valid outfits are created:

- Every outfit must contain a top, bottom, and shoes.
- A formal outfit must contain outerwear.
- A formal outfit can contain a maximum of three accessories.
- A sporty outfit cannot contain formal accessories such as a tie, cufflinks, or bow tie.

If an invalid outfit is created, the builder throws an exception with an appropriate error message.

## How to Run

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Make sure a JDK is configured.
3. Open `src/Main.java`.
4. Run the `main()` method.
5. The created outfits and validation results will be displayed in the console.

### Command Line

Compile the project:

```bash
javac -d out src/*.java
```

Run the application:

```bash
java -cp out Main
```

## Design Pattern Benefits

Using the Builder Pattern in this project:

- Makes the construction of an `Outfit` clear and readable.
- Supports fluent method chaining.
- Allows different representations of the same product.
- Separates object construction from the final `Outfit` object.
- Makes it easy to add new outfit builders in the future.