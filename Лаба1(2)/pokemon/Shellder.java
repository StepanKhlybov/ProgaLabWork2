package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;
public class Shellder extends Pokemon{
    public Shellder(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(30,65,100,45,25,40);
        setMove(new Confide(),new DoubleTeam(),new AuroraBeam());
    }
}
