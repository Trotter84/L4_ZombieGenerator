package edu.neumont.csc150.models;

public class Runner extends Zombie {
    private int climbSpeed; // 1/3 of speed, rounded down

    public Runner() {
        setBaseHP(random.nextInt(10, 23));
        setSpeed(random.nextInt(15, 26));
        setClimbSpeed(getSpeed());
    }


//region ================= GETTERS//SETTERS =================

    public int getClimbSpeed() {
        return climbSpeed;
    }

    private void setClimbSpeed(int speed) {
        this.climbSpeed = Math.round((long) (speed * 0.33));
    }

//endregion

    @Override
    public Attack attack(int attackRoll) {
        if (attackRoll >= 19) {
            return attack = new Attack(roll(2, 8) * 2, AttackType.CRIT);
        } else if (attackRoll >= 5 && attackRoll < 19) {
            return attack = new Attack(roll(3, 6), AttackType.NORMAL);
        } else {
            return attack = new Attack(0, AttackType.MISS);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\t\u2524 " + super.toString() + " \u2502 " + "Climb Speed \u2509 " + getClimbSpeed() + " \u251C";
    }
}
