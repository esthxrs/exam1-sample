package logic.attack;
import logic.monster.Monster;
import logic.attack.Attack;

public class SPAttack extends Attack{
    private int power;
    private String name;
    private boolean isLeader;

    public SPAttack(int power, String name,boolean isLeader){
        super(power, name, isLeader);
    }

    public int calculateDamage (Monster target){
        int damage = this.getPower() - target.getSpecialDefense();
        return Math.max(0, damage);
    }
}
