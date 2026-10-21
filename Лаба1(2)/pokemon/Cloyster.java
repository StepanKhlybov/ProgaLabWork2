package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public final class Cloyster extends Shellder{
    public Cloyster(String name,int level){
        super(name,level);
        setStats(50,95,180,85,45,70);
        addType(Type.ICE);
        addMove(new FrostBreath());
    }
}
