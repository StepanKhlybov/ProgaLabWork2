package move;
import ru.ifmo.se.pokemon.*;

public final class AuroraBeam extends SpecialMove{
    public AuroraBeam(){
        super(Type.ICE,65,1.0);
    }
    @Override protected void applyOppEffects(Pokemon def){
        if(Math.random()<0.1){
            def.addEffect(new Effect().stat(Stat.ATTACK,-1).turns(-1) );
        }
    }
    @Override protected String describe(){
        return "использует Aurora Beam";
    }
}
