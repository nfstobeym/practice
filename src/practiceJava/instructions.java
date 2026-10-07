
Case Study:
Assume the role of a system analyst and software engineer for a given IT company.
You are assigned as lead engineer to a new project to simulate the functionality of an Air Fryer that the customer conceptualized.
Air Fryer specification and description:

A basic air fryer is shown below. It basically has a screen display, a control knob or dial, and a basket for the items to be air fried.

 Picture1.png

For this simulation project, the air fryer has a two (2) line text screen display, three (3) control buttons - one for minus "-", another for plus "+" and a power/select "pwr/sel" button.
The +/- button cycles through 5 predefined modes/options - ON, OFF, TIMER, TEMP, FRY.

The pwr/sel button selects the option. The current mode/option must be shown on the the first line left side of the display.
The ON option, turns on the air fryer while the OFF option turns it off.
The display shall turn red if it is ON and yellow if it is OFF. The message "ON" or "OFF" must be shown on the second line centered on the display.

The TIMER option allows the user to set the air fryer timer from 1 to 60 seconds using the +/- buttons. 
The default value of 1 is shown centered in the second line of the display while the "TIMER" mode/option is shown on the first line.
The shown value shall increment/decrement  by one (1) every time the user presses the +/- buttons. The user presses the pwr/sel button to finally set the timer.

The TEMP option allows the user to set the air fryer temperature from 80 to 200 degrees Celsius using the +/- buttons.
The default value of 80 is shown centered in the second line of the display while the "TEMP" mode/option is shown on the first line. 
The shown value shall increment/decrement  by five (5) every time the user presses the +/- buttons. The user presses the pwr/sel button to finally set the temperature.

If the air fryer is already ON and the TIMER and TEMP are now set by the user, then display now shows the "FRY" mode/option in the second line.
The "FRY" mode/option do not appear if the air fryer is OFF, and the TIMER and TEMP were not set by the user.
If the selects the "FRY" mode/option then presses the pwr/sel button, the device starts the frying process.
The motor fan starts turning and the heating element's temperature start rising, and the display shows the timer counting down.
The user can't change the TIMER and TEMP once the frying process starts nor can he turn on the air fryer again.

At any point, the user may turn off the frying process by cycling through the -/+ buttons and selecting OFF.
Otherwise the device runs until the process/time elapse to 0 before automatically turning OFF.
The entire display starts flashing a BLUE color five (5) seconds before the timer reaches 0.

Note that the user can't turn on the device if the power chord is not plugged in the power outlet and the AF basket is also not plugged in to the air fryer.