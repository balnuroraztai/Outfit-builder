import java.util.Collections;
import java.util.List;


public final class Outfit {
    private final String top;
    private final String bottom;
    private final String shoes;
    private final String outerwear;
    private final List<String> accessories;
    private final OutfitStyle style;



Outfit(OutfitBuilder builder) {
    this.top = builder.top;
    this.bottom = builder.bottom;
    this.shoes = builder.shoes;
    this.outerwear = builder.outerwear;
    this.accessories = Collections.unmodifiableList(builder.accessories);
    this.style = builder.style;
}

public String getTop() {
    return top;
}

public String getBottom() {
    return bottom;
}

public String getShoes() {
    return shoes;
}

public String getOuterwear() {
    return outerwear;
}

public List<String> getAccessories() {
    return accessories;
}

public OutfitStyle getStyle() {
    return style;
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(style).append(" outfit -> ");
    sb.append("top: ").append(top);
    sb.append(", bottom: ").append(bottom);
    sb.append(", shoes: ").append(shoes);
    if (outerwear != null) {
        sb.append(", outerwear: ").append(outerwear);
    }
    if (!accessories.isEmpty()) {
        sb.append(", accessories: ").append(accessories);
    }
    return sb.toString();
}
}
