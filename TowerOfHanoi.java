
public class TowerOfHanoi {
	static void towerOfHanoiimplementation(int no, char from_pole, char to_pole, char auxilliary_pole) {
		if (no==1) {
			System.out.println("Move disk 1 from pole" + from_pole + "to pole " + to_pole);
			return;
		}
	
	towerOfHanoiimplementation(no - 1, from_pole, auxilliary_pole, to_pole);
	System.out.println("Move disk" + no + "from pole" + from_pole + "to pole" + to_pole );
	towerOfHanoiimplementation(no - 1, auxilliary_pole, to_pole, from_pole); 
	}
	
	public static void main(String args[]) {
		int no = 4;
		towerOfHanoiimplementation(no, 'X', 'Y', 'Z');
	}
	
}
