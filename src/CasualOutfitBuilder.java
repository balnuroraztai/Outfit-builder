public class CasualOutfitBuilder extends OutfitBuilder{
    @Override
    public Outfit build(){
        validateCoreItems();
            this.style=OutfitStyle.CASUAL;
            return new Outfit(this);

    }
}
