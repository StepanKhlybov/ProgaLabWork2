package move;
import ru.ifmo.se.pokemon.*;
public final class FrostBreath extends SpecialMove{
    public FrostBreath(){
        super(Type.ICE,60,0.9);
    }
    //любая атака всегда критическая, но множитель до 1.5 вместо 2
    @Override protected double calcCriticalHit(Pokemon att,Pokemon def){
        return 1.5;
    }
    @Override  protected String describe(){
        return "использует Frost Breath";
    }
}
