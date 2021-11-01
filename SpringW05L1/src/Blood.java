/* develop an application that allows a user to enter their age and blood type. 
 * The app will then display a message outlining which blood groups the user 
 * can donate to and receive from. Please note that only 18+ can donate. public 
 * 
 * input: users enter their age and blood type
 * process: compute which blood groups the user can donate to and receive from.
 * 				based on given blood type table. Note that only 18+ can donate
 * output: display a message outlining which blood groups the user 
 * 				can donate to and receive from
*/

 class Blood {
		////INPUT
		//declare vars
		private int userAge;
		private String bloodType, msgGive, msgReceive;
		
		//constructor
		public Blood() {
				userAge = 0;
				bloodType = "";
				msgGive = "You can give blood to";
				msgReceive = "You can receive blood from";
		}
		
		//set method
		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}
		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}
		
		////PROCESS
		//compute
		public void computeMessage() {
				if(bloodType .equalsIgnoreCase("AB")) {
						msgGive += " AB type only.";
						msgReceive += " AB, A, B and 0 types.";
				}
				else if(bloodType .equalsIgnoreCase("A")) {
						msgGive +=" A and AB types.";
						msgReceive += " A and 0 types.";
				}
				else if(bloodType .equalsIgnoreCase("B")) {
					msgGive += " B and AB types.";
					msgReceive += " B and 0 types.";
				}
				else if(bloodType .equalsIgnoreCase("0")) {
					msgGive += " AB, A, B and O types.";
					msgReceive += " 0 type only.";
				}
				else {
					msgGive = "";
					msgReceive = "You entered wrong blood type.";
				}
				
				if(userAge < 18) {
					msgGive = "You must be over 18 to donate blood.";
				}
		}
		
		////OUTPUT
		//get method
		public String getMessage() {
			  return msgGive + "\n" + msgReceive;
		}
}
