import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
class DiceGame{
    public static void main(String[] args){
	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
	Random rand = new Random();
	int[] data = new int[2];
	int sum = 0;
	for(int i = 0;i<2;i++){
	int num = rand.nextInt(6)+1;
	data[i] = num;
	sum = sum + data[i];
	}
	

	System.out.println("What is your name?");
	
	String str = null;
	try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	System.out.println("Hello, " + str + "!");
	System.out.println("Rolling the dice...");

	System.out.println("Die 1:" + data[0]);
	System.out.println("Die 2:" + data[1]);

	if(sum >=7) System.out.println(str + "Win!");
	else System.out.println(str + "Lose!");
 
    }
 
}
