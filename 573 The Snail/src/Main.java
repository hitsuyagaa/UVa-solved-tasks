import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int heightOfWell = in.nextInt();
			int climbingSpeed = in.nextInt();
			int slideDownSpeed = in.nextInt();
			int fatigueAfterDay = in.nextInt();
			String out = "failure on day ";
			int days = 0;
			double fatiguedClimbingSpeed = climbingSpeed, distanceClimbed = 0;
			
			if(heightOfWell == 0) break;
			
			do{
				
				days++;
				distanceClimbed += fatiguedClimbingSpeed;
				
				fatiguedClimbingSpeed = fatiguedClimbingSpeed - (((double)climbingSpeed / 100) * (double)fatigueAfterDay);
				if(fatiguedClimbingSpeed <= 0) fatiguedClimbingSpeed = 0;
				
				// So it always is at 2 decimal points because floating point calculation is weird
				fatiguedClimbingSpeed = Math.round(fatiguedClimbingSpeed*100.0)/100.0;
				if(distanceClimbed > heightOfWell){
					out = "success on day ";
					break;
				}
				
				//always at 2 decimal points
				distanceClimbed = Math.round(distanceClimbed*100.0)/100.0;
				distanceClimbed = distanceClimbed - slideDownSpeed;
				//always at 2 decimal points
				distanceClimbed = Math.round(distanceClimbed*100.0)/100.0;
			}while(distanceClimbed >= 0);
			System.out.println(out + days);
		}
	}

}
