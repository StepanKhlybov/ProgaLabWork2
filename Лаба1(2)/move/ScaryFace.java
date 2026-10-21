package move;
import ru.ifmo.se.pokemon.*;
public final class ScaryFace extends StatusMove{
    public ScaryFace(){
        super(Type.NORMAL,0,1.0);
    }
    @Override protected void applyOppEffects(Pokemon def){
        def.addEffect(new Effect().stat(Stat.SPEED,-2).turns(-1));
    }
    @Override protected String describe(){
        return "использует Scary Face";
    }
}
