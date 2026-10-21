package move;
import ru.ifmo.se.pokemon.*;

public final class SeismicToss extends PhysicalMove{
    public SeismicToss(){
        super(Type.FIGHTING,0,1.0);
    }
    // мощность аттаки равна уровню покемона
    @Override protected double calcBaseDamage(Pokemon att,Pokemon def){
        return att.getLevel();
    }
    @Override protected String describe(){
        return "использует Seismic Toss";
    }
}