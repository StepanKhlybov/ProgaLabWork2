package move;
import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL,0,1.0);
    }
    //уменьшеник стадии спецатаки защищающугося
    @Override protected void applyOppEffects(Pokemon def){
        def.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,-1).turns(-1));
    }
    @Override protected String describe(){
        return "использует Confide";
    }
}
