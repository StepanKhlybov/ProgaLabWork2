package move;
import ru.ifmo.se.pokemon.*;
public final class PowderSnow extends SpecialMove{
    public PowderSnow(){
        super(Type.ICE,40,1.0);
    }
    @Override protected void applyOppEffects(Pokemon def){
        if(Math.random()<0.1){
            Effect.freeze(def);
        }
    }
    @Override protected String describe(){
        return "использует Powder Snow";
    }
}
