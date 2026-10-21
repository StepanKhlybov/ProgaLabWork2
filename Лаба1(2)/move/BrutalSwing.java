package move;
import ru.ifmo.se.pokemon.*;
public final class BrutalSwing extends PhysicalMove{
    public BrutalSwing(){
        super(Type.DARK,60,1.0);
    }
    @Override protected String describe(){
        return "использует Brutal Swing";
    }
}
