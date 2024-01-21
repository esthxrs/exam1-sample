package logic.monster;

import logic.attack.Attack;

public class Leader extends Monster{
     int maxChargeTurns;
     int currentChargeTurns;
     boolean isGuard;

    public Leader(String name, int hp, int def, int sp_def, Attack attack, int chargeTurns){
        super(name, hp, def, sp_def, attack);
        setMaxChargeTurns(chargeTurns);
        setCurrentChargeTurns(0);
    }

    public void setCurrentChargeTurns(int currentChargeTurns) {
        this.currentChargeTurns = Math.max(0, currentChargeTurns);
        this.currentChargeTurns = Math.min(getMaxChargeTurns(), getCurrentChargeTurns());
    }

    public boolean isReady(){
        if(currentChargeTurns >= maxChargeTurns){
            return true;
        }
        else {
            return false;
        }
    }

    public int takeDamage(Attack attack){
        int damage = attack.calculateDamage(this);
        if(isGuard) return 0;
        else {
            if(attack.isLeader()){
                setHp(getHp() - damage);
            }
            else {
                setHp((int) (getHp() - Math.ceil(damage*0.5)));
            }
            if(hp <= 0) setDead(true);

            return damage;
        }
    }

    public int getMaxChargeTurns() {
        return maxChargeTurns;
    }

    public void setMaxChargeTurns(int maxChargeTurns) {
        this.maxChargeTurns = maxChargeTurns;
    }

    public int getCurrentChargeTurns() {
        return currentChargeTurns;
    }

    public boolean isGuard() {
        return isGuard;
    }

    public void setGuard(boolean guard) {
        isGuard = guard;
    }
}
