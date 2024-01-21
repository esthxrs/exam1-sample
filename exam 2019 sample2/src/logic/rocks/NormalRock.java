package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    protected int damage;
    public NormalRock(int damage){
        setDamage(damage);
    }
    public void setDamage(int damage){
        this.damage = Math.max(0, damage);
    }
    public int getDamage(){
        return damage;
    }
    public int dealDamage(Zombie zombie){
        if(zombie.getDefense() >= getDamage()){
            zombie.setHealth(zombie.getHealth()+0);
            return 0;
        }
        else {
            int zombieDefense;
            zombieDefense = getDamage() - zombie.getDefense();
            zombie.setHealth(zombie.getHealth() - zombieDefense);
            return getDamage() - zombie.getDefense();
        }
    }
    public String toString(){
        return "Normal Rock (" + getDamage() + ")";
    }
}
