package move;
import ru.ifmo.se.pokemon.*;
public final class MudBomb extends SpecialMove{
    public MudBomb(){
        super(Type.GROUND,65,0.85);
    }
    @Override protected void applyOppEffects(Pokemon def){
        if(Math.random()<0.3){
            def.addEffect(new Effect().stat(Stat.ACCURACY,-1).turns(-1));
        }
    }
    @Override protected String describe(){
        return "использует Mud Bomb";
    }
}
