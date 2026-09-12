import java.util.List;
import java.util.Locale;


public class SportyOutfitBuilder extends OutfitBuilder{

    private static final List<String> FORBIDEN_ACCESSORIES= List.of("tie","cufflinks","bow tie");

    @Override
    public OutfitBuilder addAccessory(String accessory){
        if (FORBIDEN_ACCESSORIES.contains(accessory.toLowerCase())){
            throw new IllegalArgumentException(
                    "A sporty outfit cannot inckude a formal accessory:"+accessory
            );
        }
        return super.addAccessory(accessory);
    }
    @Override
    public Outfit build(){
        validateCoreItems();
        this.style=OutfitStyle.SPORTY;
        return new Outfit(this);
    }
}
