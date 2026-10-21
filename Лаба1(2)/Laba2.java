import pokemon.*;
import ru.ifmo.se.pokemon.*;
public class Laba2{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Shellder("Шелдер",7);
        Pokemon p2 = new Passimian("Пассимиан",7);
        Pokemon p3 = new Cloyster("Клойстер",4);
        Pokemon p4 = new Swinub("Свинаб",4);
        Pokemon p5 = new Piloswine("Пилосвайн",8);
        Pokemon p6 = new Mamoswine("Мамосвайн",7);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addAlly(p6);
        b.go();
    }
}