package move;
import ru.ifmo.se.pokemon.*;
public final class VitalThrow extends PhysicalMove{
    public VitalThrow(){
        super(Type.FIGHTING,70,1.0,-1,1);
    }
    //точность = бесконечности
    @Override protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override protected String describe(){
        return "использует Vital Throw";
    }
}
