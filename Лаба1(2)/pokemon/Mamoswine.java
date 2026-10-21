package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Mamoswine extends Piloswine{
    public Mamoswine(String name,int level){
        super(name,level);
        setStats(110,130,80,70,60,80);
        addMove(new ScaryFace());
    }
}
