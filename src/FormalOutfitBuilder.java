public class FormalOutfitBuilder extends OutfitBuilder{
    private static final int MAX_ACCESSORIES=3;

    @Override
    public Outfit build(){
        validateCoreItems();

        if (outerwear == null){
            throw new IllegalStateException("A formal outfit requires outerwear such as a blazer or suit jacket");

        }
        if (accessories.size()>MAX_ACCESSORIES){
            throw new IllegalStateException("A formal outfit should not exceed"+ MAX_ACCESSORIES+"accessories");
        }
        this.style = OutfitStyle.FORMAL;
        return new Outfit(this);
    }

}
