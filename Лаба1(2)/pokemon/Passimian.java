package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public final class Passimian extends Pokemon{
    public Passimian(String name,int level){
        super(name,level);
        setType(Type.FIGHTING);
        setStats(100,120,90,40,60,80);
        setMove(new BrutalSwing(),new VitalThrow(),new SeismicToss(),new TakeDown());
    }
}