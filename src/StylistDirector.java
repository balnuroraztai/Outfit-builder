public class StylistDirector {

    public Outfit createOfficeOutfit(OutfitBuilder builder){
        return builder
                .addTop("Button-up shirt")
                .addBottom("Tailored trousers")
                .addShoes("Leather oxfords")
                .addOuterwear("Blazer")
                .addAccessory("Watch")
                .build();
    }

    public Outfit createWeekendOutfit(OutfitBuilder builder){
        return builder
                .addTop("Graphic T-shirt")
                .addBottom("Jeans")
                .addShoes("Sneakers")
                .addAccessory("Cap")
                .build();
    }

    public Outfit createGymOutfit(OutfitBuilder builder){
        return builder
                .addTop("Moisture-wicking tank")
                .addBottom("Athletic shorts")
                .addShoes("Running shoes")
                .addAccessory("Sweatband")
                .build();
    }
}
