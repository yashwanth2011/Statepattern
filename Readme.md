In an effort to fight climate change our sunblock factory has laid out a new initiative to collect empty sunblock 
bottles which are made out of plastic.

In order to implement this idea our factory decided to place vending machines which collect used empty bottles and 
in return, whoever dropped a used bottle will receive a dollar of cash as a token of appreciation.

The machine can be in one of the 4 states listed below at any give moment:
1) NoBottleState - ready to receive an empty bottle
2) HasBottleState - Input platform is occupied with a bottle, can't work for another till this completes.
3) MoneyDeliveryState - Ready to dispatch money
4) OutOfMoneyState - When all the cash in the machine is cashed out.

Initially before setting up, the machine will be in OutOfMoneyState.
Once setup is done and has valid cash in it, the machine will move to NoBottleState.
After receiving an empty bottle it moves to HasBottleState.
then if user presses the button 'want money' machine will move to MoneyDeliveryState

After several transactions if it runs out of cash it will move to OutOfMoneyState.

The functions this machine can perform are:
1)submitEmptySunblockBottle(); -- collecting the empty bottles
2)wantMoney(); -- user approval to dispatch money through a button
3)dispatch(); -- dispatches money;
4)refill(); -- refills cash in machine once it runs out of it.

However this can be extended, but keeping in mind the scope of assignment I'm pausing with these states and functions.