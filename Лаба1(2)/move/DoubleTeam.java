package move;
import ru.ifmo.se.pokemon.*;
public final class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,1.0);
    }
    @Override protected void applySelfEffects(Pokemon att){
        att.addEffect(new Effect().stat(Stat.EVASION,1).turns(-1));
    }
    @Override protected String describe(){
        return "использует DoubleTeam";
    }
}
