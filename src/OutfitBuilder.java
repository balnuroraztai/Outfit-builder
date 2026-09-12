import java.util.ArrayList;
import java.util.List;

public abstract class OutfitBuilder {

    protected String top;
    protected String bottom;
    protected String shoes;
    protected String outerwear;
    protected final List<String> accessories = new ArrayList<>();
    protected OutfitStyle style;

    public OutfitBuilder addTop(String top) {
        this.top = top;
        return this;
    }

    public OutfitBuilder addBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    public OutfitBuilder addShoes(String shoes) {
        this.shoes = shoes;
        return this;
    }

    public OutfitBuilder addOuterwear(String outerwear) {
        this.outerwear = outerwear;
        return this;
    }

    public OutfitBuilder addAccessory(String accessory) {
        this.accessories.add(accessory);
        return this;
    }


    public abstract Outfit build();


    protected void validateCoreItems() {
        if (top == null || bottom == null || shoes == null) {
            throw new IllegalStateException(
                    "An outfit must include a top, a bottom and shoes before it can be built.");
        }
    }
}


