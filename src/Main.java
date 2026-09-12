public class Main{
    public static void main(String[] args){

        StylistDirector director = new StylistDirector();

        Outfit officeLook=director.createOfficeOutfit(new FormalOutfitBuilder());
        System.out.println(officeLook);

        Outfit weekendLook = director.createWeekendOutfit(new CasualOutfitBuilder());
        System.out.println(weekendLook);

        Outfit gymLook = director.createGymOutfit(new SportyOutfitBuilder());
        System.out.println(gymLook);

        // Manual fluent chaining, no Director involved
        Outfit customCasual = new CasualOutfitBuilder()
                .addTop("Hoodie")
                .addBottom("Joggers")
                .addShoes("Slip-on sneakers")
                .addAccessory("Beanie")
                .build();
        System.out.println(customCasual);

        // Validation: formal outfit missing mandatory outerwear
        try {
            new FormalOutfitBuilder()
                    .addTop("Shirt")
                    .addBottom("Trousers")
                    .addShoes("Dress shoes")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }

        // Validation: sporty outfit rejecting a formal accessory
        try {
            new SportyOutfitBuilder()
                    .addTop("Tank top")
                    .addBottom("Shorts")
                    .addShoes("Running shoes")
                    .addAccessory("Tie");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }

    }
}

