package move;
import ru.ifmo.se.pokemon.*;
public final class Amnesia extends StatusMove{
    public Amnesia(){
        super(Type.PSYCHIC,0,1.0);
    }
    @Override protected void applySelfEffects(Pokemon att){
        att.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE,2).turns(-1));
    }
    @Override protected String describe(){
        return "использует Amnesia";
    }
}
