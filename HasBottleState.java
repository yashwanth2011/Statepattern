public class HasBottleState implements State {
        SunblockVendingMachine sunblockVendingMachine;

        public HasBottleState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
        }

        public void submitEmptySunblockBottle() {
            System.out.println("ONE BOTTLE AT A TIME");
        }

        public void wantMoney() {
            System.out.println("pressed 'want money'...");
            sunblockVendingMachine.setState(sunblockVendingMachine.getMoneyDeliveryState());
		}

		public void dispatch() {
            System.out.println("money can't be dispatched without pressing 'want money'");
		}

		public void refill() { }

		public String toString() {
            return "whenever you are ready (press 'want money' button)";
        }
}
