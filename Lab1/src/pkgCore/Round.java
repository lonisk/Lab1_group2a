package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public pkgCore.eGameResult Round() {
		eGameResult e = null;
		Roll r1 = new Roll();
		rolls.add(r1);
		ComeOutScore= r1.getScore();
		if(ComeOutScore == 2 || ComeOutScore==3||ComeOutScore==12){
			e = eGameResult.CRAPS;
		}
		else if(ComeOutScore == 7 || ComeOutScore == 11){
			e = eGameResult.NATURAL;
		}
		else{
			boolean f = true;
			Roll r2;
			int roll2Score = r2.getScore();
			while(f==true){
				if (roll2Score == ComeOutScore)
					{e = eGameResult.POINT;
					f = false;}
				else if (roll2Score == 7)
					{e = eGameResult.SEVEN_OUT;
					f = false;}
				else
					{Roll r2;
					int roll2Score = r2.getScore();
					f = true;
					}
				
			/*	r2 = new Roll();
				rolls.add(r2);
				if(r2.getScore()==7){
					f =false;
					e = eGameResult.SEVEN_OUT;
				}
				else if(r2.getScore() == ComeOutScore){
					f = false;
					e = eGameResult.POINT;*/
				}
			}
			
		}
		// TODO: Execute Come Out roll, value ComeOutScore
		return e;

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

		// TODO: value the eGameResult after the round is complete
	}

	public int RollCount() {
		// Return the roll count
		return 0;
	}

}
