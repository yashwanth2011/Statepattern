public class SunblockVendingMachine {

    State hasBottleState;
    State noBottleState;
    State outOfMoneyState;
    State moneyDeliveryState;

    State state = outOfMoneyState;
    int moneyInMachine = 0;

    public SunblockVendingMachine(int moneyForMachine) {
        hasBottleState = new HasBottleState(this);
        noBottleState = new NoBottleState(this);
        outOfMoneyState = new OutOfMoneyState(this);
        moneyDeliveryState = new MoneyDeliveryState(this);

        this.moneyInMachine = moneyForMachine;
        if (moneyForMachine > 0) {
            state = noBottleState;
        } else {
           state = outOfMoneyState;
        }
    }

    public void submitEmptySunblockBottle() {
            state.submitEmptySunblockBottle();
    }

    public void wantMoney() {
            state.wantMoney();
    }

    public void dispatch() {
            state.dispatch();
    }

    void releaseMoney() {
		System.out.println("you just got a dollar");
		if (moneyInMachine > 0) {
			moneyInMachine -= 1;
		}
	}

	public int getMoney() {
        return this.moneyInMachine;
	}

    void refill(int moneyForMachine) {
		this.moneyInMachine += moneyForMachine;
		System.out.println("The Vending machine was just refilled\n Current Balance: $" + this.moneyInMachine);
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}

	public State getState() {
        return state;
    }

    public State getHasBottleState() {
        return hasBottleState;
    }

    public State getNoBottleState() {
        return noBottleState;
    }

    public State getOutOfMoney() {
        return outOfMoneyState;
    }

    public State getMoneyDeliveryState() {
        return moneyDeliveryState;
    }

    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n----------machine status----------");
		result.append("\nRecycle Plastic");
		result.append("\nMachine Balance = $");
		result.append(moneyInMachine);
		result.append("\n");
		result.append(state );
        result.append("\n");
		return result.toString();
	}
}
