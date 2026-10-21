package move;
import ru.ifmo.se.pokemon.*;

public final class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL,90,0.85);
    }
    //атакующий покемон получает четверть нанесённого урона
    @Override protected void applySelfDamage(Pokemon att,double damage){
        att.setMod(Stat.HP,(int) Math.round(damage/4.0));
    }
    @Override protected String describe(){
        return "использовал Take Down";
    }
}
